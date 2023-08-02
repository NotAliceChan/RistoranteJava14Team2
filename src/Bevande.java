/**
 * The type Bevande.
 */
public class Bevande extends Portata {



    //TODO tutte le classi figli di portate devono avere almeno due campi in più
    private Integer gradoAlcolico;
    private Boolean isCold;


    public Bevande(String nome, Double prezzo, Integer gradoAlcolico,Boolean isCold, DietaEnum tipoDietaEnum) {
        super(nome, prezzo, tipoDietaEnum);
        this.gradoAlcolico = gradoAlcolico;
        this.isCold = isCold;
    }

    @Override
    public void printPortata() {
        super.printPortata();
        if(this.gradoAlcolico == 0){
        } else {
            System.out.println("Grado alcolico: " + this.gradoAlcolico + "%");
        }
        if(isCold) {
            System.out.print("Bevanda ghiacciata\n\n");

        }
        else {
            System.out.print("Temperatura ambiente\n\n");
        }
    }
}
