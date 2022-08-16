package JavaBasic;

import java.util.Scanner;

public class SumOfDigitJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0, num, r, temp;
        System.out.println("Input Any Number : ");

        num = input.nextInt();
        temp = num;
        while (temp  != 0){
            r = temp % 10;
            sum = sum + r;
            temp = temp / 10;
        }
        System.out.println("The sum number is " +sum);
    }
}
