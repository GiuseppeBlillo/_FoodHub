package java13g3.foodHub.controllers;

import java13g3.foodHub.entities.Customer;
import java13g3.foodHub.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping("/create")
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer Customer) {
        return ResponseEntity.ok(customerService.createCustomer(Customer));
    }


    @GetMapping("/retrieve")
    public ResponseEntity<List<Customer>> getAllCustomer() {
        if(!customerService.getCustomers().isEmpty()){
            return ResponseEntity.ok(customerService.getCustomers());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/retrieve/{id}")
    public ResponseEntity<Optional<Customer>> getCustomerById(@PathVariable("id") Long id) {
        if(customerService.getCustomerById(id).isPresent()){
            return ResponseEntity.ok(customerService.getCustomerById(id));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Optional<Customer>> updateCustomerById(@PathVariable("id") Long id, @RequestBody Customer Customer) {
        if (customerService.getCustomerById(id).isPresent()) {
            return ResponseEntity.ok(customerService.updateCustomerById(id, Customer));
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteCustomerById(@PathVariable("id") Long id) {
        if (customerService.getCustomerById(id).isPresent()) {
            customerService.deleteCustomerById(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }

}

