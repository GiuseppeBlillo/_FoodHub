package java13g3.foodHub.controllers;

import java13g3.foodHub.entities.Meal;
import java13g3.foodHub.services.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/meal")
public class MealController {
    @Autowired
    private MealService mealService;

    @PostMapping("/create")
    public ResponseEntity<Meal> createMeal(@RequestBody Meal meal) {
        return ResponseEntity.ok(mealService.createMeal(meal));
    }


    @GetMapping("/retrieve")
    public ResponseEntity<List<Meal>> getAllmeal() {
        if(!mealService.getMeals().isEmpty()){
            return ResponseEntity.ok(mealService.getMeals());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/retrieve/{id}")
    public ResponseEntity<Optional<Meal>> getmealById(@PathVariable("id") Long id) {
        if(mealService.getMealById(id).isPresent()){
            return ResponseEntity.ok(mealService.getMealById(id));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Optional<Meal>> updatemealById(@PathVariable("id") Long id, @RequestBody Meal meal) {
        if (mealService.getMealById(id).isPresent()) {
            return ResponseEntity.ok(mealService.updateMealById(id, meal));
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deletemealById(@PathVariable("id") Long id) {
        if (mealService.getMealById(id).isPresent()) {
            mealService.deleteMealById(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }

}
