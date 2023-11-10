import java.util.Scanner;

public class Delete {

    public static void deleteOption (Scanner scanner,Telefonbok telefonbok){
        System.out.println("Ange förnamn på profilen du vill radera");
        String raderaPersonFörnamn = scanner.nextLine();
        System.out.println("Ange efternamn på profilen du vill radera");
        String raderaPersonEfternamn = scanner.nextLine();

        Boolean RaderadProfil = false;

        for (Profil profil : Telefonbok.telefonbok) {
            if (profil.getNamn().equalsIgnoreCase(raderaPersonFörnamn) && profil.getEfternamn().equalsIgnoreCase(raderaPersonEfternamn)){
                Telefonbok.telefonbok.remove(profil);
                System.out.println(profil.getNamn()+ " " + profil.getEfternamn() + " är nu raderat");
                RaderadProfil = true;
                return;

            }

            }
        if (!RaderadProfil){
            System.out.println(raderaPersonFörnamn+ " " +raderaPersonEfternamn + " finns inte i telefonboken");

        }



    }

}

