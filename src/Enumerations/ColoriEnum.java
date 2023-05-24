package Enumerations;

public enum ColoriEnum {

    //TODO inserire la descrizione del colore
    ANSI_RESET ("\u001B[0m"),

    BLACK_BACKGROUND  ("\u001B[40m"),
    RED_BACKGROUND  ("\u001B[41m"),
    GREEN_BACKGROUND  ("\u001B[42m"),
    YELLOW_BACKGROUND  ("\u001B[43m"),
    BLUE_BACKGROUND  ("\u001B[44m"),
    PURPLE_BACKGROUND  ("\u001B[45m"),
    CYAN_BACKGROUND  ("\u001B[46m"),
    WHITE_BACKGROUND  ("\u001B[47m"),

    BLACK  ("\033[0;30m"),
    RED  ("\033[0;31m"),
    GREEN  ("\033[0;32m"),
    YELLOW  ("\033[0;33m"),
    BLUE  ("\033[0;34m"),
    PURPLE  ("\033[0;35m"),
    CYAN  ("\033[0;36m"),
    WHITE  ("\033[0;37m"),

    MAIUSC_BLACK  ("\033[3;30m"),
    MAIUSC_RED  ("\033[3;31m"),
    MAIUSC_GREEN  ("\033[3;32m"),
    MAIUSC_YELLOW  ("\033[3;33m"),
    MAIUSC_BLUE ("\033[3;34m"),
    MAIUSC_PURPLE  ("\033[3;35m"),
    MAIUSC_CYAN  ("\033[3;36m"),
    MAIUSC_WHITE  ("\033[3;37m"),


    BLACK_BOLD  ("\033[1;30m"),
    RED_BOLD  ("\033[1;31m"),
    GREEN_BOLD  ("\033[1;32m"),
    YELLOW_BOLD  ("\033[1;33m"),
    BLUE_BOLD  ("\033[1;34m"),
    PURPLE_BOLD  ("\033[1;35m"),
    CYAN_BOLD  ("\033[1;36m"),
    WHITE_BOLD  ("\033[1;37m"),

    BLACK_UNDERLINED  ("\033[4;30m"),
    RED_UNDERLINED  ("\033[4;31m"),
    GREEN_UNDERLINED  ("\033[4;32m"),
    YELLOW_UNDERLINED  ("\033[4;33m"),
    BLUE_UNDERLINED  ("\033[4;34m"),
    PURPLE_UNDERLINED  ("\033[4;35m"),
    CYAN_UNDERLINED  ("\033[4;36m"),
    WHITE_UNDERLINED  ("\033[4;37m");

    private String ANSI_Code;

    ColoriEnum(String ANSI_Code) {
        this.ANSI_Code = ANSI_Code;
    }

    public String getANSI_Code() {
        return ANSI_Code;
    }

}
