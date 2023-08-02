import java.util.ArrayList;
import java.util.List;

/**
 * The type Ristorante.
 */
public class Ristorante {
    private String nome;
    private String indirizzo;
    private boolean itsMichelinGuide;
    private List<Menu>  listaMenu;

    /**
     * Instantiates a new Ristorante.
     *
     * @param nome             the nome
     * @param indirizzo        the indirizzo
     * @param itsMichelinGuide the its michelin guide
     */
    public Ristorante(String nome, String indirizzo, boolean itsMichelinGuide) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.itsMichelinGuide = itsMichelinGuide;
        this.listaMenu = new ArrayList<>();
    }

    /**
     * Gets nome.
     *
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Sets nome.
     *
     * @param nome the nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Gets indirizzo.
     *
     * @return the indirizzo
     */
    public String getIndirizzo() {
        return indirizzo;
    }

    /**
     * Sets indirizzo.
     *
     * @param indirizzo the indirizzo
     */
    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    /**
     * Is its michelin guide boolean.
     *
     * @return the boolean
     */
    public boolean isItsMichelinGuide() {
        return itsMichelinGuide;
    }

    /**
     * Sets its michelin guide.
     *
     * @param itsMichelinGuide the its michelin guide
     */
    public void setItsMichelinGuide(boolean itsMichelinGuide) {
        this.itsMichelinGuide = itsMichelinGuide;
    }

    /**
     * Add menu.
     *
     * @param menu the menu
     */
    public void addMenu(Menu menu){
        this.listaMenu.add(menu);
    }

    /**
     * Print info.
     */
    public void printInfo(){
        System.out.println("Ristorante : " + this.nome + "\nIndirizzo : " + this.indirizzo + "\nGuida MIchelin : " + this.itsMichelinGuide);
        for (Menu menu : listaMenu) {
            System.out.println( "Nome menu : " + menu.getNomeMenu()  + "\nChef  : "+ menu.getChef() + "\nTipo menu : " + menu.getTipoMenu());
            System.out.println();
            menu.printMenu(DietaEnum.EMPTY);
        }
    }
}
