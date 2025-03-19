public class Armstrong {
    public static void main(String[] args) {
        System.out.println(isArmstrongNumber(5));
        System.out.println(isArmstrongNumber(156));
        System.out.println(isArmstrongNumber(153));
    }
    public static boolean isArmstrongNumber(int n) {
        int toplam = 0;
        int temp = n;
        int basamakSayisi = orderOfNumber(n);
        while(temp != 0){
            int r = temp % 10;
            toplam += Math.pow(r, basamakSayisi);
            temp = temp / 10;
        }
        return toplam == n;
    }
    public static int orderOfNumber(int n) {
        int order = 0;
        while(n > 0) {
            order++;
            n /= 10;
        }
        return order;
    }
}
