package RECURSION;

public class primes {
    public static void main(String[] args) {
        int n=100;
        primesieve(n);
    }
    public static void primesieve(int n){
        boolean[] prime=new boolean[n+1];
        prime[0]=true;
        prime[1]=true;
        for(int i=2;i*i<=n;i++){
            if(prime[i]==false){
               for(int j=2;i*j<prime.length;j++){
                prime[i*j]=true;
               }
            }
            
        }
        for(int i=2;i<prime.length;i++){
            if(prime[i]==false){
                System.out.print(i+" ");
            }
        }
    }
}
