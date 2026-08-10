public class Name {
    public static void name(String name , int n){
        if(n==0){
            return;
        }
        System.out.println(name);
        name(name,n-1);
    }
    
    public static void main (String[] args){
        name("Anmol" , 5);
    }
}
