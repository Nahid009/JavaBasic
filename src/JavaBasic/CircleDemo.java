package JavaBasic;

import java.util.Scanner;

public class CircleDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double Radius, Area;
        System.out.println("Enter Radius");
        Radius = input.nextDouble();

        Area = 3.1413 * Radius * Radius;
        System.out.println("Area of circle :"+Area);


    }
}
