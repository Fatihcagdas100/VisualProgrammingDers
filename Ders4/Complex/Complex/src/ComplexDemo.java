public class ComplexDemo {
    public static void main(String[] args) {
        Complex a = new Complex(1.0,2.0);
        Complex b = new Complex();  //non-arg constr eklenmeseydi hata verirdi.
        a.setReal(1.0);
        a.setImag(2.0);
        Complex c = a.plus(b);
        System.out.println(a.toString());
    }
}
