import java.util.Scanner;

public class Magazin {
    public static void main(String[] args) {

        System.out.printf("Welcome to our online text-based shop!" +
                "%n (1) Please Enter the number 1 if you are planning to buy clothes." +
                "%n (2) Please Enter the number 2 if you are planning to buy some shoes." +
                "%n (3) Please Enter the number 3 if you are planning to buy something else." +
                "%n%n Please make your choice now: ");

        Scanner scan = new Scanner(System.in);
        byte shopChoice = scan.nextByte();
        switch (shopChoice) {
            case 1:
                System.out.println("Please enter the price of the clothing item you have chosen: ");
                float itemPrice = scan.nextFloat();
                if (itemPrice <= 0 || itemPrice > 1000) {
                    System.out.println("Error, please try again later or contact costumer support.");
                } else {
                    System.out.println("The price of the item with the added discount is going to be: " + itemPrice * .8 + " JPN");
                }
                break;
            case 2:
                System.out.println("Please enter the price of the footwear item you have chosen: ");
                itemPrice = scan.nextFloat();
                if (itemPrice <= 0 || itemPrice > 1000) {
                    System.out.println("Error, please try again later or contact costumer support.");
                } else {
                    System.out.println("The price of the item with the added discount is going to be: " + itemPrice * .9 + " JPN");
                }
                break;
            case 3:
                System.out.println("Please enter the price of the item you have chosen: ");
                itemPrice = scan.nextFloat();
                if (itemPrice <= 0 || itemPrice > 1000) {
                    System.out.println("Error, please try again later or contact costumer support.");
                } else {
                    System.out.println("The price of the item with the added discount is going to be: " + itemPrice * .95 + " JPN");
                }
                break;
            default:
                System.out.println("Something went wrong!!!");

        }

    }
}
