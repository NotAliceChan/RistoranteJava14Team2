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
            switch (tipoDietaEnum) {

                case VEGANO:
                    if (portata.getTipoDieta() == DietaEnum.VEGANO) {
                        prezzoTotale += portata.getPrezzo();
                        contatore++;
                    }
                    break;
                case VEGETARIANO:
                    if (portata.getTipoDieta() == DietaEnum.VEGETARIANO) {
                        prezzoTotale += portata.getPrezzo();
                        contatore++;
                    }
                    break;
                case SENZA_GLUTINE:
                    if (portata.getTipoDieta() == DietaEnum.SENZA_GLUTINE) {
                        prezzoTotale += portata.getPrezzo();
                        contatore++;
                    }
                    break;
            }
        }
        return new DecimalFormat("#.00").format(prezzoTotale / contatore);
    }

    /**
     * Print menu.
     */
    public void printMenu () {
        System.out.println(this.nomeMenu.toUpperCase() + " " + "(" + getPrezzoMedioMenu() + ")");
        System.out.println();

        for (Portata portata : portataList) {
            System.out.println(portata);
        }
    }

    /**
     * Print menu filtrato.
     *
     * @param tipoDietaEnum the tipo dieta enum
     */
    //TODO approfondire
    public void printMenu (DietaEnum tipoDietaEnum){
        System.out.println(this.nomeMenu + " " + "(" + getPrezzoMedioMenu(tipoDietaEnum) + ")");

        for (Portata portata : portataList) {
            if (portata.getTipoDieta() == tipoDietaEnum) {
                System.out.println(portata);
            }
        }
    }
}