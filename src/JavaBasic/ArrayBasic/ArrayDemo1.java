package JavaBasic.ArrayBasic;

public class ArrayDemo1 {
    public static void main(String[] args) {

        //   String [] names;
        int[] number = new int[10];
        int[] number2 = new int[15];   // One Line Declaration Creation;
        number[0] = 10;
        number[1] = 20;
        number[2] = 30;
        number[3] = 40;
        number[4] = 50;
        number[5] = 40;
        number[6] = 30;
        number[7] = 20;
        number[8] = 10;
        number[9] = 40;

        // Array Sum
        int sum = number[6] + number[2] + number[7];
        System.out.println("Sum = " + sum);

        // Length outPut Show System
        int len = number.length;
        System.out.println("Array size is :" + len);


    }
}
