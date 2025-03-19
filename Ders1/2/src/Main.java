public class Main {
    public static void main(String[] args)
    {
        int i = 10;
        double d = i;//impicit casting
        System.out.println(d);

        double m = 10.5;
        int n = (int)m;//explicit casting
        System.out.println(n);

        int a = 0b1111_0111_1111;
        System.out.println(a);
        byte b = (byte)a;//a değişkenindeki son 8 bit yok sayıldı
        System.out.println(b);

        String s1 = new String("BZ2");//string oluşturulurken nesne oluşur(primitive değilleridir.)
        String s2 = "BZ1";
        String s3 = s1 + " " + s2;
        System.out.println(s3);

        String s4 = "BZ";
        String s5 = s4 + 242;//Sayılarla da toplanabilirler
        System.out.println(s5);
        System.out.println(s5.toLowerCase());

        byte n1 = 10; // 0000_1010
        byte n2 = 9; // 0000_1001
        System.out.println(n1 & n2);
        System.out.println(n1 | n2);
        System.out.println(n1 << 1);
        System.out.println(n1 >> 1);
        System.out.println(n1 >>> 1);
    }
}