package rec;
import java.util.*;
public class perm {
    public static void main(String[] args) {
        int n = 3;
        int k = 3;
        ArrayList<String> result = new ArrayList<>();
        boolean[] used = new boolean[n + 1];
        sol(n, "", used, result);
        System.out.println(result.get(k - 1));  
    }

    public static void sol(int n, String ans, boolean[] used, ArrayList<String> result) {
        if (ans.length() == n) {
            result.add(ans);
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (!used[i]) {
                used[i] = true;
                sol(n, ans + i, used, result);
                used[i] = false; 
            }
        }
    }
}
