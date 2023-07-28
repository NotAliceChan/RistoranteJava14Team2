public enum TipoMenu {
    PROTEICO ("Proteico"),
    CARBOIDRATICO ("Carboidratico"),
    VEGETALE ("Vegetale"),
    ALTRO ("Altro")
    ;

    private String tipoMenu;
    TipoMenu(String tipoMenu ) {
        this.tipoMenu = tipoMenu;
    }
    public String getNome(){
        return tipoMenu;
    }
}
