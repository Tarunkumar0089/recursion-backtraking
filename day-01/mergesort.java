public class mergesort {
    public static void main(String[] args) {
        int[] arr={2,3,5,6,4,7,1};// dns me overlapping nahi hoti hai. but recursion me hoti hai...
       int[] ans=sort(arr,0,arr.length-1);
       for(int i=0;i<ans.length;i++){
        System.out.print(ans[i]+" ");
       }
    }
    public static int[] sort(int [] arr,int si,int ei){
        if(si==ei){
            int[] bs=new int[1];
            bs[0]=arr[si];
            return bs;
        }
        int mid=(si+ei)/2;
        int[] fa=sort(arr, si, mid);
        int[] sa=sort(arr, mid+1, ei);
        return merge(fa,sa);
    }
    public static int[] merge(int[] num1,int[] num2){
        int n=num1.length;
        int m=num2.length;
        int ans[]=new int[n+m];
        int i=0,j=0,k=0;
        while(i<n&&j<m){
            if(num1[i]<num2[j]){
                ans[k++]=num1[i++];
            }
            else{
                ans[k++]=num2[j++];
            }
        }
        while(i<n){
            ans[k++]=num1[i++];
        }
        while(j<m){
            ans[k++]=num2[j++];
        }
        return ans;
    }
}
