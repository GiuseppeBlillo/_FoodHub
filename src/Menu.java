import ProdottiInVendita.Prodotto;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String name;
    private List<Prodotto> prodottoList;

    public Menu(String name) {
        this.name = name;
        this.prodottoList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Prodotto> getProdottoList() {
        return prodottoList;
    }

    public void setProdottoList(List<Prodotto> prodottoList) {
        this.prodottoList = prodottoList;
    }

    public void addProdotto(Prodotto p) {
        this.prodottoList.add(p);
    }
}
