/**
 * The type Secondi piatti.
 */
public class SecondiPiatti extends Portata {

    public SecondiPiatti(String nome, Double prezzo) {
        super(nome, prezzo);
    }

    public SecondiPiatti(String nome, Double prezzo, DietaEnum tipoDietaEnum) {
        super(nome, prezzo, tipoDietaEnum);
    }
}
