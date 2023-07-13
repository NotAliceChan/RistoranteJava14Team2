import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        List<PrimiPiatti> primiPiatti = new ArrayList<>();
        primiPiatti.add(new PrimiPiatti("Carpaccio Maguro", 18.50));
        primiPiatti.add(new PrimiPiatti("Tartarre di Salmone", 14.80));
        primiPiatti.add(new PrimiPiatti("Burrikama", 22.90));

        List<SecondiPiatti> secondiPiatti = new ArrayList<>();
        secondiPiatti.add(new SecondiPiatti("Insalata di Polpo e Patate", 18.80));
        secondiPiatti.add(new SecondiPiatti("Salmone Grigliato", 25.90));
        secondiPiatti.add(new SecondiPiatti("-Seppie con Piselli", 16.40));

        List<Bevande> bevande = new ArrayList<>();
        bevande.add(new Bevande("Acqua Naturale", 2.50));
        bevande.add(new Bevande("Coca cola", 3.00));
        bevande.add(new Bevande("Birra Peroni", 2.00));
        bevande.add(new Bevande("Fanta", 3.00));
        bevande.add(new Bevande("Vino Rosso Fazio", 6.50));
        bevande.add(new Bevande("Vino Bianco Team1Java (Produzione propria) ", 14.50));

        List<Dessert> dessert = new ArrayList<>();
        dessert.add(new Dessert("Tiramisù", 8.00));
        dessert.add(new Dessert("Tartufo di Pizzo", 8.40));
        dessert.add(new Dessert("Torta della nonna", 10.90));
        dessert.add(new Dessert("Mazzamorra morada", 6.70));
        /**
         * inizio sezione bevamde
         */

        System.out.println("RISTORANTE LA SIRENETTA\n");

        System.out.println("\nPrimi Piatti\n");
        for (PrimiPiatti primopiatto : primiPiatti ){
            System.out.println(primopiatto.getNome() + " - " + "€" + primopiatto.getPrezzo());
        }

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
