import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Color red = Color.RED;


        menu.addPrimoPiatto(new PrimiPiatti("Carpaccio Maguro", 18.50));
        menu.addPrimoPiatto(new PrimiPiatti("Tartarre di Salmone", 14.80, Dieta.VEGETARIANO));
        menu.addPrimoPiatto(new PrimiPiatti("Burrikama", 22.90, Dieta.VEGANO) );

        menu.addSecondoPiatto(new SecondiPiatti("Insalata di Polpo e Patate", 18.80));
        menu.addSecondoPiatto(new SecondiPiatti("Salmone Grigliato", 25.90));
        menu.addSecondoPiatto(new SecondiPiatti("Seppie con Piselli", 16.40));


        menu.addBevanda(new Bevande("Acqua Naturale", 2.50));
        menu.addBevanda(new Bevande("Coca cola", 3.00));
        menu.addBevanda(new Bevande("Birra Peroni", 2.00));
        menu.addBevanda(new Bevande("Fanta", 3.00));
        menu.addBevanda(new Bevande("Vino Rosso Fazio", 6.50));
        menu.addBevanda(new Bevande("Vino Bianco Team1Java (Produzione propria) ", 14.50));

        List<Dessert> dessert = new ArrayList<>();
        dessert.add(new Dessert("Tiramisù", 8.00));
        dessert.add(new Dessert("Tartufo di Pizzo", 8.40));
        dessert.add(new Dessert("Torta della nonna", 10.90));
        dessert.add(new Dessert("Mazzamorra morada", 6.70));


        System.out.println(Color.BLUE.getEscapeSequence() + "RISTORANTE LA SIRENETTA\n" + Color.RESET.getEscapeSequence());



        menu.printMenu(Dieta.VEGANO);

      menu.printMenu(Dieta.VEGETARIANO);


      menu.printMenu();

        System.out.println("\nDESSERT\n");
        for (Dessert dessert1 : dessert) {
            System.out.println(dessert1.getNome() + " - " + "€" + dessert1.getPrezzo());
        }
    }
}
