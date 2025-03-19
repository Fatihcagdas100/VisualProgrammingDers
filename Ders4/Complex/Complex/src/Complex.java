public class Complex {
    private double real, imag;

                                                //Accessor-Getter
    public double getReal() {
        return real;
    }
    public double getImag() {
        return imag;
    }
                                                //Mutator-Setter
    public void setReal(double real) {
        this.real = real;
    }
    public void setImag(double imag) {
        this.imag = imag;
    }
    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    public Complex() {                          // No-arg constr.
        this.real = 0.0;
        this.imag = 0.0;
    }
    public Complex plus(Complex other) {
        return new Complex(this.real + other.real, this.imag + other.imag);
    }
    public String toString() {
        return this.real + " + " + this.imag + "i";
    }
}
