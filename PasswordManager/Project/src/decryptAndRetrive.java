import java.util.Scanner;

public class decryptAndRetrive extends encryptAndStore{
    static Scanner sc = new Scanner(System.in);

    public static void askAndDecrypt() {
        boolean check = false;
      //check if there is any data
        boolean checkEmpty = Main.credentials.isEmpty();
        //if the Data is empty then show message
    if(checkEmpty) {
        System.out.println("\nThere are no credentials to Retrieved\n");
    }
    //if the Data is not empty then ask the user which one he wants to retrieve.
    else{
        do {
            System.out.println("Below is the list of the ID's saved.\nType the ID for which id you want the password?");

            // Display just the keys(that is the ID's)
            for (String key : Main.credentials.keySet()) {
                System.out.println(key);
            }

            //take user input for which id they want the password
            String whichId = sc.next();
            String encryptedPassword = Main.credentials.get(whichId);

            //check if the ID is present in the Map
            check = Main.credentials.containsKey(whichId);
            if (check) {
                //decrypting the password using method from EncryptorDecryptor class
                EncryptorDecryptor pwd = new EncryptorDecryptor();
                String decryptedPassword = pwd.decryptionMethod(encryptedPassword);
                System.out.println("The password  for " + whichId + " is: " + decryptedPassword);
            } else {
                System.out.println(" Sorry!! No such ID Exist\n Try Again\n");
            }//else-ends
        } while(check == false);

    } //checkEmptyt ka else
    }//askAndDecrypt method
}//main class
