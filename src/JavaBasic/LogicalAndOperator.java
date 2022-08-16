package JavaBasic;

import java.util.Scanner;



public class LogicalAndOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char word ;
        System.out.println("Enter Any Number");
        word = input.next().charAt(0);
        if (word >= 'a' && word <= 'z'){
            System.out.println("Small Latter");
        } else if (word<='A' && word<='Z') {
            System.out.println("Capital Latter");
            
        }else {
            System.out.println("It's not enough");
        }


    }
}
