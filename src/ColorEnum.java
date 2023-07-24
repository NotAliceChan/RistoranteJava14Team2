public enum ColorEnum {
    RESET("\u001B[0m", "imposta il testo con il colore predefinito " ),
    RED("\u001B[31m", "imposta il testo con il colore rosso "),
    GREEN("\u001B[32m", "imposta il testo con il colore verde "),
    BLUE("\u001B[34m", "imposta il testo con il colore blu "),
    YELLOW("\u001B[33m", "imposta il testo con il colore giallo ");

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
