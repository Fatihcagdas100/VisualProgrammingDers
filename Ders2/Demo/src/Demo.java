public class Demo {
    public static void main(String[] args) {
        System.out.println(isLeapYear(2004));
        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2025));

        System.out.println(greatestCommonDivisor(10,5));//5
        System.out.println(greatestCommonDivisor(14,21));//7
        System.out.println(greatestCommonDivisor(13,17));//1

        printLetterDigitCount("BZ214");//2L 3D
        printLetterDigitCount("BZ");

    }
    public static int greatestCommonDivisor(int a, int b) {
        int small = 0;
        int big = 0;
        if (a < b){
            small = a;
            big = b;
        }
        else{
            small = b;
            big = a;
        }
        int i = 1;
        int result = 1;
        while(++i <= small){
            if(big % i == 0 && small % i == 0){
                result = i;
            }
        }
        return result;
    }
    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
    public static void printLetterDigitCount(String text){
        int d = 0;
        int l = 0;
        int c = 0;
        for(int i = 0; i < text.length(); i++){
            c = text.charAt(i);
            if (Character.isLetter(c)){
                l++;
            }
            if(Character.isDigit(c)){
                    d++;
            }
        }
        System.out.println(d + " digit " + l + " letter");
    }
}