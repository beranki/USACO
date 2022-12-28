import java.util.*;

public class MadeUp {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }

        for (int i = 0; i < n; i++) {
            b[i] = scan.nextInt();
        }

        for (int i = 0; i < n; i++) {
            c[i] = scan.nextInt();
        }
        
        scan.close();

        /*THE REASON USE HASHMAP IS BECAUSE RETRIEVAL ADDITION 
        AND DELETION ARE ALL O(1), WHICH MAKES THIS MORE EFFICIENT THAT 
        HAVING TWO LOOPS WHICH IS O(n^2)*/

        HashMap<Integer, Integer> ps = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            if (ps.containsKey(b[c[i] - 1])) {ps.replace(b[c[i] - 1], ps.get(b[c[i] - 1])+1);}
            else {ps.put(b[c[i] - 1], 1);}
        }
        
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (ps.containsKey(a[i])) {
                res += ps.get(a[i]);
            }
        }

        System.out.println(res);
    }
}
