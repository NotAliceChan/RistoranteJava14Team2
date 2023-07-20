/**
 * The type Bevande.
 */
public class Bevande {
    private String nome;

    //TODO dobbiamo usare sempre gli oggetti Double
    private double prezzo;

    /**
     * Instantiates a new Bevande.
     *
     * @param nome   the nome
     * @param prezzo the prezzo
     */
    public Bevande(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }

    /**
     * Gets nome.
     *
     * @return the nome
     */
//recupare il dato
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
     * Print details.
     */
    public void printDetails() {
        System.out.println(
                this.nome + " - " + this.prezzo + " €");
    }
}
