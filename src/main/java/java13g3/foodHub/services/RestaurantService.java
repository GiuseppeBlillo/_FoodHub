package java13g3.foodHub.services;

import java13g3.foodHub.entities.Restaurant;
import java13g3.foodHub.repositories.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

    public Restaurant createRestaurant(Restaurant restaurant){
        return restaurantRepository.save(restaurant);
    }

    public List<Restaurant> getRestaurants() {
        return restaurantRepository.findAll();
    }

    public Optional<Restaurant> getRestaurantById(Long id){
        return restaurantRepository.findById(id);
    }

    public Optional<Restaurant> updateRestaurantById(Long id, Restaurant updateRestaurant){
        Optional<Restaurant> restTemp = restaurantRepository.findById(id);
        if (restTemp.isPresent()){
            Restaurant temp = restTemp.get();
            temp.setName(updateRestaurant.getName());
            temp.setCover(updateRestaurant.getCover());
            temp.setCuisineTypeEnum(updateRestaurant.getCuisineTypeEnum());
          //  temp.setMenuList(updateRestaurant.getMenuList());
            restaurantRepository.save(temp);
            return Optional.of(temp);
        } else {
            return Optional.empty();
        }
    }

    public void deleteRestaurantById(Long id){
        restaurantRepository.deleteById(id);
    }
}
