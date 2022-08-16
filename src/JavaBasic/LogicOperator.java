package JavaBasic;

import java.util.Scanner;

public class LogicOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char number;
        System.out.println("Enter Any Number");
        number = input.next().charAt(0);
        if (number == 'a' || number == 'e' || number == 'i' || number == 'o' || number == 'u'){
            System.out.printf("Vowel");
        }else {
            System.out.printf("Consonant");
        }
    }
}
