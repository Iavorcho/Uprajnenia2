import java.util.Scanner;

public class Bonusi {
    public static void main(String[] args) {
        float zaplata;
        float duratioWorked;

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the duration of time for which you have worked in the company in years, whole numbers: ");
        duratioWorked = scan.nextFloat();

        System.out.println("Please enter your monthly salary in EUR: ");
        zaplata = scan.nextFloat();

        if (zaplata > 10000 || zaplata < 1000 || duratioWorked < 0 || duratioWorked > 50){
            System.out.println("Please check the values you have entered and try again!!!");

        } else if (duratioWorked > 15){
            System.out.println("The monthly bonus you'll receive is going to be: " + (zaplata * 0.1) + "EUR");
        } else if (duratioWorked > 10){
            System.out.println("The monthly bonus you'll receive is going to be: " + (zaplata * 0.07) + "EUR");
        } else if (duratioWorked > 5) {
            System.out.println("The monthly bonus you'll receive is going to be: " + (zaplata * 0.05) + "EUR");
        } else {
            System.out.println("Sorry, you will not receive any bonus, or the data you have entered is incorrect");
        }
    }
}
