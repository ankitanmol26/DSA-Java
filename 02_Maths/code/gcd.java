public class gcd {
    public static void main(String[] args) {
        int a= 24;
        int b=36;
        int gcd = 0;
        // int n;
        // if(a>b){
        //     n = a;
        // }else{
        //     n = b;
        // }
        int min= Math.min(a,b);
        for(int i = 1; i<=min; i++){
            if(a%i ==0 && b%i ==0){
                gcd = i;
            }
        }
        System.out.println(gcd);
    }
}
//TC is O(min(a,b))

