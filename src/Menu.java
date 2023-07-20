import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Portata> portataList;

    public Menu() {
        this.portataList = new ArrayList<>();
    }

    public void addPortata(Portata portata){
        portataList.add(portata);
    }

    public void setPortata(int index, Portata element){
        portataList.set(index, element);
    }

    public void removePortata(int index){
        portataList.remove(index);
    }



    public void printMenu() {
        for (Portata portata : portataList) {
            System.out.println(portata);
        }
    }

    public void printMenu(Dieta tipoDieta) {
        // inizio sezione primi piatti

        //TODO approfondire
        for (Portata portata: portataList) {
            if(portata.getTipoDieta() == tipoDieta){
                //Stampo la portata
            }
        }
    }
}