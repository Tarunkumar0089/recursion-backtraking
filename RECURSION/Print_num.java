package RECURSION;

public class Print_num {
    public static void main(String[] args) {
        int n=5;
        print(n);
    }
    public static void print(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        print(n-1);
        System.out.print(n+" ");
    }
}
