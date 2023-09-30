package java13g3.foodHub.services;

import java13g3.foodHub.entities.Meal;
import java13g3.foodHub.repositories.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MealService {

    @Autowired
    private MealRepository mealRepository;

    public Meal createMeal(Meal meal){
        return mealRepository.save(meal);
    }

    public List<Meal> getMeals() {
        return mealRepository.findAll();
    }

    public Optional<Meal> getMealById(Long id){
        return mealRepository.findById(id);
    }

    public Optional<Meal> updateMealById(Long id, Meal updatemeal){
        Optional<Meal> mealTemp = mealRepository.findById(id);
        if (mealTemp.isPresent()){
            Meal temp = mealTemp.get();
            temp.setName(updatemeal.getName());
            temp.setDescription(updatemeal.getDescription());
            temp.setPrice(updatemeal.getPrice());
            temp.setType(updatemeal.getType());
            mealRepository.save(temp);
            return Optional.of(temp);
        } else {
            return Optional.empty();
        }
    }

    public void deleteMealById(Long id){
        mealRepository.deleteById(id);
    }
}
