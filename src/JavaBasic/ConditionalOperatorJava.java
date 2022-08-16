package JavaBasic;


import java.util.Scanner;

public class ConditionalOperatorJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1, number2, large;
        System.out.println("Enter Two Number :");
        number1 = input.nextInt();
        number2 = input.nextInt();

        large = (number1 > number2) ? number1 :number2;   // Conditional Operator Use
        System.out.println("Large number = " +large);
    }
}
