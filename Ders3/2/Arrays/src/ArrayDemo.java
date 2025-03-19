import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        /*double[] scores = new double[5];
        double nums[], num;
        double[] numbers = {1.0, 2.0, 3.0};

        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.toString());//hash kod yazdırır.*/

        /*int[] source = {1,2,3};
        int[] target = new int[3];
        System.arraycopy(source, 0, target,0, source.length);
        System.out.println(Arrays.toString(target));*/

        //printArray(new int[] {1,2,3,4});

        int[] numbers = {1,2,3};
        int num = 4;
        changeArgs(numbers, num);
        System.out.println(Arrays.toString(numbers));
        System.out.println(num);
    }
    public static void printArray(int[] array) {
        for(int element:array)
            System.out.println(element);
    }
    public static void changeArgs(int[] scores, int var){
        for(int i = 0; i<scores.length; i++)
            scores[i]++;
        var++;
    }
}
