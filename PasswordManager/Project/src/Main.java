import java.util.HashMap;
import java.util.Scanner;

public class Main {

    protected static HashMap<String, String> credentials = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String select;

        System.out.println("\nWelcome to GUPT CHEEZO KO GUPT RAKHO ");
        System.out.println("    ");
        System.out.println("Your personal P@$$W0RD MANAGER \uD83D\uDD10\uD83D\uDEE1️.\nWe're here to help you\nkeep your secrets secure and confidential\nat all times. Safely manage your passwords\nfor a worry-free digital experience.\n\n");

        do {
            System.out.println("*****MAIN-MENU*****");
            System.out.println("What would you like to do?\n1. Add Credentials\n2. Retrieve Credentials\n3. Delete Credentials\n4. Change Credentials\n");
            System.out.println("Enter Your Choice: ");
            int choice = sc.nextInt();

            // take user input from menu
            switch (choice) {
                case 1:
                    System.out.println("Taking You to The Credential Adding Page!");
                    encryptAndStore.askAndEncrypt();
                    break;
                case 2:
                    System.out.println("Taking you to the Credentials Retrieving Page");
                    decryptAndRetrive.askAndDecrypt();
                    break;
                case 3:
                    System.out.println("Taking you to the Credentials Deletion Page");
                    deleteCredentials.delete();
                    break;
                case 4:
                    System.out.println("Taking you to the Credentials Updation Page");
                    changeCredentials.changePassword();
                    break;
                default:
                    System.out.println("No Such Option");
            } //switch case ends here

            System.out.println("Do you want to return to MAIN MENU ?\n Y / N");
            select = sc.next();
        } while (select.equalsIgnoreCase( "Y"));

        System.out.println("Goodbye, Have a nice day!! :)");
    }// main method
}//main class
