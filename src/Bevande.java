public class Bevande {
    private String nome;
    private double prezzo;


    public Bevande(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }

    //recupare il dato
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void printDetails() {
        System.out.println(
                this.nome + " - " + this.prezzo + " €"
        );
    }
}
