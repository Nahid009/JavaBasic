package JavaBasic;

import java.util.Scanner;

public class Series1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, sum=0;
        System.out.println("Enter The Last Number : ");
        n=input.nextInt();

        for (int i=1; i<=n; i=i+3){
            System.out.print(i+ "  ");
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
