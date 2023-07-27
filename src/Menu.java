import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * The type Menu.
 */
public class Menu {

    //TODO inseriamo un po di campi : chef, e sopratutto tipoMenu
    private List<Portata> listaPortate;
    private String nomeMenu;
    private TipoMenu tipoMenu;

    /**
     * Instantiates a new Menu.
     *
     * @param nomeMenu the nome menu
     */
    public Menu(String nomeMenu, TipoMenu tipoMenu) {
        this.listaPortate = new ArrayList<>();
        this.nomeMenu = nomeMenu;
        this.tipoMenu = tipoMenu;
    }

    /**
     * Gets portata list.
     *
     * @return the portata list
     */
    public List<Portata> getPortataList() {
        return listaPortate;
    }

    /**
     * Gets nome menu.
     *
     * @return the nome menu
     */
    public String getNomeMenu() {
        return nomeMenu;
    }

    /**
     * Sets nome menu.
     *
     * @param nomeMenu the nome menu
     */
    public void setNomeMenu(String nomeMenu) {
        this.nomeMenu = nomeMenu;
    }

    /**
     * Add portata.
     *
     * @param portata the portata
     */
    public void addPortata(Portata portata) {
        listaPortate.add(portata);
    }

    /**
     * Set portata.
     *
     * @param index   the index
     * @param element the element
     */
    public void setPortata(int index, Portata element) {
        listaPortate.set(index, element);
    }

    /**
     * Remove portata.
     *
     * @param index the index
     */
    public void removePortata(int index) {
        listaPortate.remove(index);
    }

    /**
     * @param tipoDietaEnum
     * @return la media del prezzo dei piatti vegani, vegetariani o senza glutine, in stringa usando DecimalFormat
     */
    private String getPrezzoMedioMenu(DietaEnum tipoDietaEnum) {
        // privato perchè lo dobbiamo utilizzare solo nel printMenu)
        Double prezzoTotale = 0.0;
        int contatore = 0;

        for (Portata portata : this.listaPortate) {
            if (portata.getTipoDieta() == tipoDietaEnum) {
                prezzoTotale += portata.getPrezzo();
                contatore++;
            }
        }
        return new DecimalFormat("#.00").format(prezzoTotale / contatore) + " €";
    }

    /**
     * aggiunge ad una lista i primi piatti della lista Portata in base al tipo di dieta
     */
    private void printPrimiPiatti(DietaEnum tipoDietaEnum) {
        List<PrimiPiatti> primipiatti = new ArrayList<>();

        // Divide le portate in secondi piatti
        for (Portata portata : listaPortate) {
            if (portata instanceof PrimiPiatti && portata.getTipoDieta() == tipoDietaEnum) {
                primipiatti.add((PrimiPiatti) portata);
            }
        }
        System.out.println("PRIMI PIATTI " + "(" + tipoDietaEnum.printWithColor() + ")\n");
        for (PrimiPiatti primo : primipiatti) {
            System.out.println(primo);
        }
    }


    /**
     * Print menu filtrato.
     *
     */
    public void printMenu(DietaEnum tipoDietaEnum){

        System.out.print("TIPO MENU: ");
        System.out.println(tipoMenu.getNome());

        System.out.println("PRIMI PIATTI: \n");
        for (Portata p : listaPortate) {
            if (p instanceof PrimiPiatti) {
                p.printPortata();
            }
        }
        System.out.println("\nSECONDI PIATTI: \n");
        for (Portata p: listaPortate) {
            if (p.getClass() == SecondiPiatti.class){
                p.printPortata();
            }
        }
        System.out.println("\nDESSERT: \n");
        for (Portata p: listaPortate) {
            if (p.getClass() == Dessert.class){
                p.printPortata();
            }
        }
        System.out.println("\nBEVANDE: \n");
        for (Portata p: listaPortate) {
            if (p.getClass() == Bevande.class){
                p.printPortata();
            }
        }
    }

}