package java13g3.foodHub.controllers;

import java13g3.foodHub.entities.Menu;
import java13g3.foodHub.services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/menu")
public class MenuController {
    @Autowired
    private MenuService menuService;

    @PostMapping("/create")
    public ResponseEntity<Menu> createMenu(@RequestBody Menu menu) {
        return ResponseEntity.ok(menuService.createmenu(menu));
    }


    @GetMapping("/retrieve")
    public ResponseEntity<List<Menu>> getAllMenu() {
        if(!menuService.getMenus().isEmpty()){
            return ResponseEntity.ok(menuService.getMenus());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/retrieve/{id}")
    public ResponseEntity<Optional<Menu>> getMenuById(@PathVariable("id") Long id) {
        if(menuService.getMenuById(id).isPresent()){
            return ResponseEntity.ok(menuService.getMenuById(id));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Optional<Menu>> updateMenuById(@PathVariable("id") Long id, @RequestBody Menu menu) {
        if (menuService.getMenuById(id).isPresent()) {
            return ResponseEntity.ok(menuService.updateMenuById(id, menu));
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteMenuById(@PathVariable("id") Long id) {
        if (menuService.getMenuById(id).isPresent()) {
            menuService.deleteMenuById(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }

}