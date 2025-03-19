public class BlockDemo {
    public static void main(String[] args) {
        BlockDemo blockDemo1 = new BlockDemo();
        BlockDemo blockDemo2 = new BlockDemo();
    }
    static{// statik blok - sınıf ilk kez çağırıldıpında bir kere çağırılır
        System.out.println("inside static block");
    }
    {// instance blok - sınıf ikinci veya daha fazla oalrak çalıştırıldığında constr.dan önce çalışır
        System.out.println("inside instance blck");
    }
    public BlockDemo(){// constructır blok - sınıf çalıştırıldığında instance den sonra çalışır.
        System.out.println("inside constructor");
    }
}
