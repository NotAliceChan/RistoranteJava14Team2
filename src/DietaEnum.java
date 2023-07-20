public enum DietaEnum {

    VEGANO("tipo vegano"),
    VEGETARIANO("tipo vegetariano"),

    SENZA_GLUTINE("tipo senza glutine")

    ;
    String info;

    DietaEnum(String info) {
        this.info = info;
    }


}
