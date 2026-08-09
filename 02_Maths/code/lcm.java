public class lcm {
    public static void main(String[] args) {

        int a = 12;
        int b = 18;

        int originalA = a;
        int originalB = b;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        int gcd = a;

        int lcm = (originalA * originalB) / gcd;

        System.out.println("GCD = " + gcd);
        System.out.println("LCM = " + lcm);
    }
}
//algo 
/*
first we have to calulate gcd as we know we have to check the condition until
b is 0 and then using temporary variable claculate the gcd and then after that main
part we have to calculate the lcm as we know the formula lcm = a*b/gcd and then we got the answer

TC is we have modulo operator which is performed in log the TC is O(logmin(a,b)) but in bigO
we calculate as O(log n )

SC we are not creating extra space so it is O(1)*/