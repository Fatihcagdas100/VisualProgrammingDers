public class Main {
    public static void main(String[] args)
    {
        int a = 10;
        int b = 9;
        System.out.println(bitSwapRequired(a,b));

    }
    public static int bitSwapRequired(int a, int b)
    {
        int xor = a ^ b;//a ile b xor'lanması demek yeni gösterimde farklı bit kadar 1 olması demek

        //int count = Integer.bitCount(c);    (böylelikle kısaca farklı bir sayısı bulunabilir)

        //Bu da onun manuel halidir.
        int count = 0;
        while(xor!=0)
        {
            if((xor & 1) == 1)
                count++;
            xor = xor >>> 1;
        }
        return count;
    }
}