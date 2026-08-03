public class armstrong{
    public static void main(String[] args) {
        int n = 9474;
        int original = n;
        int sum = 0;
        int temp = n;
        int digits = 0;

        while(temp > 0){
        digits++; 
        temp = temp / 10;
            }
        while(n>0){
            int lastDigit = n%10;
            n = n/10;
            sum += (int)Math.pow(lastDigit, digits);
        }
        if(sum == original){
            System.out.println("it is a armstrong number");
        }else{
            System.out.println("it is not a armstrong number");
        }

    }
}