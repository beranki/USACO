package src;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(r.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] bessie = new int[100];
        int[] street = new int[100];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(r.readLine());
            int l = Integer.parseInt(st.nextToken());
            int lim = Integer.parseInt(st.nextToken());
            for (int s = 0; s < l; s++) {street[s] = lim;}
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(r.readLine());
            int l = Integer.parseInt(st.nextToken());
            int lim = Integer.parseInt(st.nextToken());
            for (int b = 0; b < l; b++) {bessie[b] = lim;}
        }

        int res = 0;
        for (int i = 0; i < 100; i++) {
            res = Math.max(bessie[i] - street[i],res);
        }

        System.out.println(res);
    }
}
