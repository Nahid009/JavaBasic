package JavaBasic;

import java.util.Scanner;

public class Farenheite {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            double farn, cels;

            System.out.println("Farenheite: ");
            cels = input.nextDouble();

            cels = 0.5 * cels - 32;

            System.out.println("Celsius = "+cels);

        }
    }

