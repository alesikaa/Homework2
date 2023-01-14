package Homework2;

public class Task2 {
    public static void main(String[] args) {
        double mortgageRate=4.5;
        int mortgagePrice=450000;
        if (mortgageRate>4.5) {
            System.out.println( "You will not buy a house");

        }else {
            System.out.println("You are consider to buy a house");
        }
        if (mortgagePrice>200000){
            System.out.println( "you will take a loan");
        }else {
            System.out.println("You will pay cash");
        }
    }
}
