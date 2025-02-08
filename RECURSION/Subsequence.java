package RECURSION;

public class Subsequence {
    public static void main(String[] args) {
        String str="abcd";
        print(str, 0, "");
    }
    public static void print(String str,int idx,String ans){
        if(idx==str.length()){
            System.out.println(ans);
            return;
        }
        char ch=str.charAt(idx);
        print(str, idx+1, ans);
        print(str, idx+1, ans+ch);
    }
}
