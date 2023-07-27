/**
 * The type Secondi piatti.
 */
public class SecondiPiatti extends Portata {
    private String origine;
    private Integer tempoDiCottura;

    public SecondiPiatti(String nome, Double prezzo,Integer tempoDiCottura, String origine, DietaEnum tipoDietaEnum) {
        super(nome, prezzo, tipoDietaEnum);
        this.origine = origine;
        this.tempoDiCottura = tempoDiCottura;
    }


}
