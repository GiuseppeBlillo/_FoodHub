package ProdottiInVendita;

public enum TipoProdottoEnum {
    ANTIPASTO("antipasto"),
    PRIMO("primo"),
    SECONDO("secondo"),
    DESSERT("dessert"),
    BEVANDA("bevanda");

    private String tipoProdotto;

    TipoProdottoEnum(String tipoProdotto) {
        this.tipoProdotto = tipoProdotto;
    }

    public String getTipoProdotto() {
        return tipoProdotto;
    }

    public void setTipoProdotto(String tipoProdotto) {
        this.tipoProdotto = tipoProdotto;
    }
}
