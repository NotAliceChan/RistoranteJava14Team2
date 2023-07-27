/**
 * The type Dessert.
 */
public class Dessert extends Portata {
    private Integer levelOfSweetness;
    private  boolean  coldDessert;

    public Integer getLevelOfSweetness() {
        return levelOfSweetness;
    }

    public boolean getColdDessert() {
        return coldDessert;
    }

    public void setLevelOfSweetness(Integer levelOfSweetness) {
        this.levelOfSweetness = levelOfSweetness;
    }

    public void setColdDessert(boolean coldDessert) {
        this.coldDessert = coldDessert;
    }

    public Dessert(String nome, Double prezzo, Integer levelOfSweetness, boolean coldDessert ) {
        super(nome, prezzo);
        this.levelOfSweetness = levelOfSweetness;
        this.coldDessert = coldDessert;
    }

    public Dessert(String nome, Double prezzo, DietaEnum tipoDietaEnum) {
        super(nome, prezzo, tipoDietaEnum);
    }
}