package JavaBasic.ArrayBasic;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] number = new double[5];
        double sum = 0;

        System.out.print("Enter 5 Numbers: ");

        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextDouble();

        }

        //number[0] = 1;
        //number[1] = 2;
        //number[2] = 3;
        //number[3] = 4;
        //number[4] = 5;


        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
        }


        System.out.println("The Sum Is :" + sum);

        double avg = sum / number.length ;
        System.out.println("The Average Is :"+avg);



    }
}
