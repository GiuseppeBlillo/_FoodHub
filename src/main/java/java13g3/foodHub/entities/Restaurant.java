package java13g3.foodHub.entities;

import java13g3.foodHub.entities.enumerations.CuisineTypeEnum;
import jakarta.persistence.*;


import java.util.List;

@Entity
public class Restaurant{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String name;
    @Enumerated(EnumType.STRING)
    @Column
    private CuisineTypeEnum cuisineTypeEnum;
    @OneToMany
    @JoinColumn(name = "RESTAURANT_ID")
    private List<Menu> menuList;
    @Column
    private Integer cover;

    public Restaurant(String name, CuisineTypeEnum cuisineTypeEnum, List<Menu> menuList, Integer cover) {
        this.name = name;
        this.cuisineTypeEnum = cuisineTypeEnum;
        this.menuList = menuList;
        this.cover = cover;
    }

    public Restaurant() {
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

    public CuisineTypeEnum getCuisineTypeEnum() {
        return cuisineTypeEnum;
    }

    public void setCuisineTypeEnum(CuisineTypeEnum cuisineTypeEnum) {
        this.cuisineTypeEnum = cuisineTypeEnum;
    }

    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }

    public Integer getCover() {
        return cover;
    }

    public void setCover(Integer cover) {
        this.cover = cover;
    }
}


