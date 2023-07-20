/**
 * The type Primi piatti.
 */
public class PrimiPiatti {

    //TODO creare una classe Portata che poi viene estesa da tutte le classi che avete fatto

    private String nome;
    private double prezzo;

    private DietaEnum tipoDietaEnum;

    /**
     * Instantiates a new Primi piatti.
     *
     * @param nome   the nome
     * @param prezzo the prezzo
     */
    public PrimiPiatti(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }

    /**
     * Instantiates a new Primi piatti.
     *
     * @param nome      the nome
     * @param prezzo    the prezzo
     * @param tipoDietaEnum the tipo
     */
    public PrimiPiatti(String nome, double prezzo, DietaEnum tipoDietaEnum) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.tipoDietaEnum = tipoDietaEnum;
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
     * Gets prezzo.
     *
     * @return the prezzo
     */
    public double getPrezzo() {
        return prezzo;
    }

    /**
     * Sets prezzo.
     *
     * @param prezzo the prezzo
     */
    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    /**
     * Gets tipo.
     *
     * @return the tipo
     */
    public DietaEnum getTipoDieta() {
        return tipoDietaEnum;
    }

    /**
     * Sets tipo.
     *
     * @param tipo the tipo
     */
    public void setTipoDieta(DietaEnum tipo) {
        this.tipoDietaEnum = tipo;
    }

    /**
     * Print details.
     */
    public void printDetails() {
        System.out.println(
                this.nome + " - " + this.prezzo + " €"
        );
    }
}
