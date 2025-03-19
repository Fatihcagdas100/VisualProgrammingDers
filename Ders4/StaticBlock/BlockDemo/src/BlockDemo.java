public class BlockDemo {
    static{// statik blok
        System.out.println("inside static block");
    }
    {// instance blok
        System.out.println("inside instance blck");
    }
    public BlockDemo(){
        System.out.println("inside constructor");
    }
}
