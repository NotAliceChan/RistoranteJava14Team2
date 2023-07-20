/**
 * The type Secondi piatti.
 */
public class SecondiPiatti extends Portata {

    public SecondiPiatti(String nome, Double prezzo) {
        super(nome, prezzo);
    }

    public SecondiPiatti(String nome, Double prezzo, Dieta tipoDieta) {
        super(nome, prezzo, tipoDieta);
    }
}
