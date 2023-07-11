import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        List<SecondiPiatti> secondiPiatti = new ArrayList<>();
        secondiPiatti.add(new SecondiPiatti("Insalata di Polpo e Patate", 18));
        secondiPiatti.add(new SecondiPiatti("Salmone Grigliato", 25));
        secondiPiatti.add(new SecondiPiatti("-Seppie con Piselli", 16));

        List<Bevande> bevande = new ArrayList<>();
        bevande.add(new Bevande("Acqua Naturale", 2.50));
        bevande.add(new Bevande("Coca cola", 3.00));
        bevande.add(new Bevande("Birra Peroni", 2.00));
        bevande.add(new Bevande("Fanta", 3.00));
        bevande.add(new Bevande("Vino Rosso Fazio", 6.50));
        bevande.add(new Bevande("Vino Bianco Team1Java (Produzione propria) ", 14.50));

        List<Dessert> dessert = new ArrayList<>();
        dessert.add(new Dessert("Tiramisù", 8));
        dessert.add(new Dessert("Tartufo di Pizzo", 8));
        dessert.add(new Dessert("Torta della nonna", 10));
        dessert.add(new Dessert("Mazzamorra morada", 6));
        /**
         * inizio sezione bevamde
         */

        System.out.println("RISTORANTE LA SIRENETTA\n");



        System.out.println("\nSECONDI PIATTI\n");
        for (SecondiPiatti secondoPiatto : secondiPiatti) {
            System.out.println(secondoPiatto.getNome() + " - " + "€" + secondoPiatto.getPrezzo());
        }

        System.out.println("\nBEVANDE\n");
        for (Bevande bevanda : bevande) {
            System.out.println(bevanda.getNome() + " - " + "€" + bevanda.getPrezzo());
        }

        System.out.println("\nDESSERT\n");
        for (Dessert dessert1 : dessert) {
            System.out.println(dessert1.getNome() + " - " + "€" + dessert1.getPrezzo());
        }
    }
}
