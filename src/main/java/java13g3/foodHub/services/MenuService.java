package java13g3.foodHub.services;

import java13g3.foodHub.entities.Menu;
import java13g3.foodHub.repositories.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MenuService {

    @Autowired
    private MenuRepository menuRepository;

    public Menu createmenu(Menu menu){
        return menuRepository.save(menu);
    }

    public List<Menu> getMenus() {
        return menuRepository.findAll();
    }

    public Optional<Menu> getMenuById(Long id){
        return menuRepository.findById(id);
    }

    public Optional<Menu> updateMenuById(Long id, Menu updatemenu){
        Optional<Menu> menuTemp = menuRepository.findById(id);
        if (menuTemp.isPresent()){
            Menu temp = menuTemp.get();
            temp.setName(updatemenu.getName());
            temp.setAveragePrice(updatemenu.getAveragePrice());
            temp.setChef(updatemenu.getChef());
            temp.setMealList(updatemenu.getMealList());
            temp.setMenuTypeEnum(updatemenu.getMenuTypeEnum());
            menuRepository.save(temp);
            return Optional.of(temp);
        } else {
            return Optional.empty();
        }
    }

    public void deleteMenuById(Long id){
        menuRepository.deleteById(id);
    }
}
