import java.util.ArrayList;
import java.util.Scanner;

public class Update {

    public static void ändraProfil(Scanner scanner, Telefonbok telefonbok){
        System.out.println("Ange förnamn på profilen du vill ändra");
        String förnamnÄndra = scanner.nextLine();
        System.out.println("Ange efternamn på profilen du vill ändra");
        String efternamnÄndra = scanner.nextLine();

        boolean hittadProfil = false;

        for (Profil profil : telefonbok.telefonbok) {
            if (förnamnÄndra.equalsIgnoreCase(profil.getNamn()) && efternamnÄndra.equalsIgnoreCase(profil.getEfternamn())){
                System.out.println("Vad vill du ändra på denna profilen:\n[1] - Förnamn\n[2] - Efternamn\n[3] - Ålder\n[4] - Adress\n[5] - Telefonnummer");
                String ändradEgenskap = scanner.nextLine();
                switch (ändradEgenskap){
                    case "1":
                        System.out.println("vilket namn vill du ändra till?");
                        String nyttNamn = scanner.nextLine();
                        profil.setNamn(nyttNamn);
                        break;
                    case "2":
                        System.out.println("vilket efternamn vill du ändra till?");
                        String nyttEfternamn = scanner.nextLine();
                        profil.setEfternamn(nyttEfternamn);
                        break;
                    case "3":
                        System.out.println("vilken ålder vill du ändra till?");
                        int nyÅlder = scanner.nextInt();
                        profil.setÅlder(nyÅlder);
                        break;
                    case "4":
                        System.out.println("vilken stad vill du ändra till?");
                        String nyStad = scanner.nextLine();
                        System.out.println("vilken postkod vill du ändra till?");
                        String nyPostkod = scanner.nextLine();
                        System.out.println("vilken gata vill du ändra till?");
                        String nyGata = scanner.nextLine();
                        System.out.println("vilket portnummer vill du ändra till?");
                        String nyPortnummer = scanner.nextLine();
                        Adress nyAdress = new Adress(nyStad, nyPostkod, nyGata, nyPortnummer);
                        profil.setAdress(nyAdress);
                        break;
                    case "5":
                        System.out.println("Hur många telefonnummer ska denna profil ha?");
                        int antalTelefonnummer = scanner.nextInt();
                        scanner.nextLine();

                        ArrayList<Integer> nytelefonnummerLista = new ArrayList<>();
                        for (int i = 0; i < antalTelefonnummer; i++) {
                            System.out.println("Telefonnummer " + (i + 1) + ":");
                            int telefonnummer = scanner.nextInt();
                            nytelefonnummerLista.add(telefonnummer);
                        }
                        profil.setTelefonnummerLista(nytelefonnummerLista);
                        break;

                }
                hittadProfil = true;
            }

        }
        if (!hittadProfil) {
            System.out.println("Ingen profil med det telefonnummret hittades");
        }





    }

}
