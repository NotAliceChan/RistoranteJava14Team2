public enum DietaEnum {
    VEGANO("VEGANO", ColorEnum.BLUE),
    VEGETARIANO("VEGETARIANO", ColorEnum.GREEN),
    SENZA_GLUTINE("SENZA GLUTINE", ColorEnum.YELLOW);

    private String info;
    private ColorEnum color;

    DietaEnum(String info, ColorEnum color) {
        this.info = info;
        this.color = color;
    }

    public String printWithColor() {
        return color.getEscapeSequence() + info + ColorEnum.RESET.getEscapeSequence();
    }
}