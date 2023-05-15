import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String name;
    private List<Portata> portataList;

    public Menu(String name) {
        this.name = name;
        this.portataList= new ArrayList<>();
    }

    public void printPortata(){
        for (Portata i : getPortataList()){
            System.out.println(i.getName() +" "+ i.getPrice() + "€");
        }
    }

    public void addPortata (Portata p){
        this.portataList.add(p);
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

    public void setPortataList(List<Portata> portataList) {
        this.portataList = portataList;
    }

}
