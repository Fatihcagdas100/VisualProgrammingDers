import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) {
        String s = "BZ";
        String s1 = s +214;
        System.out.println(s1);
        String s2 = s1.concat("Visual Programming");
        System.out.println("s1=" + s1);
        System.out.println("s2=" + s2);
        System.out.println(s2.concat("Visual Programming"));
        System.out.println(s2.toUpperCase());

        String s3 = "BZ214-Visual_Programming";
        String[] parts = s3.split("[-_]");
        System.out.println(Arrays.toString(parts));

        String s4 = "BZ214 Visual Programming";
        System.out.println(s4.replace("a", "A"));
        System.out.println(s4.replaceFirst("BZ", "CS"));
        System.out.println(s4.replaceAll("[0-9]]", "*"));
    }
}
