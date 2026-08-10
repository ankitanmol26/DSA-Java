public class sum {
    public static void main(String[] args) {
        int result = sum(5);
        System.out.println("Sum is: " + result);
    }

    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum(n - 1);
    }
}
//first we wrote the base condition which is when n==0 we should return 0
//then we wrote the recursive condition which is when n>0 we should return n + sum(n-1)