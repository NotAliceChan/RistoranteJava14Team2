import java.util.ArrayList;
import java.util.List;

public class Menu {
    // TODO aggiungete la vostra lista e la vostra variabile booleana.

    private List<PrimiPiatti> primipiatti;
    private List<SecondiPiatti> secondiPiatti;
    private List<Bevande> bevande;

    private Boolean isPrimiPiattiVegani = false;
    private Boolean isPrimiPiattiVegetariani = false;
    private Boolean isSecondiPiattiVegani = false;
    private Boolean isSecondiPiattiVegetariani = false;
    private Boolean StampaScrittaPrimiUnaVolta = false;
    private Boolean stampaScrittaSecondiUnaVolta = false;
    private Boolean stampaScrittaBevandeUnavolta = false;

    // TODO aggiungete all'interno del costruttore il vostro new ArrayList<>()

    public Menu() {
        this.primipiatti = new ArrayList<>();
        this.secondiPiatti = new ArrayList<>();
        this.bevande = new ArrayList<>();
    }

    // TODO copia sotto

    public void addPrimoPiatto(PrimiPiatti primipiatti) {
        this.primipiatti.add(primipiatti);
    }

    public void addSecondoPiatto(SecondiPiatti secondoPiatto) {
        this.secondiPiatti.add(secondoPiatto);
    }

    public void addBevanda(Bevande bevanda) {
        this.bevande.add(bevanda);
    }

    // TODO copia sotto

    public void setPrimoPiatto(int index, PrimiPiatti element) {
        this.primipiatti.set(index, element);
    }

    public void setPiattoSecondo(int index, SecondiPiatti element) {
        this.secondiPiatti.set(index, element);
    }

    public void setBevanda(int index, Bevande element) {
        this.bevande.set(index, element);
    }

    // TODO copia quello sotto

    public void removePrimoPiatto(int index) {
        this.primipiatti.remove(index);
    }

    public void removeSecondoPiatto(int index) {
        this.secondiPiatti.remove(index);
    }

    public void removeBevanda(int index) {
        this.bevande.remove(index);
    }

    // TODO aggiungere un ciclo for a questo metodo che stampa il vostro tipo come nell'esempio qui sotto.

    public void printMenu() {
        for (PrimiPiatti primoPiatto : primipiatti) {
            if (!StampaScrittaPrimiUnaVolta) {
                System.out.println("\nPRIMI PIATTI:\n");
                StampaScrittaPrimiUnaVolta = true;
            }
            System.out.println(primoPiatto.getNome() + " - " + "€" + primoPiatto.getPrezzo());
        }
        for (SecondiPiatti secondoPiatto : this.secondiPiatti) {
            if (!stampaScrittaSecondiUnaVolta) {
                System.out.println("\nSECONDI PIATTI\n");
                stampaScrittaSecondiUnaVolta = true;
            }
            System.out.println(secondoPiatto.getNome() + " - " + "€" + secondoPiatto.getPrezzo());
        }
        for (Bevande bevanda : this.bevande) {
            if (!stampaScrittaBevandeUnavolta) {
                System.out.println("\nBEVANDE\n");
                stampaScrittaBevandeUnavolta = true;
            }
            System.out.println(bevanda.getNome() + " - " + "€" + bevanda.getPrezzo());
        }
    }

    // TODO aggiungere un ciclo for a questo metodo che stampa in base al vostro tipo VEGANO O VEGETARIANO, il menu come nell'esempio qui sotto.
    public void printMenu(Dieta tipoDieta) {
        if (tipoDieta == Dieta.VEGANO) {
            if (!isPrimiPiattiVegani) {
                System.out.println("\nPRIMI PIATTI VEGANI:\n");
                isPrimiPiattiVegani = true;
            }
            for (PrimiPiatti primoVegano : primipiatti) {
                if (primoVegano.getTipoDieta() == tipoDieta) {
                    System.out.println(primoVegano.getNome() + " - " + "€" + primoVegano.getPrezzo());
                }
            }

        } else if (tipoDieta == Dieta.VEGETARIANO) {
            if (!isPrimiPiattiVegetariani) {
                System.out.println("\nPRIMI PIATTI VEGETARIANI:\n");
                isPrimiPiattiVegetariani = true;
                for (PrimiPiatti primoVegetariano : primipiatti) {
                    if (primoVegetariano.getTipoDieta() == tipoDieta) {
                        System.out.println(primoVegetariano.getNome() + " - " + "€" + primoVegetariano.getPrezzo());
                    }
                }
            }
        }
        if (!isSecondiPiattiVegani) {
            System.out.println("\nSECONDI PIATTI VEGANI:\n");
            isSecondiPiattiVegani = true;
        }
        for (SecondiPiatti secondoVegano : secondiPiatti) {
            if (secondoVegano.getTipoDieta() == tipoDieta) {
                System.out.println(secondoVegano.getNome() + " - " + "€" + secondoVegano.getPrezzo());
            } else if (tipoDieta == Dieta.VEGETARIANO) {
                if (!isSecondiPiattiVegetariani) {
                    System.out.println("\nSECONDI PIATTI VEGETARIANI:\n");
                    isSecondiPiattiVegani = true;
                    for (SecondiPiatti secondoVegetariano : secondiPiatti) {
                        if (secondoVegetariano.getTipoDieta() == tipoDieta) {
                            System.out.println(secondoVegetariano.getNome() + " - " + "€" + secondoVegetariano.getPrezzo());
                        }
                    }
                }
            }
        }
    }
    // TODO andate a modificare il main in modo di applicare questa logica.
}
