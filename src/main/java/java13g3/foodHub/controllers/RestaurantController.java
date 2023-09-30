package java13g3.foodHub.controllers;

import java13g3.foodHub.entities.Restaurant;
import java13g3.foodHub.services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {
    @Autowired
    private RestaurantService restaurantService;

    @PostMapping("/create")
    public ResponseEntity<Restaurant> createRestaurant(@RequestBody Restaurant restaurant) {
        return ResponseEntity.ok(restaurantService.createRestaurant(restaurant));
    }


    @GetMapping("/retrieve")
    public ResponseEntity<List<Restaurant>> getAllRestaurant() {
        if(!restaurantService.getRestaurants().isEmpty()){
            return ResponseEntity.ok(restaurantService.getRestaurants());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/retrieve/{id}")
    public ResponseEntity<Optional<Restaurant>> getRestaurantById(@PathVariable("id") Long id) {
        if(restaurantService.getRestaurantById(id).isPresent()){
            return ResponseEntity.ok(restaurantService.getRestaurantById(id));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Optional<Restaurant>> updateRestaurantById(@PathVariable("id") Long id, @RequestBody Restaurant restaurant) {
        if (restaurantService.getRestaurantById(id).isPresent()) {
            return ResponseEntity.ok(restaurantService.updateRestaurantById(id, restaurant));
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteRestaurantById(@PathVariable("id") Long id) {
        if (restaurantService.getRestaurantById(id).isPresent()) {
            restaurantService.deleteRestaurantById(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }

}