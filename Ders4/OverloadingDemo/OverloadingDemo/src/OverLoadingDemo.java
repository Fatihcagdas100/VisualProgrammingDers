public class OverLoadingDemo {
    public static void main(String[] args) {
        //System.out.println(max(1,2)); Ambigous invocation error verir compiler hangi fonksiyopnu seçeceğini bilemez
        System.out.println(max(1,2.0));
        System.out.println(max(1.0,2.0));
    }
    public static double max(int num1, double num2) {
        if(num1 > num2)
            return num1;
        else
            return num2;
    }
    public static double max(double num1, double num2) {
        if(num1 > num2)
            return num1;
        else
            return num2;
    }
}
