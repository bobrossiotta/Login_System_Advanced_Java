import java.nio.file.LinkPermission;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * by bobrossiotta
         */
        // Strings
        // Login System
        Scanner bob = new Scanner(System.in);
        String user,password;
        String yessorno,newpass2;

        System.out.println("username:");
        user= bob.nextLine();

        System.out.println("password:");
        password=bob.nextLine();

        if (user.equals("bobrossiotta")&& password.equals("javakodding")){
            System.out.println("Succesful, Opening System");
        } else {
            System.out.println("Failed to login");
            System.out.println("Forgot your password? you can change your password if you want:");
            yessorno=bob.nextLine();
            if (yessorno.equals("yes")){
                System.out.println("New Password:");
                newpass2 = bob.nextLine();
                if (newpass2.equals("javakodding")){
                    System.out.println("This is the same password as your old ones");
                    System.out.println("Write New Password:");
                    newpass2=bob.nextLine();
                    System.out.println("Successful please login with your new password");

                }

            }else {
                System.out.println("Eror!System Locked...");
            }


        }









    }}