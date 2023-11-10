import java.util.ArrayList;

public class Telefonbok {
    public static ArrayList<Profil> telefonbok = new ArrayList<>();

    public void PrintTelefonbokList(){
        printTelefonbok(telefonbok);
    }
    private void printTelefonbok(ArrayList<Profil> telefonbok){
        for (Profil Profil : telefonbok){
            System.out.println(Profil);
        }

    }


}
