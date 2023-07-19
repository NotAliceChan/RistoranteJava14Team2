/**
 * The type Dessert.
 */
public class Dessert {
    private String nome;
    private double prezzo;
    private Dieta tipoDieta;

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
     * @param tipoDieta the tipo dieta
     */
    public Dessert(String nome, double prezzo, Dieta tipoDieta) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.tipoDieta = tipoDieta;
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
     * @param tipoDieta the tipo dieta
     */
    public void setTipoDieta(Dieta tipoDieta) {
        this.tipoDieta = tipoDieta;
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
    public Dieta getTipoDieta() {
        return tipoDieta;
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
