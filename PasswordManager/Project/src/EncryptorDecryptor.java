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
            encrypted += input.charAt(i); //takes one cahraacter from user input ans saves it to the encrypted variable

            char randomChar = (char) (random.nextInt(26) + 'a');
            encrypted += randomChar;    //the generated random character is added in front of the previous character, which was taken fromuser input
        }
        return encrypted;
    }//encryption function ka end
    
    // Function to remove random characters, from between the characters from the encrypted password
    public static String decryptionMethod(String input) {
        String decrypted = "";
        
        for (int i = 0; i < input.length(); i += 2) {
            decrypted += input.charAt(i);
        }
        return decrypted;
    }
}
