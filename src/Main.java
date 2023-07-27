public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu("menu del giorno", TipoMenu.ALTRO);

        menu.addPortata(new PrimiPiatti("Carpaccio Maguro", 18.50, DietaEnum.EMPTY));
        menu.addPortata(new PrimiPiatti("Tartarre di Salmone", 14.80, DietaEnum.EMPTY));
        menu.addPortata(new PrimiPiatti("Salmone marinato al genmaicha e al coriandolo", 22.90, DietaEnum.SENZA_GLUTINE) );
        menu.addPortata(new PrimiPiatti("Ramen Vegano", 14.55, DietaEnum.VEGANO));
        menu.addPortata(new PrimiPiatti("Minestra di miso ai germogli", 16.75, DietaEnum.VEGETARIANO));

        menu.addPortata(new SecondiPiatti("Insalata di Polpo e Patate", 18.80, 20, "Italia", DietaEnum.EMPTY));
        menu.addPortata(new SecondiPiatti("Salmone Grigliato", 25.90, 7, "Italia",DietaEnum.EMPTY));
        menu.addPortata(new SecondiPiatti("Seppie con Piselli", 16.40,5, "Italia", DietaEnum.EMPTY));
        menu.addPortata(new SecondiPiatti("Sushi Vegano", 9.99,8, "Giappone", DietaEnum.VEGANO));
        menu.addPortata(new SecondiPiatti("Tempura di verdure viola", 7.99,5, "Giappone", DietaEnum.VEGETARIANO));
        menu.addPortata(new SecondiPiatti("Tofu dorato con cipollotti", 24.99,3, "Giappione", DietaEnum.SENZA_GLUTINE));

        menu.addPortata(new Bevande("Acqua Naturale", 2.50,0, DietaEnum.EMPTY));
        menu.addPortata(new Bevande("Coca cola", 3.00, 0, DietaEnum.EMPTY));
        menu.addPortata(new Bevande("Birra Peroni", 2.00,3, DietaEnum.EMPTY));
        menu.addPortata(new Bevande("Fanta", 3.00,0, DietaEnum.EMPTY));
        menu.addPortata(new Bevande("Vino Rosso Fazio", 6.50,15, DietaEnum.EMPTY));
        menu.addPortata(new Bevande("Vino Bianco Team1Java (Produzione propria) ", 14.50, 14, DietaEnum.EMPTY));
        menu.addPortata(new Bevande("Vino Ambrato Team1Java (Produzione propria) ", 16.50,13, DietaEnum.EMPTY));

        menu.addPortata(new Dessert("Tiramisù", 8.00,DietaEnum.VEGANO,10,true));
        menu.addPortata(new Dessert("Tartufo di Pizzo", 8.40,DietaEnum.VEGANO,7,false));
        menu.addPortata(new Dessert("Torta della nonna", 10.90,DietaEnum.VEGANO,10,true));
        menu.addPortata(new Dessert("Mazzamorra morada", 6.70,DietaEnum.VEGETARIANO, 5, false));
        menu.addPortata(new Dessert("Crostata Primavera", 12.99, DietaEnum.SENZA_GLUTINE,4,true));

        System.out.println(ColorEnum.YELLOW.getEscapeSequence() + "RISTORANTE LA SIRENETTA\n" + ColorEnum.RESET.getEscapeSequence());

        System.out.println("\n" + ColorEnum.PINK.getEscapeSequence() + "Chef : Alice\n" + ColorEnum.RESET.getEscapeSequence());

        menu.printMenu(DietaEnum.EMPTY);


    }
}