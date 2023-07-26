/**
 * The type Bevande.
 */
public class Bevande extends Portata {
    public Bevande(String nome, Double prezzo) {
        super(nome, prezzo);
    }

    public Bevande(String nome, Double prezzo, DietaEnum tipoDietaEnum) {
        super(nome, prezzo, tipoDietaEnum);
    }
}
