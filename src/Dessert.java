/**
 * The type Dessert.
 */
public class Dessert extends Portata {
    private  Double  amountOfCalories;
    private Boolean alcoholic;
    private Boolean glutenFree;

    public Boolean isAlcoholic() {
        return alcoholic;
    }

    public void setAlcoholic(Boolean alcoholic) {
        this.alcoholic = alcoholic;
    }

    public Boolean getGlutenFree() {
        return glutenFree;
    }

    public void setGlutenFree(Boolean glutenFree) {
        this.glutenFree = glutenFree;
    }

    public Double getAmountOfCalories() {
        return amountOfCalories;
    }

    public void setAmountOfCalories(Double amountOfCalories) {
        this.amountOfCalories = amountOfCalories;
    }

    public Dessert(String nome, Double prezzo, Tipo tipoDietaEnum, Boolean alcoholic, Double amountOfCalories, Boolean glutenFree) {
        super(nome, prezzo, tipoDietaEnum);
        this.alcoholic = alcoholic;
        this.amountOfCalories = amountOfCalories;
        this.glutenFree = glutenFree;
    }
    @Override
    public void printPortata() {
        super.printPortata();
        System.out.println( "Calorie = "+ this.amountOfCalories );
        System.out.println(alcoholic ? "Contiene Alcol" : "Non contiene Alcol");
        System.out.println(glutenFree ? "Non contiene glutine\n" : "Contiene glutine\n");
    }
}