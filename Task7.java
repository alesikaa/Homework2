package Homework2;
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("How many  years have you worked? ");
        int year= scan.nextInt();
        if (year>=5){
            System.out.println("You are eligible for bounce. What is your annual salary?");
            int salary=scan.nextInt();
            if (salary>=50000){
                System.out.println("You are eligible for $5000 bounce");
            }else {
                System.out.println("You are eligible for $3000");
            }
        }

    }
}
