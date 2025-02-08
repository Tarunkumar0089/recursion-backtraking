package RECURSION;

public class permutation {
    public static void main(String[] args) {
        String str="abcd";
        print(str, "");

    }
    public static void print(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String temp=str.substring(0,i)+str.substring(i+1);
            print(temp,ans+ch);
        }
    }
}
