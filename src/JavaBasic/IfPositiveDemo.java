package JavaBasic;

import java.util.Scanner;

public class IfPositiveDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter your integer : ");
        num = input.nextInt();

        if (num>0){
            System.out.println("Positive : ");
        }
        else {
            System.out.println("Negative");
        }
        if (num<0){
            System.out.println("Negative");
        }
        else {
            System.out.println("Equal to Zero");
        }

    }
}
