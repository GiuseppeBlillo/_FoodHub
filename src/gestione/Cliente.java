package gestione;

/**
 * Classe pubblica che gestisce il Cliente e che ha nei propri fields una stringa name, string surname, un record
 * di indirizzo e un Integer età.
 */
public class Cliente {
    private String name;
    private String surname;
    private IndirizzoRecord address;
    private Integer age;

    /**
     *
     * @param name
     * @param surname
     * @param age
     */
    /**
     * costruttore che prende in imput i fields della classe Cliente, che restituisce un oggetto di classe Cliente
     * @param name
     * @param surname
     * @param age
     */
    public Cliente(String name, String surname, Integer age) {
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
