import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();

        menu.addPrimoPiatto(new PrimiPiatti("Carpaccio Maguro", 18.50));
        menu.addPrimoPiatto(new PrimiPiatti("Tartarre di Salmone", 14.80));
        menu.addPrimoPiatto(new PrimiPiatti("Salmone marinato al genmaicha e al coriandolo", 22.90, Dieta.SENZA_GLUTINE) );
        menu.addPrimoPiatto(new PrimiPiatti("Ramen Vegano", 14.55, Dieta.VEGANO));
        menu.addPrimoPiatto(new PrimiPiatti("Minestra di miso ai germogli", 16.75, Dieta.VEGETARIANO));


        menu.addSecondoPiatto(new SecondiPiatti("Insalata di Polpo e Patate", 18.80));
        menu.addSecondoPiatto(new SecondiPiatti("Salmone Grigliato", 25.90));
        menu.addSecondoPiatto(new SecondiPiatti("Seppie con Piselli", 16.40));
        menu.addSecondoPiatto(new SecondiPiatti("Sushi Vegano", 9.99, Dieta.VEGANO));
        menu.addSecondoPiatto(new SecondiPiatti("Tempura di verdure viola", 7.99, Dieta.VEGETARIANO));
        menu.addSecondoPiatto(new SecondiPiatti("Tofu dorato con cipollotti", 24.99, Dieta.SENZA_GLUTINE));

        menu.addBevanda(new Bevande("Acqua Naturale", 2.50));
        menu.addBevanda(new Bevande("Coca cola", 3.00));
        menu.addBevanda(new Bevande("Birra Peroni", 2.00));
        menu.addBevanda(new Bevande("Fanta", 3.00));
        menu.addBevanda(new Bevande("Vino Rosso Fazio", 6.50));
        menu.addBevanda(new Bevande("Vino Bianco Team1Java (Produzione propria) ", 14.50));

        menu.addDessert(new Dessert("Tiramisù", 8.00));
        menu.addDessert(new Dessert("Tartufo di Pizzo", 8.40));
        menu.addDessert(new Dessert("Torta della nonna", 10.90,Dieta.VEGANO));
        menu.addDessert(new Dessert("Mazzamorra morada", 6.70,Dieta.VEGETARIANO));
        menu.addDessert(new Dessert("Crostata Primavera", 12.99, Dieta.SENZA_GLUTINE));

        System.out.println(Color.BLUE.getEscapeSequence() + "RISTORANTE LA SIRENETTA\n" + Color.RESET.getEscapeSequence());
        menu.printMenu(Dieta.VEGANO);
        menu.printMenu(Dieta.VEGETARIANO);
        menu.printMenu(Dieta.SENZA_GLUTINE);
        menu.printMenu();
    }
}