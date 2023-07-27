/**
 * The type Bevande.
 */
public class Bevande extends Portata {

    //TODO tutte le classi figli di portate devono avere almeno due campi in più
    private Integer gradoAlcolico;


    public Bevande(String nome, Double prezzo, Integer gradoAlcolico, DietaEnum tipoDietaEnum) {
        super(nome, prezzo, tipoDietaEnum);
        this.gradoAlcolico = gradoAlcolico;
    }

    @Override
    public void printPortata() {
        super.printPortata();
        System.out.println("Grado alcolico: " + this.gradoAlcolico + "%\n");
    }
}
