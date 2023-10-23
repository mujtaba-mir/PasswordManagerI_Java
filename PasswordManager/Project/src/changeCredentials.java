import java.util.Scanner;

public class changeCredentials {
    public static void changePassword() {
        Scanner sc = new Scanner(System.in);

        boolean check = false;
        
        //check if there is any data
        boolean checkEmpty = Main.credentials.isEmpty();
        //if the Data is empty then show message
        if(checkEmpty) {
            System.out.println("\nThere are no credentials to Update\n");
        }
        //if the Data is not empty then ask the user which one he wants to retrieve.
        else{
            do {
                System.out.println("Below is the list of the ID's saved.\nType the ID for which id you want\nto update  the password?");

                // Display just the keys(that is the ID's)
                for (String key : Main.credentials.keySet()) {
                    System.out.println(key);
                }

                //takes the input for which id the user wants to change the password
                String userID = sc.nextLine();
                //if the user ID is in the list, then take new Password for that
                check = Main.credentials.containsKey(userID);
                if (check) {
                    System.out.print("Enter the new password: ");
                    String newPassword = sc.nextLine();

                    //Encrypt and change
                    EncryptorDecryptor pwd = new EncryptorDecryptor();
                    String encryptedNewPassword = pwd.encryptionMethod(newPassword);

                    Main.credentials.put(userID, encryptedNewPassword);
                    System.out.println("---Password saved---\n");

                } else {
                    System.out.println("User ID not found. Try Again.");
                }//else ends here
            } while(check == false);

        } //checkEmptyt ka else
    }
}
