package JavaBasic;

public class JavaMathClass {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;



        int absolute = Math.abs(y);
        System.out.println("absolute :" +absolute);

        int max = Math.max(x,y);

        System.out.println("Maximum =" +max);

        int min = Math.min(x,y);

        System.out.println("Minimum =" +min);


        double power = Math.pow(x, y);
        System.out.println("x to the power y = " +power);

      int round=Math.round(8.8f);
        System.out.println("The Round is :"+round);


        double pi = Math.PI;
        System.out.println("The Result is : "+pi);
    }
}
