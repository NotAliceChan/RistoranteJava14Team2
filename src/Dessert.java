/**
 * The type Dessert.
 */
public class Dessert extends Portata {

    public Dessert(String nome, Double prezzo) {
        super(nome, prezzo);
    }

    public Dessert(String nome, Double prezzo, DietaEnum tipoDietaEnum) {
        super(nome, prezzo, tipoDietaEnum);
    }
}