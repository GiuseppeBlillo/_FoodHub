package enumerations;

/**
 * Classe enum che gestisce i colori utilizzati nella creazione del menu
 */
public enum ColoriEnum {

    ANSI_RESET ("\u001B[0m","Ti resetta al colore classico"),

    BLACK_BACKGROUND  ("\u001B[40m", "Questo cambia lo sfondo in Nero"),
    RED_BACKGROUND  ("\u001B[41m", "Questo cambia lo sfondo in Rosso"),
    GREEN_BACKGROUND  ("\u001B[42m", "Questo cambia lo sfondo in Verde"),
    YELLOW_BACKGROUND  ("\u001B[43m", "Questo cambia lo sfondo in Giallo"),
    BLUE_BACKGROUND  ("\u001B[44m", "Questo cambia lo sfondo in Blu"),
    PURPLE_BACKGROUND  ("\u001B[45m", "Questo cambia lo sfondo in Porpora"),
    CYAN_BACKGROUND  ("\u001B[46m", "Questo cambia lo sfondo in Ciano"),
    WHITE_BACKGROUND  ("\u001B[47m", "Questo cambia lo sfondo in Bianco"),

    BLACK  ("\033[0;30m", "Questo cambia il colore della scritta in Nero"),
    RED  ("\033[0;31m", "Questo cambia il colore della scritta in Rosso"),
    GREEN  ("\033[0;32m", "Questo cambia il colore della scritta in Verde"),
    YELLOW  ("\033[0;33m", "Questo cambia il colore della scritta in Giallo"),
    BLUE  ("\033[0;34m", "Questo cambia il colore della scritta in Blu"),
    PURPLE  ("\033[0;35m", "Questo cambia il colore della scritta in Portata"),
    CYAN  ("\033[0;36m", "Questo cambia il colore della scritta in Ciano"),
    WHITE  ("\033[0;37m", "Questo cambia il colore della scritta in Bianco"),

    MAIUSC_BLACK  ("\033[3;30m", "Questo cambia il colore in Nero della scritta e lo mette in maiuscolo "),
    MAIUSC_RED  ("\033[3;31m", "Questo cambia il colore in Rosso della scritta e lo mette in maiuscolo "),
    MAIUSC_GREEN  ("\033[3;32m", "Questo cambia il colore in Verde della scritta e lo mette in maiuscolo "),
    MAIUSC_YELLOW  ("\033[3;33m", "Questo cambia il colore in Giallo della scritta e lo mette in maiuscolo "),
    MAIUSC_BLUE ("\033[3;34m", "Questo cambia il colore in Blu della scritta e lo mette in maiuscolo "),
    MAIUSC_PURPLE  ("\033[3;35m", "Questo cambia il colore in Porpora della scritta e lo mette in maiuscolo "),
    MAIUSC_CYAN  ("\033[3;36m", "Questo cambia il colore in Ciano della scritta e lo mette in maiuscolo "),
    MAIUSC_WHITE  ("\033[3;37m", "Questo cambia il colore in Bianco della scritta e lo mette in maiuscolo "),


    BLACK_BOLD  ("\033[1;30m", "Questo cambia il colore in Nero della scritta e lo mette in grassetto "),
    RED_BOLD  ("\033[1;31m", "Questo cambia il colore in Rosso della scritta e lo mette in grassetto "),
    GREEN_BOLD  ("\033[1;32m", "Questo cambia il colore in Verde della scritta e lo mette in grassetto "),
    YELLOW_BOLD  ("\033[1;33m", "Questo cambia il colore in Giallo della scritta e lo mette in grassetto "),
    BLUE_BOLD  ("\033[1;34m", "Questo cambia il colore in Blu della scritta e lo mette in grassetto "),
    PURPLE_BOLD  ("\033[1;35m", "Questo cambia il colore in Porpora della scritta e lo mette in grassetto "),
    CYAN_BOLD  ("\033[1;36m", "Questo cambia il colore in Ciano della scritta e lo mette in grassetto "),
    WHITE_BOLD  ("\033[1;37m", "Questo cambia il colore in Bianco della scritta e lo mette in grassetto "),

    BLACK_UNDERLINED  ("\033[4;30m", "Questo cambia il colore in Nero della scritta e lo mette sottolineato "),
    RED_UNDERLINED  ("\033[4;31m", "Questo cambia il colore in Rosso della scritta e lo mette sottolineato "),
    GREEN_UNDERLINED  ("\033[4;32m", "Questo cambia il colore in Verde della scritta e lo mette sottolineato "),
    YELLOW_UNDERLINED  ("\033[4;33m", "Questo cambia il colore in Giallo della scritta e lo mette sottolineato "),
    BLUE_UNDERLINED  ("\033[4;34m", "Questo cambia il colore in Blu della scritta e lo mette sottolineato "),
    PURPLE_UNDERLINED  ("\033[4;35m", "Questo cambia il colore in Porpora della scritta e lo mette sottolineato "),
    CYAN_UNDERLINED  ("\033[4;36m", "Questo cambia il colore in Ciano della scritta e lo mette sottolineato "),
    WHITE_UNDERLINED  ("\033[4;37m", "Questo cambia il colore in Bianco della scritta e lo mette sottolineato ");

    private String ANSI_Code;
    private String description;

    /**
     * costruttore che prende in input una String ANSI_Code, una String description e ritorna un oggetto di classe
     * ColoriEnum
     * @param ANSI_Code
     * @param description
     */
    ColoriEnum(String ANSI_Code, String description) {
        this.ANSI_Code = ANSI_Code;
        this.description = description;
    }

    public String getANSI_Code() {
        return ANSI_Code;
    }

    public String getDescription() {
        return description;
    }
}
