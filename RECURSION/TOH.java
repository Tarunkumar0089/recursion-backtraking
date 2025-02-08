package RECURSION;

public class TOH {
    public static void main(String[] args) {
        int n=3;
        TOH(n,"A","C","B");
    }
    public static void TOH(int n, String src,String hlp,String dest){
       if(n==0){
             return;
       }
        TOH(n-1,src,dest,hlp);
        System.out.println("Move"+n+"th disk from"+src+"to"+dest);
        TOH(n-1,hlp,src,dest);
    }
}



