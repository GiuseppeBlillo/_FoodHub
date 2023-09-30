package java13g3.foodHub.entities;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import java13g3.foodHub.entities.enumerations.MenuTypeEnum;

import java.util.List;

@Entity
@Table(name = "MENU")
public class Menu{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "CHEF")
    private String chef;
    @Column(name = "AVERAGE_PRICE")
    private Double averagePrice;
    @Column(name ="MENU_TYPE")
    private MenuTypeEnum menuTypeEnum;
    @OneToMany
    @JoinColumn(name = "MENU_ID")
    private List<Meal> mealList;

    public Menu() {
    }

    public Menu(String name, String chef, Double averagePrice, MenuTypeEnum menuTypeEnum, List<Meal> mealList) {
        this.name = name;
        this.chef = chef;
        this.averagePrice = averagePrice;
        this.menuTypeEnum = menuTypeEnum;
        this.mealList = mealList;
    }

    public Menu(String name, String chef, Double averagePrice, MenuTypeEnum menuTypeEnum) {
        this.name = name;
        this.chef = chef;
        this.averagePrice = averagePrice;
        this.menuTypeEnum = menuTypeEnum;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChef() {
        return chef;
    }

    public void setChef(String chef) {
        this.chef = chef;
    }

    public Double getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(Double averagePrice) {
        this.averagePrice = averagePrice;
    }

    public MenuTypeEnum getMenuTypeEnum() {
        return menuTypeEnum;
    }

    public void setMenuTypeEnum(MenuTypeEnum menuTypeEnum) {
        this.menuTypeEnum = menuTypeEnum;
    }

    public List<Meal> getMealList() {
        return mealList;
    }

    public void setMealList(List<Meal> mealList) {
        this.mealList = mealList;
    }
}
