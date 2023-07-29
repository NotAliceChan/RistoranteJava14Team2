/**
 * The type Secondi piatti.
 */
public class SecondiPiatti extends Portata {
    private String origine;
    private Integer tempoDiPreparazione;

    public SecondiPiatti(String nome, Double prezzo,Integer tempoDiPreparazione, String origine, DietaEnum tipoDietaEnum) {
        super(nome, prezzo, tipoDietaEnum);
        this.origine = origine;
        this.tempoDiPreparazione = tempoDiPreparazione;
    }

    public String getOrigine() {
        return origine;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
    }

    public Integer getTempoDiPreparazione() {
        return tempoDiPreparazione;
    }

    public void setTempoDiPreparazione(Integer tempoDiPreparazione) {
        this.tempoDiPreparazione = tempoDiPreparazione;
    }

    @Override
    public void printPortata() {
        super.printPortata();
        System.out.println("Tempo di preparazione: " + tempoDiPreparazione + " (min)");
        System.out.println("Origine Piatto: " + origine + "\n");
    }
}
