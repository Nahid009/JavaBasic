package JavaBasic;

import java.util.Scanner;

public class ReverseAnIntegerJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, sum = 0, temp, r;
        System.out.println("Inter any Input Number: ");

        num = input.nextInt();
        temp = num;
        while (temp != 0){
            r = temp % 10;
            sum = sum * 10 + r;
            temp = temp / 10 ;
        }
        System.out.println("The reverse number is a: " +sum);
    }
}
