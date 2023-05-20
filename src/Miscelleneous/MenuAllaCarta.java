package Miscelleneous;

import ProdottiInVendita.*;
import java.util.ArrayList;
import java.util.List;


public class MenuAllaCarta {
    private String name;
    private List<Portata> portataList;

    public MenuAllaCarta(String name) {
        this.name = name;
        this.portataList = new ArrayList<>();
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

    public void addPortata(Portata p) {
        this.portataList.add(p);
    }
    public void printMenuSpecifico(){
    System.out.println("\033[0;1m" + "\u001B[33m" + "\"•._.••´¯``•.¸¸.•`La lista di portate scelte è la seguente`•.¸¸.•´´¯`••._.• ".toUpperCase() + "\u001B[0m");
    System.out.println("");
      for (Portata p : getPortataList()){
          System.out.println(String.format("%-50s %-80s %9s\n", p.getName().toUpperCase(), " ", String.format("%.2f", p.getPrice()) + " €") + "\033[3m" + p.getDescription() + "\033[0m\n\n");
      }
}

}
