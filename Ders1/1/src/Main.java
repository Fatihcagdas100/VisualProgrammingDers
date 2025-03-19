import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        final int a = 5;
        int b = 010;//octal olarak ifade edilmiştir.
        System.out.println(b);
        int d = 0xF2;//hexadecimal olarak ifade edilmiştir.
        System.out.println(d);
        int e = 0b1111_0010;//binary olarak ifade edilmiştir.
        System.out.println(e);

        long f = 1414;//implicit casting
        System.out.println(f);
        long g = 123123123123L;//L suffix'i kullanılmazsa hata alınır
        System.out.println(g);

        float h = 14.12F;//F suffix'i kullanılmazsa hata alınır.
        System.out.println(h);

        double i = 21.46;
        double j = 1.23e-20;
        System.out.println(i);
        System.out.println(j);

        byte k = 127;//byte'ların kendilerine özel literal leri yoktur. integer tipini kullanırlar -128, 127

        char l = 'A';
        char m = 65;
        System.out.println(++m);//Bir artırıldı ve değeri 'B' oldu.

        /*
        WRAPPER CLASS
        int -> Integer
        double -> Double
        */
        int n = Integer.MAX_VALUE;
        n++;

        int o = Math.addExact(n,1);//hata kontrolü yapar.
        System.out.println(++o);

        //var anahtar kelimesi kullanılırken initialize edilmesi gerekir.
        //NULL değer atanamaz.
        //Array ataması yapılamaz.
        //Sadece local variable olarak kullanılabilir(Metotlar içerisinde).
        var p = 24;
        var r = 45.4;
        var s = 'A';

        double num1 = 0.02;
        double num2 = 0.03;
        System.out.println( num2 - num1);

        BigDecimal bd1 = new BigDecimal("0.02");
        BigDecimal bd2 = new BigDecimal("0.03");
        System.out.println(bd2.subtract(bd1));

        int x = 011;
        System.out.println(x);

    }
}
