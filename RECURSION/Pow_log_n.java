package RECURSION;
public class Pow_log_n {
    public static void main(String[] args) {
        int a=3;
        int n=5;
        System.out.println(Pow(a, n));
    }
    public static int Pow(int a,int n){
        if(n==0){
            return 1;
        }
       int ans= Pow(a, n/2);
       ans=ans*ans;
       if(n%2!=0){
        ans=ans*a;
       }
       return ans;
    }
}
