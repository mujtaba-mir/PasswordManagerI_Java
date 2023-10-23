import java.util.Random;
import java.util.Scanner;

public class EncryptorDecryptor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }

    // Function to add random characters between the characters of the user's input
    public static String encryptionMethod(String input) {
        String encrypted = "";
        Random random = new Random();

        for (int i = 0; i < input.length(); i++) {
            encrypted += input.charAt(i);

            char randomChar = (char) (random.nextInt(26) + 'a');
            encrypted += randomChar;
        }
        return encrypted;
    }

    public static String decryptionMethod(String input) {
        String decrypted = "";
        //here we have used i+=2 to skip the random characters that have been
        //added after each character in the password
        for (int i = 0; i < input.length(); i += 2) {
            decrypted += input.charAt(i);
        }
        return decrypted;
    }
}
