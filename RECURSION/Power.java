package RECURSION;

public class Power {
    public static void main(String[] args) {
        int a=3;
        int b=5;
        System.out.println(print(a, b));
    }
    public static int print(int a,int b){
        if(a==0){
            return 1;
        }
        return print(a-1,b)*b;
        
    }
}
