import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<PrimiPiatti> primipiatti;
    private List<SecondiPiatti> secondiPiatti;
    private List<Bevande> bevande;
    private List<Dessert> desserts;

    public Menu() {
        this.primipiatti = new ArrayList<>();
        this.secondiPiatti = new ArrayList<>();
        this.bevande = new ArrayList<>();
        this.desserts = new ArrayList<>();
    }

    public void addPrimoPiatto(PrimiPiatti primipiatti) {
        this.primipiatti.add(primipiatti);
    }

    public void addSecondoPiatto(SecondiPiatti secondoPiatto) {
        this.secondiPiatti.add(secondoPiatto);
    }

    public void addBevanda(Bevande bevanda) {
        this.bevande.add(bevanda);
    }
    public void addDessert(Dessert dessert){
        this.desserts.add(dessert);
    }


    public void setPrimoPiatto(int index, PrimiPiatti element) {
        this.primipiatti.set(index, element);
    }

    public void setPiattoSecondo(int index, SecondiPiatti element) {
        this.secondiPiatti.set(index, element);
    }

    public void setBevanda(int index, Bevande element) {
        this.bevande.set(index, element);
    }

    public void setDessert(int index, Dessert element){
        this.desserts.set(index,element);
    }


    public void removePrimoPiatto(int index) {
        this.primipiatti.remove(index);
    }

    public void removeSecondoPiatto(int index) {
        this.secondiPiatti.remove(index);
    }

    public void removeBevanda(int index) {
        this.bevande.remove(index);
    }

    public void removeDessert(int index){
        this.desserts.remove(index);
    }


    public void printMenu() {
        System.out.println("\nPRIMI PIATTI:\n");
        for (PrimiPiatti primoPiatto : primipiatti) {
            System.out.println(primoPiatto.getNome() + " - " + "€" + primoPiatto.getPrezzo());
        }
        System.out.println("\nSECONDI PIATTI\n");
        for (SecondiPiatti secondoPiatto : this.secondiPiatti) {
            System.out.println(secondoPiatto.getNome() + " - " + "€" + secondoPiatto.getPrezzo());
        }
        System.out.println("\nBEVANDE\n");
        for (Bevande bevanda : this.bevande) {
            System.out.println(bevanda.getNome() + " - " + "€" + bevanda.getPrezzo());
        }
        System.out.println("\nDESSERTS:\n");
        for (Dessert dolce : desserts) {
            System.out.println(dolce.getNome() + " - " + "€" + dolce.getPrezzo());
        }
    }

    public void printMenu(Dieta tipoDieta) {
        // inizio sezione primi piatti

        if (tipoDieta == Dieta.VEGANO) {
            System.out.println(Color.RED.getEscapeSequence() + "\nPRIMI PIATTI VEGANI:\n" + Color.RESET.getEscapeSequence());
            for (PrimiPiatti primoVegano : primipiatti) {
                if (primoVegano.getTipoDieta() == tipoDieta) {
                    System.out.println(primoVegano.getNome() + " - " + "€" + primoVegano.getPrezzo());
                }
            }
        } else if (tipoDieta == Dieta.VEGETARIANO) {
            System.out.println(Color.GREEN.getEscapeSequence() + "\nPRIMI PIATTI VEGETARIANI:\n" + Color.RESET.getEscapeSequence());
            for (PrimiPiatti primoVegetariano : primipiatti) {
                if (primoVegetariano.getTipoDieta() == tipoDieta) {
                    System.out.println(primoVegetariano.getNome() + " - " + "€" + primoVegetariano.getPrezzo());
                }
            }
        }
        // inizio sezione secondi piatti
        if (tipoDieta == Dieta.VEGANO) {
            System.out.println(Color.RED.getEscapeSequence() + "\nSECONDI PIATTI VEGANI:\n" + Color.RESET.getEscapeSequence());

            for (SecondiPiatti secondoVegano : secondiPiatti) {
                if (secondoVegano.getTipoDieta() == tipoDieta) {
                    System.out.println(secondoVegano.getNome() + " - " + "€" + secondoVegano.getPrezzo());
                }
            }
        } else if (tipoDieta == Dieta.VEGETARIANO) {
            System.out.println(Color.GREEN.getEscapeSequence() + "\nSECONDI PIATTI VEGETARIANI:\n" + Color.RESET.getEscapeSequence());
            for (SecondiPiatti secondoVegetariano : secondiPiatti) {
                if (secondoVegetariano.getTipoDieta() == tipoDieta) {
                    System.out.println(secondoVegetariano.getNome() + " - " + "€" + secondoVegetariano.getPrezzo());
                }
            }
        }
        // inizio sezione Dessert
        if (tipoDieta == Dieta.VEGANO) {
            System.out.println( Color.RED.getEscapeSequence() + "\nDESSERT VEGANI:\n" + Color.RESET.getEscapeSequence());
            for (Dessert dolceVegano : desserts) {
                if (dolceVegano.getTipoDieta() == tipoDieta) {
                    System.out.println(dolceVegano.getNome() + " - " + "€" + dolceVegano.getPrezzo());
                }
            }
        }
        else if (tipoDieta == Dieta.VEGETARIANO) {
            System.out.println(Color.GREEN.getEscapeSequence() + "\nDESSERT VEGETARIANI:\n" + Color.RESET.getEscapeSequence() );
            for (Dessert dolceVegetariano : desserts) {
                if (dolceVegetariano.getTipoDieta() == tipoDieta) {
                    System.out.println(dolceVegetariano.getNome() + " - " + "€" + dolceVegetariano.getPrezzo());
                }
            }
        }
    }
}

