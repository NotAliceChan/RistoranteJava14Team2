public class Portata {
    private String nome;
    private Double prezzo;
    private Dieta tipoDieta;

    public Portata(String nome, Double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public Portata(String nome, Double prezzo, Dieta tipoDieta) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.tipoDieta = tipoDieta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }

    public Dieta getTipoDieta() {
        return tipoDieta;
    }

    public void setTipoDieta(Dieta tipoDieta) {
        this.tipoDieta = tipoDieta;
    }

    @Override
    public String toString() {
        return this.nome + " - " + this.prezzo + " € " + "(" + tipoDieta + ")";
    }
}
