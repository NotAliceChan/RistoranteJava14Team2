/**
 * The type Dessert.
 */
public class Dessert {
    private String nome;
    private double prezzo;

    //TODO dietaEnum
    private DietaEnum tipoDietaEnum;

    /**
     * Instantiates a new Dessert.
     *
     * @param nome   the nome
     * @param prezzo the prezzo
     */
    public Dessert(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }

    /**
     * Instantiates a new Dessert.
     *
     * @param nome      the nome
     * @param prezzo    the prezzo
     * @param tipoDietaEnum the tipo dieta
     */
    public Dessert(String nome, double prezzo, DietaEnum tipoDietaEnum) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.tipoDietaEnum = tipoDietaEnum;
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
     * Sets prezzo.
     *
     * @param prezzo the prezzo
     */
    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    /**
     * Sets tipo dieta.
     *
     * @param tipoDietaEnum the tipo dieta
     */
    public void setTipoDieta(DietaEnum tipoDietaEnum) {
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
     * Gets prezzo.
     *
     * @return the prezzo
     */
    public Double getPrezzo() {
        return this.prezzo;
    }

    /**
     * Gets tipo dieta.
     *
     * @return the tipo dieta
     */
    public DietaEnum getTipoDieta() {
        return tipoDietaEnum;
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
