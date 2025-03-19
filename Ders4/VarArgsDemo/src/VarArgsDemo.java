public class VarArgsDemo {
    public static void main(String[] args) {
        VarArgsDemo va = new VarArgsDemo();
        va.fun();
        va.fun(1);
        va.fun(1,2);
        va.fun(1,2,3,14,4,5,6,67,7,87);

        System.out.println(sum(5,6,51));
        System.out.println(sum());

        System.out.println(min(5,6,51,1,54));
        System.out.println(min(8,7,4,9,6,5,4));

        method(1,2,3,4);
        method(false,true,true,false);
    }
    public static int sum(int... nums) {
        int sum = 0;
        for(int num:nums)
            sum += num;
        return sum;
    }
    public void fun(double... args) {
        for(double arg:args)
            System.out.println(arg + " ");
    }
    //public void func(int... args, int arg) {}     bu tanım hata verir
    //public void func(boolean... flags, int... args){}     bu tanım hata verir
    public void func(int arg, int... args) {//önce normal tanımlama sonra vararg tanımı yapılmalı
    }
    public static int min(int firstArg,int... args){
        int min = firstArg;
        for(int arg:args){
            if (min>arg)
                min = arg;
        }
        return min;
    }
    public static void method(boolean... flags){}//OVERLOADING
    public static void method(int... nums){}
}
