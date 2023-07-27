/**
 * The type Portata.
 */
public class Portata {
    private String nome;
    private Double prezzo;
    private DietaEnum tipoDietaEnum;


    /**
     * Instantiates a new Portata.
     *
     * @param nome          the nome
     * @param prezzo        the prezzo
     * @param tipoDietaEnum the tipo dieta enum
     */
    public Portata(String nome, Double prezzo, DietaEnum tipoDietaEnum) {
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
    public Double getPrezzo() {
        return prezzo;
    }

    /**
     * Sets prezzo.
     *
     * @param prezzo the prezzo
     */
    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
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
     * Sets tipo dieta.
     *
     * @param tipoDietaEnum the tipo dieta enum
     */
    public void setTipoDieta(DietaEnum tipoDietaEnum) {
        this.tipoDietaEnum = tipoDietaEnum;
    }

    @Override
    public String toString() {
        if (tipoDietaEnum ==null){
            return this.nome + " - " + this.prezzo + " € ";
        } else {
            return this.nome + " - " + this.prezzo + " € " + "(" + this.tipoDietaEnum.printWithColor() + ")";
        }
    }

    public void print(){
        System.out.println(this.nome+ "stampare tutte le info");
    }

    //TODO sistemare
    public void print(ColorEnum colorEnum){
        System.out.println(this.nome+ "stampare tutte le info"+ colorEnum.getEscapeSequence());
    }
}
