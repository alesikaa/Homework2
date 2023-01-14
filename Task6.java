package Homework2;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Do you have Credit Card?");
        String creditCard= scan.next();
        if (creditCard.equals("no")) {
            System.out.println("Would you like to apply for one ?");
        }else {
            System.out.println("What is the balance on the card?");
            int balance= scan.nextInt();
            if (balance>1000) {
                System.out.println("Please pay it off immediately");
            }else {
                System.out.println( "You can spend more");
            }
        }
    }
}
