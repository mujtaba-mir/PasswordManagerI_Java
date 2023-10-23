import java.util.Scanner;

public class encryptAndStore extends EncryptorDecryptor{

    public static void askAndEncrypt() {
        Scanner sc = new Scanner(System.in);
        // HashMap<String, String> credentials = new HashMap<>(); // This is your credentials storage

        System.out.println("How many credentials you want to save? (Enter a number)");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
           
                // Take userID
                System.out.println("Enter the user ID no: " + i);
                String userid = sc.next();

                // If user ID exists, keep asking for new input
                while (Main.credentials.containsKey(userid)) {
                    System.out.println("ERROR!!!! User ID already exists.\nEnter a different user ID: ");
                    userid = sc.next();
                }
                System.out.println("---ID collected---\n");

                // Take password
                System.out.println("Enter the password for " + userid);
                String password = sc.next();

                // Encrypt the password using a method from EncryptorDecryptor class
                EncryptorDecryptor pwd = new EncryptorDecryptor();
                String encryptedPassword = pwd.encryptionMethod(password);

                System.out.println("---Password saved---\n");
                Main.credentials.put(userid, encryptedPassword); //save the updated password

        } // for-loop
    }
}
