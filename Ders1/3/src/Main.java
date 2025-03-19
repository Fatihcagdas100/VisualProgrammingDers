public class Main
{
    public static void main(String[] args)
    {
        int a = 10;
        if(true & isPositive(a))//short circuit (ilk operatör sağlıyor ise ikinciye bakılmaz)
            System.out.println(a + " is positive");
    }
    public static boolean isPositive(int a)
    {
        System.out.println("Inside the isPositive method");
        return a > 0;
    }
}