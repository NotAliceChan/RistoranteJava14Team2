/**
 * The type Primi piatti.
 */
public class PrimiPiatti extends Portata {

    private Integer calorie;

    private Boolean forWorkout;

    public PrimiPiatti(String nome, Double prezzo, Tipo tipoDietaEnum, Integer calorie, Boolean forWorkout)
    {
        super(nome, prezzo, tipoDietaEnum);
        this.calorie = calorie;
        this.forWorkout = forWorkout;
    }

    @Override
    public void printPortata() {
        super.printPortata();
        System.out.println("\nCalorie: " + calorie + " Kcal " +
                "\nPasto per ForWorkout" + (forWorkout ? "si" : "No"));

    }
}