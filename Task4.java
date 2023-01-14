package Homework2;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("How old are you? ");
        int age= input.nextInt();
        if (age>=18) {
            System.out.println( "Driver license issued");
        }else{
            System.out.println( "You need to get learner permit");
        }
    }
}
