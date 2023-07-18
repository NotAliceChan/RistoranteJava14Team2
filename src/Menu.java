import java.util.ArrayList;
import java.util.List;

public class Menu {
    //TODO aggiungete la vostra lista e la vostra variabile booleana.

    private List<PrimiPiatti> primipiatti;
    private List<SecondiPiatti> secondiPiatti;
    private List<Bevande> bevande;


    boolean isPrimiPiattiVegani = false;
    boolean isPrimiPiattiVegetariani = false;
    private Boolean isStampaScrittaPrimiUnaVolta = false;
    private Boolean stampaScrittaSecondiUnaVolta = false;
    private Boolean stampaScrittaBevandeUnavolta = false;

    //TODO aggiungete all'interno del costruttore il vostro new ArrayList<>()

    public Menu() {
        this.primipiatti = new ArrayList<>();
        this.secondiPiatti = new ArrayList<>();
        this.bevande = new ArrayList<>();

    }

    //TODO copia sotto

    public void addPrimoPiatto(PrimiPiatti primipiatti) {
        this.primipiatti.add(primipiatti);

    }

    public void addSecondoPiatto(SecondiPiatti secondoPiatto) {
        this.secondiPiatti.add(secondoPiatto);
    }

    public void addBevanda(Bevande bevanda) {
        this.bevande.add(bevanda);
    }

    //TODO copia sotto

    public void setPrimoPiatto(int index, PrimiPiatti element) {
        this.primipiatti.set(index, element);
    }

    public void setPiattoSecondo(int index, SecondiPiatti element) {
        this.secondiPiatti.set(index, element);
    }

    public void setBevanda(int index, Bevande element) {
        this.bevande.set(index, element);
    }


    //TODO copia quello sotto

    public void removePrimoPiatto(int index) {
        this.primipiatti.remove(index);
    }

    public void removeSecondoPiatto(int index) {
        this.secondiPiatti.remove(index);
    }

    public void removeBevanda(int index) {
        this.bevande.remove(index);
    }

    //TODO aggiungere un ciclo for a questo metodo che stampa il vostro tipo come nell'esempio qui sotto.


    public void printMenu() {
        for (PrimiPiatti primo : primipiatti) {
                if (!isStampaScrittaPrimiUnaVolta) {
                    System.out.println("\nPRIMI PIATTI:\n");
                    isStampaScrittaPrimiUnaVolta = true;
                }
                System.out.println(primo.getNome() + " - " + "€" + primo.getPrezzo());
            }



        for (SecondiPiatti piattoS : this.secondiPiatti) {
            if (!stampaScrittaSecondiUnaVolta) {
                System.out.println("\nSECONDI PIATTI\n");
                stampaScrittaSecondiUnaVolta = true;
            }

            System.out.println(piattoS.getNome() + " - " + "€" + piattoS.getPrezzo());
        }
        for (Bevande bevanda : this.bevande) {
            if (!stampaScrittaBevandeUnavolta) {
                System.out.println("\nBEVANDE\n");
                stampaScrittaBevandeUnavolta = true;
            }

            System.out.println(bevanda.getNome() + " - " + "€" + bevanda.getPrezzo());
        }

    }

    public void printMenu(Dieta tipo) {
        if (tipo == Dieta.VEGANO) {
            if (!isStampaScrittaPrimiUnaVolta) {
                System.out.println("\nPRIMI PIATTI VEGANI:\n");
                isPrimiPiattiVegani = true;
            }
            for (PrimiPiatti primoV : primipiatti) {
                if (primoV.getTipo() == tipo) {
                    System.out.println(primoV.getNome() + " - " + "€" + primoV.getPrezzo());
                }
            }
        } else if (tipo == Dieta.VEGETARIANO) {
            if (!isStampaScrittaPrimiUnaVolta) {
                System.out.println("\nPRIMI PIATTI VEGETARIANI:\n");
                isPrimiPiattiVegetariani = true;
                for (PrimiPiatti primove : primipiatti) {
                    if (primove.getTipo() == tipo) {
                        System.out.println(primove.getNome() + " - " + "€" + primove.getPrezzo());
                    }
                }
            }
        }
    }
    //TODO andate a modificare il main in modo di applicare questa logica.
}

