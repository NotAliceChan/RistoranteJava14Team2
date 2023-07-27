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

    public void printMenu(){
        for (Menu menu : listaMenu) {

        }
    }
}
