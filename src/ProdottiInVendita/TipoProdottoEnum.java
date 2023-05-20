package ProdottiInVendita;

public enum TipoProdotto {
    ANTIPASTO("antipasto"),
    PRIMO("primo"),
    SECONDO("secondo"),
    DESSERT("dessert"),
    BEVANDA("bevanda");

    private String tipoProdotto;

    TipoProdotto(String tipoProdotto) {
        this.tipoProdotto = tipoProdotto;
    }

    public String getTipoProdotto() {
        return tipoProdotto;
    }

    public void setTipoProdotto(String tipoProdotto) {
        this.tipoProdotto = tipoProdotto;
    }
}
