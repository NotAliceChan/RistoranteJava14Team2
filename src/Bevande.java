/**
 * The type Bevande.
 */
public class Bevande extends Portata {

    //TODO tutte le classi figli di portate devono avere almeno due campi in più
    private Integer gradoAlcolico;


    public Bevande(String nome, Double prezzo) {
        super(nome, prezzo);
    }

    public Bevande(String nome, Double prezzo, DietaEnum tipoDietaEnum) {
        super(nome, prezzo, tipoDietaEnum);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("altri field");
    }
}
