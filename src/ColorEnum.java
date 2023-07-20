public enum ColorEnum {
    RESET("\u001B[0m", "colore predefinito" ),
    RED("\u001B[31m", "colore rosso"),
    GREEN("\u001B[32m", "colore verde"),
    BLUE("\u001B[34m", "colore blu"),
    YELLOW("\u001B[33m", "colore giallo");

    private final String escapeSequence;
    private final String infoColore;


    ColorEnum(String escapeSequence, String infoColore) {
        this.escapeSequence = escapeSequence;
        this.infoColore = infoColore;
    }

    public String getEscapeSequence() {
        return escapeSequence;
    }
}
