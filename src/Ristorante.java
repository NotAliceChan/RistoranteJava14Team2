import java.util.ArrayList;
import java.util.List;

public class Ristorante {
    private String nome;
    private String indirizzo;
    private boolean itsMichelinGuide;
    private List<Menu>  listaMenu;

    public Ristorante(String nome, String indirizzo, boolean itsMichelinGuide) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.itsMichelinGuide = itsMichelinGuide;
        this.listaMenu = new ArrayList<>();
    }

    public void addMenu(Menu menu){
        this.listaMenu.add(menu);
    }

    public void printInfo(){
        System.out.println("Ristorante : " + this.nome + "\nIndirizzo : " + this.indirizzo + "\nGuida MIchelin : " + this.itsMichelinGuide);
        for (Menu menu : listaMenu) {
            System.out.println( "Nome menu : " + menu.getNomeMenu()  + "\nChef  : "+ menu.getChef() + "\nTipo menu : " + menu.getTipoMenu() + "\nPortate : " + menu.getListaPortate());
        }
    }
}
