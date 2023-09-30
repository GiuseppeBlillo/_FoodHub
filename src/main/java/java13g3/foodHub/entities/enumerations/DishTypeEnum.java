package java13g3.foodHub.entities.enumerations;

public enum DishTypeEnum {
   STARTER(1),
    FIRST_COURSE(2),
    SECOND_COURSE(3),
    DESSERT(4),
    DRINK(5);

   private final Integer type;

    DishTypeEnum(Integer type) {
        this.type = type;
    }

    public Integer getType() {
        return type;
    }
}
