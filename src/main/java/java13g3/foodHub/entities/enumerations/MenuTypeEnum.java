package java13g3.foodHub.entities.enumerations;

public enum MenuTypeEnum {
    MEAT(1),
    FISH(2),
    VEGAN(3),
    VEGETARIAN(4);

    private Integer menuType;

    MenuTypeEnum(Integer menuType) {
        this.menuType = menuType;
    }

    public Integer getMenuType() {
        return menuType;
    }

    public void setMenuType(Integer menuType) {
        this.menuType = menuType;
    }
}
