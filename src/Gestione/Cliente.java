package Gestione;

public class Cliente {
    private String name;
    private String surname;
    private IndirizzoRecord address;
    private int age;

    /**
     *
     * @param name
     * @param surname
     * @param age
     */
    public Cliente(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public IndirizzoRecord getAddress() {
        return address;
    }

    public void setAddress(IndirizzoRecord address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
