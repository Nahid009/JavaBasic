package JavaBasic.ArrayBasic;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        int [][] number = new int[2][3];
        number [0] [0] = 10;
        number [0] [1] = 20;
        number [0] [2] = 30;
        number [1] [0] = 40;
        number [1] [1] = 50;
        number [1] [2] = 60;

        // For Loop Use In 2D Arrays :

        for (int row = 0; row < 2; row++){
            for (int columns = 0; columns < 3 ; columns++){
                System.out.print(" " +number[row] [columns]);
            }
            System.out.println();
        }





        /*
        System.out.println(number [0] [0]);
        System.out.println(number [0] [1]);
        System.out.println(number [0] [2]);
        System.out.println(number [0] [0]);
        System.out.println(number [0] [1]);
        System.out.println(number [0] [2]);
        */
    }
}
