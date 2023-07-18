/**
 * The type Secondi piatti.
 */
public class SecondiPiatti {
    private String nome;
    private double prezzo;
    private Dieta tipoDieta;

    /**
     * Instantiates a new Secondi piatti.
     *
     * @param nome   the nome
     * @param prezzo the prezzo
     */
    public SecondiPiatti(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public SecondiPiatti(String nome, double prezzo, Dieta tipoDieta) {
        this.nome = nome;
        this.prezzo = prezzo;
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
    public Dieta getTipoDieta() {
        return tipoDieta;
    }

    /**
     * Sets tipo.
     *
     * @param tipo the tipo
     */
    public void setTipoDieta(Dieta tipo) {
        this.tipoDieta = tipoDieta;
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
