public class StaticDemo {
    int number;
    static int staticNumber = 10;
    public static void main(String[] args) {
        StaticDemo a = new StaticDemo();
        StaticDemo b = new StaticDemo();
        a.number = 10;
        b.number = 20;
    }
    static void staticMethod(){             //static metoda sadece static değerler modifikasyona uğrayabilir.
        staticNumber++;
        //number++;                   Erişim sağlanamaz.
    }
    void instanceMethod(){                  //instance metodlarda iki değer de modifikasyona uğrayabilir.
        staticNumber++;
        number++;
    }
}