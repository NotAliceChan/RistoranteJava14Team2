public enum Dieta {

    VEGANO("tipo vegano"),
    VEGETARIANO("tipo vegetariano"),

    SENZA_GLUTINE("tipo senza glutine")

    ;
    String info;

    Dieta(String info) {
        this.info = info;
    }


}
