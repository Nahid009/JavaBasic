package JavaBasic;

import java.util.Scanner;

public class CheckingVowelConsonant {
    public static void main(String[] args) {
        Scanner president = new Scanner(System.in);
        char tamim;
        System.out.println("Enter your name :");
        tamim = president.next().charAt(0);

        if (tamim == 'a'){
            System.out.println("Tamim Is a Vowel");
        } else if (tamim == 'e') {
            System.out.println("Tamim Is a Vowel");
            
        } else if (tamim == 'i') {
            System.out.println("Tamim Is a Vowel");
        } else if (tamim == 'o') {
            System.out.println("Tamim Is a Vowel");
        } else if (tamim == 'u') {
            System.out.println("Tamim Is a Vowel");
        }else {
            System.out.println("Asif == not !");
        }
    }
}
