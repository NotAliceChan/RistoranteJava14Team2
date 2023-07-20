public enum Color {

    //TODO sempre enum alla fine, e inserire anche la descrizione
    RESET("\u001B[0m" ),
    RED("\u001B[31m"),
    GREEN("\u001B[32m", "colore verde testo"),
    BLUE("\u001B[34m"),
    YELLOW("\u001B[33m");

    private final String escapeSequence;

    Color(String escapeSequence) {
        this.escapeSequence = escapeSequence;
    }

    public String getEscapeSequence() {
        return escapeSequence;
    }
}
