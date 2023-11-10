import java.util.ArrayList;
import java.util.Scanner;

public class Create{
    public static void createOption(Scanner scanner, Telefonbok telefonbok){
        System.out.println("Namn:");
        String namnProfil = scanner.nextLine();
        System.out.println("Efternamn:");
        String efternamnProfil = scanner.nextLine();
        System.out.println("Ålder:");
        int ålderProfil = Integer.parseInt(scanner.nextLine());
        System.out.println("Stad");
        String stadAdressProfil = scanner.nextLine();
        System.out.println("Postkod");
        String postkodAdressProfil = scanner.nextLine();
        System.out.println("Gata");
        String gataAdressProfil = scanner.nextLine();
        System.out.println("Portnummer");
        String portnummerAdressProfil = scanner.nextLine();
        System.out.println("Hur många telefonnummer?");
        int antalTelefonnummer = scanner.nextInt();
        scanner.nextLine();

        ArrayList<Integer> telefonnummerLista = new ArrayList<>();
        for (int i = 0; i < antalTelefonnummer; i++) {
            System.out.println("Telefonnummer " + (i + 1) + ":");
            int telefonnummer = scanner.nextInt();
            telefonnummerLista.add(telefonnummer);
        }


        Adress adress = new Adress(stadAdressProfil, postkodAdressProfil, gataAdressProfil, portnummerAdressProfil);
        Profil profil = new Profil(namnProfil, efternamnProfil, ålderProfil, adress, telefonnummerLista);
        Telefonbok.telefonbok.add(profil);
        System.out.println(namnProfil + " tillagd");


    }


}
