public enum Color {
    RESET("\u001B[0m"),
    RED("\u001B[31m"),
    GREEN("\u001B[32m"),
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
