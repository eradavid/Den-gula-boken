import java.util.Scanner;

public class Read {
    public static void sökEfternamn(Scanner scanner, Telefonbok telefonbok) {
        System.out.println("vilket efternamn vill du söka efter?");
        String sökEfterEfternamn = scanner.nextLine();

        Boolean hittatEfternamn = false;

        for (Profil profil : telefonbok.telefonbok) {

            if (profil.getEfternamn().equalsIgnoreCase(sökEfterEfternamn)) {
                System.out.println(profil);
                hittatEfternamn = true;
            }


        }
        if (!hittatEfternamn) {
            System.out.println("Efternamnet " + sökEfterEfternamn + " finns INTE i telefonboken");

        }
    }


        public static void sökAdress(Scanner scanner, Telefonbok telefonbok) {
            System.out.println("vilken adress vill du söka efter?");
            String sökEfterAdress = scanner.nextLine();

            Boolean hittadAdress = false;

            for (Profil profil : telefonbok.telefonbok) {
                Adress adress = profil.getAdress();

                if (adress.getStad().equalsIgnoreCase(sökEfterAdress) ||
                        adress.getPostkod().equalsIgnoreCase(sökEfterAdress) ||
                        adress.getGata().equalsIgnoreCase(sökEfterAdress) ||
                        adress.getPortnummer().equalsIgnoreCase(sökEfterAdress))
                {

                    System.out.println(profil);
                    hittadAdress = true;
                }


            }
            if (!hittadAdress) {
                System.out.println(sökEfterAdress + " finns INTE i telefonboken");

            }
        }
        public static void sökFörnamn(Scanner scanner, Telefonbok telefonbok) {
            System.out.println("vilket namn vill du söka efter?");
            String sökEfterNamn = scanner.nextLine();

            Boolean hittatNamn = false;

            for (Profil profil : telefonbok.telefonbok) {

                if (profil.getNamn().equalsIgnoreCase(sökEfterNamn)) {
                    System.out.println(profil);
                    hittatNamn = true;
                }


            }
            if (!hittatNamn) {
                System.out.println("Förnamnet " + sökEfterNamn + " finns INTE i telefonboken");

            }
        }

        public static void sökFritt(Scanner scanner, Telefonbok telefonbok){
                System.out.println("Sökning:");
                String sökEfterNågot = scanner.nextLine();

                Boolean hittat = false;

                for (Profil profil : telefonbok.telefonbok) {
                    Adress adress = profil.getAdress();

                    if (profil.getEfternamn().equalsIgnoreCase(sökEfterNågot) ||
                            adress.getStad().equalsIgnoreCase(sökEfterNågot) ||
                            adress.getPostkod().equalsIgnoreCase(sökEfterNågot) ||
                            adress.getGata().equalsIgnoreCase(sökEfterNågot) ||
                            profil.getNamn().equalsIgnoreCase(sökEfterNågot))
                    {
                        System.out.println(profil);
                        hittat = true;
                    }


                }
                if (!hittat) {
                    System.out.println(sökEfterNågot + " finns INTE i telefonboken");

                }
    }
}