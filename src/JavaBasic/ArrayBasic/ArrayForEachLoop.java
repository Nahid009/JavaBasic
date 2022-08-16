package JavaBasic.ArrayBasic;

public class ArrayForEachLoop {
    public static void main(String[] args) {
        String[] names = {"Nahid Hasan", "Rakib", "Ayan", "Alamin", "Zitu"};
        System.out.println(names.length);

        for (String x : names) {
            System.out.println(x);
        }
    }
}
