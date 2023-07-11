import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        List<Bevande> bevande = new ArrayList<>();
        bevande.add(new Bevande("Acqua Naturale", 2.50));
        bevande.add(new Bevande("Coca cola", 3.00));
        bevande.add(new Bevande("Birra Peroni", 2.00));
        bevande.add(new Bevande("Fanta", 3.00));
        bevande.add(new Bevande("Vino Rosso Fazio", 6.50));
        bevande.add(new Bevande("Vino Bianco Team1Java (Produzione propria) ", 14.50));

        /**
         * inizio sezione bevamde
         */
        System.out.println("\nBEVANDE\n");
        for (Bevande bevanda : bevande) {
            System.out.println(bevanda.getNome() + " - " + "€" + bevanda.getPrezzo());
        }
    }
}
