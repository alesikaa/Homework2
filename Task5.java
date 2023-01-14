package Homework2;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println( "Please input city");

        String city=scan.next();

        System.out.println("Please enter temperature");
        int tempFahrenheit=scan.nextInt();
        double tempCelsius=(tempFahrenheit-32)* .5566;
        System.out.println("The tempereture in the city "+city+" is "+tempCelsius+" celsius");


    }
}
