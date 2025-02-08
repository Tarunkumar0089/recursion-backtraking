package RECURSION;

public class fabanacci {
    public static void main(String[] args) {
        int n=5;
        int a=0;
        int b=1;
        print(a,b,n);
    }
    public static void print(int a,int b,int n){
        if(n==0){
            return;
        }
        int c=0;
        c=a+b;
        System.out.println(c);
        print(b, c, n-1);
    }
}
