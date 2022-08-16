package JavaBasic;

import java.util.Scanner;

public class ArithmeticOperator {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int num1, num2, result;

        System.out.println("Print First number");
        num1 = number.nextInt();

        System.out.println("Print Second Number");
        num2 = number.nextInt();

        result =num1 +num2;
        System.out.println("Result Is Here :"+result);

    }
}
