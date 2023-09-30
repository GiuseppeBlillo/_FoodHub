package java13g3.foodHub.entities.enumerations;

public enum CuisineTypeEnum {
    ITALIAN(1),
    CHINESE(2),
    JAPANESE(3),
    INDIAN(4),
    THAI(5),
    MEXICAN(6),
    GOURMET(7),
    FUSION(8),
    VEGETARIAN(9),
    VEGAN(0);

    private Integer cuisineType;

    CuisineTypeEnum(Integer cuisineType) {
        this.cuisineType = cuisineType;
    }

    public Integer getCuisineType() {
        return cuisineType;
    }

    public void setCuisineType(Integer cuisineType) {
        this.cuisineType = cuisineType;
    }
}
