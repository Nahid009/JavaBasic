package JavaBasic;

import java.util.Scanner;

public class Series2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n, sum=0;

        System.out.println("Enter Any Number: ");
        n=input.nextDouble();

        for (double i = 1.5; i<=n; i=i+1){
            System.out.println(i+ " ");
            sum = sum+1;

        }
        System.out.println("");
        System.out.println(sum);
    }
}
