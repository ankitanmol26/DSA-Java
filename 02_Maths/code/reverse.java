public class reverse {
    public static void main(String[] args) {
        int n = 78952;
        int reverse = 0;
        while(n>0){
            int lastDigit = n % 10;
            n = n/10;
            reverse = reverse * 10 + lastDigit;
            
        }
        System.out.println(reverse);
    }
}
