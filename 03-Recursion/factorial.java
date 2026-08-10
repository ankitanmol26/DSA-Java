public class factorial {
    public static int fact(int n){
        if(n==1 || n==0){
            return 1;
        }
        int fact = n * fact(n-1);
        return fact;
    }
    public static void main(String[] args) {
        int n = 0;
        int result = fact(n);
        System.out.println("Factorial of " + n + " is " + result);

    }
}
//first i wrote base condition which if n is 0 or 1 then return 1
//then i wrote recursive relation which is n * fact(n-1)
//then i wrote main function to call the fact function
//TC is O(n)
//SC is O(n) due to stack space