import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * The type Menu.
 */
public class Menu {
    private List<Portata> portataList;
    private String nomeMenu;

    /**
     * Instantiates a new Menu.
     *
     * @param nomeMenu the nome menu
     */
    public Menu(String nomeMenu) {
        this.portataList = new ArrayList<>();
        this.nomeMenu = nomeMenu;
    }

    /**
     * Gets portata list.
     *
     * @return the portata list
     */
    public List<Portata> getPortataList() {
        return portataList;
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
    public void addPortata(Portata portata){
        portataList.add(portata);
    }

    /**
     * Set portata.
     *
     * @param index   the index
     * @param element the element
     */
    public void setPortata(int index, Portata element){
        portataList.set(index, element);
    }

    /**
     * Remove portata.
     *
     * @param index the index
     */
    public void removePortata(int index){
        portataList.remove(index);
    }

    /**
     * @return la media del prezzo di tutti i piatti, in stringa usando DecimalFormat
     */
    private  String getPrezzoMedioMenu (){                 // privato perchè lo dobbiamo utilizzare solo nel printMenu)
        Double prezzoTotale = 0.0;
        for (Portata portata : this.portataList) {
            prezzoTotale += portata.getPrezzo();
        }
        return new DecimalFormat("#.00").format(prezzoTotale / this.portataList.size());
    }

    /**
     *
     * @param tipoDietaEnum
     * @return la media del prezzo dei piatti vegani, vegetariani o senza glutine, in stringa usando DecimalFormat
     */
    private  String getPrezzoMedioMenu (DietaEnum tipoDietaEnum) {                 // privato perchè lo dobbiamo utilizzare solo nel printMenu)
        Double prezzoTotale = 0.0;
        int contatore = 0;

        for (Portata portata : this.portataList) {
                    if (portata.getTipoDieta() == tipoDietaEnum) {
                        prezzoTotale += portata.getPrezzo();
                        contatore++;
                    }
        }
        return new DecimalFormat("#.00").format(prezzoTotale / contatore);
    }

    /**
     * aggiunge ad una lista i secondi piatti della lista Portata
     */
    //TODO copiate questo metodo e cambiate con la vostra classe. Poi aggiungete questo metodo al printMenu()
    private void printSecondiPiatti() {
        List<SecondiPiatti> secondiPiatti = new ArrayList<>();

        // Divide le portate in secondi piatti
        for (Portata portata : portataList) {
            if (portata instanceof SecondiPiatti) {
                secondiPiatti.add((SecondiPiatti) portata);
            }
        }
        System.out.println("SECONDI PIATTI");
        for (SecondiPiatti secondo : secondiPiatti) {
            System.out.println(secondo);
        }
    }
    private void printBevande() {
        List<Bevande> bevande = new ArrayList<>();


        for (Portata portata : portataList) {
            if (portata instanceof Bevande) {
                bevande.add((Bevande) portata);
            }
        }
        System.out.println("BEVANDE");
        for (Bevande bevanda : bevande) {
            System.out.println(bevanda);
        }
    }

    /**
     * aggiunge ad una lista i secondi piatti della lista Portata in base al tipo di dieta
     */
    //TODO copiate questo metodo e cambiate con la vostra classe. Poi aggiungete questo metodo al printMenu(Dieta tipoDietaEnum)
    private void printSecondiPiatti(DietaEnum tipoDietaEnum) {
        List<SecondiPiatti> secondiPiatti = new ArrayList<>();

        // Divide le portate in secondi piatti
        for (Portata portata : portataList) {
            if (portata instanceof SecondiPiatti && portata.getTipoDieta() == tipoDietaEnum) {
                secondiPiatti.add((SecondiPiatti) portata);
            }
        }
        System.out.println( "SECONDI PIATTI " + "(" + tipoDietaEnum.printWithColor() + ")\n" );
        for (SecondiPiatti secondo : secondiPiatti) {
            System.out.println(secondo);
        }
    }

    /**
     * Print menu.
     */

    //TODO aggiungete i metodi privati corrispondenti qui sotto.
    public void printMenu () {
        System.out.println(this.nomeMenu.toUpperCase() + " " + "(" + getPrezzoMedioMenu() + ")");
        System.out.println();

        printSecondiPiatti();
        System.out.println();
        printBevande();





    }

    /**
     * Print menu filtrato.
     *
     * @param tipoDietaEnum the tipo dieta enum
     */
    //TODO aggiungete i metodi privati corrispondenti qui sotto.
    public void printMenu (DietaEnum tipoDietaEnum){
        System.out.println(this.nomeMenu.toUpperCase() + " " + "(" + getPrezzoMedioMenu(tipoDietaEnum) + ")");
        System.out.println();

        printSecondiPiatti(tipoDietaEnum);
        printBevande();
    }
}