import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {
    public static void main(String[] args) {
        /*String codes = "BZ214 BZ210 MAT101 BS249 FIZ101 B203 BZ305";
        System.out.println(codes.replaceAll("B[SZ]","**"));
        System.out.println(codes.replaceAll("B[SZ][1-4]\\d{2}","***"));
        System.out.println(codes.replaceAll("[A-Z]{2,3}101","***"));
        System.out.println(codes.replaceAll("B[^S]\\d{3}","***"));
        System.out.println(codes.replaceAll("[A-Z]{2,3}\\d+","***"));
        System.out.println(codes.replaceAll("(MAT|FIZ)\\d{3}","***"));
        System.out.println(codes.replaceFirst("BZ\\d{3}","***"));//Stringin başlangıcını kontrol etmek için ^
        System.out.println(codes.replaceAll("^BZ\\d{3}","***"));//Stringin başlangıcını kontrol etmek için ^
        System.out.println(codes.replaceFirst("BZ\\d{3}$","***"));//sonunu kontrol etmek için $
        System.out.println(codes.replaceAll("B[SZ]?\\d{3}","***"));

        String text = "C,C++;Java-Python";
        String[] parts = text.split("[,;-]");
        System.out.println(Arrays.toString(parts));

        System.out.println(isStudentNumber("1030521328"));//TRUE
        System.out.println(isStudentNumber("1030512365"));//TRUE
        System.out.println(isStudentNumber("103052132"));//FALSE
        */
        StringBuilder sb = new StringBuilder();
        sb.append("<h1>Heading</h1>");
        sb.append("<h2>Sub Heading</h2>");
        sb.append("<p>Text Text Text<p>");
        sb.append("<h2>Summary</h2>");
        sb.append("<p>More Text Text</p>");
        String html = sb.toString();
        System.out.println(html);

        String  regex = "(<h2>)(.*?)(</h2>)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(html);
        matcher.reset();//Burada buna gerek yok ama cursor birden fazla yere gidecekse ve geri dönmesi gerekirse resetlenir
        while (matcher.find()) {
            System.out.println(matcher.group(2));
        }
    }
    public static boolean isStudentNumber(String number){
        String regex = "10305[12]\\d{4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();
    }
}
