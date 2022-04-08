

import java.util.Scanner;

public class SquaresAndRectangles1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the height of the geometric figure: ");

        double rectHeight = scan.nextDouble();

        System.out.println("Input the width of the geometric figure");

        double rectWidth = scan.nextDouble();

        if((rectWidth <= 0) || (rectHeight <= 0)){
            System.out.println("ERROR, none of the sides can be a negative number!!!");
        }

        else if(rectWidth == rectHeight){
            System.out.printf("The geometric figure is a square.%n" +
                    "The circumference of the figure is: " + (((rectHeight+rectWidth) * 2)) + "%nThe area of the figure is: " +
                    rectHeight*rectWidth);
        } else {
            System.out.printf("The shape is a rectangle%n" +
                    "The circumference of the shape is: " + (((rectHeight+rectWidth) * 2)) + "%nThe area of the figure is: " +
                    rectHeight*rectWidth);

        }


    }
}
