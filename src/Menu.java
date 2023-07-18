import java.util.ArrayList;
import java.util.List;

public class Menu {
    //TODO aggiungete la vostra lista e la vostra variabile booleana.


    private List<SecondiPiatti> secondiPiatti;
    private List<Bevande> bevande;
    private boolean stampaScrittaSecondiUnaVolta = false;
    private Boolean stampaScrittaBevandeUnavolta = false;

    //TODO aggiungete all'interno del costruttore il vostro new ArrayList<>()

    public Menu() {
        this.secondiPiatti = new ArrayList<>();
        this.bevande = new ArrayList<>();
    }


    //TODO create diversi metodi chiamati sempre addPiattoBevandaDessert come sotto. Ognuno di questi accetta un parametro  in base al tipo e aggiunge un oggetto di quel tipo come nell'esempio sotto.

    public void addSecondoPiatto(SecondiPiatti secondoPiatto){
        this.secondiPiatti.add(secondoPiatto);
    }
    public void addBevanda(Bevande bevanda) { this.bevande.add(bevanda);}

    //TODO create diversi metodi chiamati sempre setPiattoBevandaDessert come sotto. Ognuno di questi accetta un parametro in base al tipo e lo modifica come l'esempio sotto.

    public void setPiattoSecondo(int index, SecondiPiatti element) {
        this.secondiPiatti.set(index, element);
    }
    public void setBevanda(int index, Bevande element) {
        this.bevande.set(index, element);
    }


    //TODO create diversi metodi chiamati sempre removePiattoBevandaDessert come sotto. Ognuno di questi accetta un parametro index e rimuove dalla lista l'elemento in base all'indice come l'esempio sotto.

    public void  removePiattoSecondo(int index){
        this.secondiPiatti.remove(index);
    }
    public void  removeBevanda(int index){
        this.bevande.remove(index);
    }

    //TODO aggiungere un ciclo for a questo metodo che stampa il vostro tipo come nell'esempio qui sotto.

    public void printMenu() {
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
}
//TODO andate a modificare il main in modo di applicare questa logica.