/**
 * The type Dessert.
 */
public class Dessert {
    private String nome;
    private double prezzo;

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
     * Print details.
     */
    public void printDetails() {
        System.out.println(
                this.nome + " - " + this.prezzo + " €"
        );
    }
}
