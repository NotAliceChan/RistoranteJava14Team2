/**
 * The type Dessert.
 */
public class Dessert extends Portata {
    private  Double  amountOfCalories;
    private boolean containsAlcohol;

    public boolean isContainsAlcohol() {
        return containsAlcohol;
    }

    public void setContainsAlcohol(boolean containsAlcohol) {
        this.containsAlcohol = containsAlcohol;
    }

    public Double getAmountOfCalories() {
        return amountOfCalories;
    }

    public void setAmountOfCalories(Double amountOfCalories) {
        this.amountOfCalories = amountOfCalories;
    }

    public Dessert(String nome, Double prezzo, DietaEnum tipoDietaEnum, boolean isItAlcoholic, Double  amountOfCalories ) {
        super(nome, prezzo, tipoDietaEnum);
        this.containsAlcohol = isItAlcoholic;
        this.amountOfCalories = amountOfCalories;
    }

    @Override
    public void printPortata() {
        super.printPortata();
        System.out.println( "Calorie : "+ this.amountOfCalories );
        System.out.println(containsAlcohol ? "Questo dolce contiene Alcol\n" : "Questo dolce non contiene Alcol\n");
    }
}