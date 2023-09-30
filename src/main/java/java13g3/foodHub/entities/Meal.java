package java13g3.foodHub.entities;

import java13g3.foodHub.entities.enumerations.DishTypeEnum;
import jakarta.persistence.*;

@Entity
public class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private Double price;
    @Column
    private DishTypeEnum type;

    public Meal(String name, String description, Double price, DishTypeEnum type) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.type = type;
    }

    public Meal() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public DishTypeEnum getType() {
        return type;
    }

    public void setType(DishTypeEnum type) {
        this.type = type;
    }
}