public class BlockDemo {
    public static void main(String[] args) {
        BlockDemo blockDemo1 = new BlockDemo();
        BlockDemo blockDemo2 = new BlockDemo();
    }
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
