public class OdevSwap
{
    //1010 ile 0101 sayılarının ek bir değişken kullanılmadan bellekteki yerleri nasıl değiştirilir.
    public static void main(String[] args)
    {
        int a = 0b1010;    //10
        int b = 0b0101;    //5
        System.out.println(a);
        System.out.println(b);
        a = a ^ b; // 1010 ^ 0101 = 1111
        b = a ^ b; // 1111 ^ 0101 = 1010
        a = a ^ b; // 1111 ^ 1010 = 0101
        System.out.println(a);
        System.out.println(b);
    }
    //XOR kullanılarak swap işlemi gerçekleştirilebilir.
}
