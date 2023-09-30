package java13g3.foodHub.services;

import java13g3.foodHub.entities.Customer;
import java13g3.foodHub.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer createCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    public Optional<Customer> getCustomerById(Long id){
        return customerRepository.findById(id);
    }

    public Optional<Customer> updateCustomerById(Long id, Customer updateCustomer){
        Optional<Customer> cusTemp = customerRepository.findById(id);
        if (cusTemp.isPresent()){
            Customer temp = cusTemp.get();
            temp.setName(updateCustomer.getName());
            temp.setSurname(updateCustomer.getSurname());
            temp.setAge(updateCustomer.getAge());
            temp.setAddress(updateCustomer.getAddress());
            customerRepository.save(temp);
            return Optional.of(temp);
        } else {
            return Optional.empty();
        }
    }

    public void deleteCustomerById(Long id){
        customerRepository.deleteById(id);
    }
}
