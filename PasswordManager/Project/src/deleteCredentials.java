import java.util.Scanner;

public class deleteCredentials {
    public static void delete(){
        boolean check = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("What would you like to do?\n1.Delete All Credentials!\n2.Delete a specific credential");
        int choice = sc.nextInt();

        sc.nextLine(); // Consume the newline character

        switch (choice){
            case 1:
                //warn user
                System.out.println("W-A-R-N-I-N-G!!\nDoing this will remove all ID's and passwords permanently. Do you wish to countinue?\nY/N");
                String yesNo = sc.nextLine();
                if(yesNo.equalsIgnoreCase("y")){

                    boolean checkEmpty = Main.credentials.isEmpty() ;
                    //check if the map is already empty, if yes then tell user,
                    if(checkEmpty){
                        System.out.println("There are no credential to delete!!");

                    }else{ //if not empty, then delete all the credentials
                        Main.credentials.clear();
                        System.out.println("All credentials have been deleted successfully!!");
                    }//check empty wala if-else
                }//yes-no wala if-else
            break;

            case 2:
                do{
                    // Display just the keys(that is the ID's)
                    for (String keys : Main.credentials.keySet()) {
                        System.out.println(keys);
                    }//for-loop1

                    System.out.println("Please enter the id that you wish to delete from the above list!");


                        //read the input from user

                        String input = sc.nextLine();

                        //check if the entered id exist, if yes then delete
                        check = Main.credentials.containsKey(input);
                        if(check){
                            Main.credentials.remove(input);
                            System.out.println("Credentials removed successfully!! ");
                        }else{
                            System.out.println("Sorry!! No such ID Exist\n Try Again\n");
                        }
                }while(check == false);

            break;
        }//switch case
    }//method
}
