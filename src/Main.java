import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Telefonbok telefonbok = new Telefonbok();
        boolean stillGoing = true;
        System.out.println("\nDen gula boken!");
        System.out.println("[1] - Gästanvändare");
        System.out.println("[2] - Administratör");
        Scanner scanner = new Scanner(System.in);
        String userType = scanner.nextLine();
        while (stillGoing) {
            switch (userType) {
                case "1":
                    System.out.println("[1] - Sökning på efternamn\n[2] - Sökning på adress\n[3] - Sökning på förnamn\n[4] - Frisökning\n[quit] - avsluta programmet");
                    String userChoiceGuest = scanner.nextLine();
                    switch (userChoiceGuest) {
                        case "1":
                            Read.sökEfternamn(scanner, telefonbok);
                            break;
                        case "2":
                            Read.sökAdress(scanner, telefonbok);
                            break;
                        case "3":
                            Read.sökFörnamn(scanner, telefonbok);
                            break;
                        case "4":
                            Read.sökFritt(scanner, telefonbok);
                            break;
                        case "quit":
                            stillGoing = false;
                            break;
                    }
                    break;

                case "2":
                boolean correctPassword = true;
                System.out.println("Ange lösenord:");
                String password = scanner.nextLine();

                if (password.equals("Admin123")){correctPassword = true;}
                else {correctPassword=false;
                System.out.println("Ogiltigt lösenord, försök igen");}


                while (correctPassword) {

                        Scanner userChoiceAdminScanner = new Scanner(System.in);

                        System.out.println("[1] - Lägg till profil\n[2] - Sök i telefonboken\n[3] - Ändra en profil\n[4] - Radera profil\n[5] - Skriv ut hela telefonboken\n[quit] - Avsluta");
                        String userChoiceAdmin = userChoiceAdminScanner.nextLine();

                        switch (userChoiceAdmin) {
                            case "1":
                                Create.createOption(userChoiceAdminScanner, telefonbok);
                                break;
                            case "2":
                                System.out.println("[1] - Sökning på efternamn\n[2] - Sökning på adress\n[3] - Sökning på förnamn\n[4] - Frisökning ");
                                String userChoiceAdminSearch = scanner.nextLine();
                                switch (userChoiceAdminSearch) {
                                    case "1":
                                        Read.sökEfternamn(userChoiceAdminScanner, telefonbok);
                                        break;
                                    case "2":
                                        Read.sökAdress(userChoiceAdminScanner, telefonbok);
                                        break;
                                    case "3":
                                        Read.sökFörnamn(userChoiceAdminScanner, telefonbok);
                                        break;
                                    case "4":
                                        Read.sökFritt(userChoiceAdminScanner, telefonbok);
                                        break;
                                }
                                break;
                            case "3":
                                Update.ändraProfil(userChoiceAdminScanner, telefonbok);
                                break;
                            case "4":
                                Delete.deleteOption(userChoiceAdminScanner, telefonbok);
                                break;
                            case "5":
                                telefonbok.PrintTelefonbokList();
                                break;
                            case "quit":
                                stillGoing = false;
                                correctPassword = false;
                                break;
                        }


                    }

                }




            }
        }
    }

