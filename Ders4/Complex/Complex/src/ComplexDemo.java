public class ComplexDemo {
    public static void main(String[] args) {
        Complex a = new Complex(5,5);
        //Complex b = new Complex();  //non-arg constr eklenmeseydi hata verirdi.
        System.out.println(a.equals(null));
        System.out.println(a.equals(a));
        System.out.println(a.equals("ABC"));
        System.out.println(a.equals(new Complex(5,5)));
    }
}
