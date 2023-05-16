import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String name;
    private List<Portata> portataList;
    private List<Bevanda> bevandaList;

    /*public void printPortata(){
        for (Portata i : getPortataList()){
            System.out.println(i.getName() +" "+ i.getPrice() + "€");
        }
    }
    public void printBevanda(){
        for (Bevanda i : getBevandaList()){
            System.out.println(i.getName() +" "+ i.getPrice() + "€");
        }
    }

     */
    public void addBevanda(Bevanda x){
        this.bevandaList.add(x);
    }
    public void addPortata(Portata p) {
        this.portataList.add(p);
    }
    public Menu(String name) {
        this.name = name;
        this.portataList = new ArrayList<>();
        this.bevandaList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Portata> getPortataList() {
        return portataList;
    }

    public void setPortataList(List<Portata> menu) {
        this.portataList = menu;
    }

    public List<Bevanda> getBevandaList() {
        return bevandaList;
    }

    public void setBevandaList(List<Bevanda> bevandaList) {
        this.bevandaList = bevandaList;
    }
}
