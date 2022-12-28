import java.util.*;

public class SleepyCowSorting {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = s.nextInt();
        }

        int res = 0;
        for (int i = 0; i < n-1; i++) {
            if (c[i] > c[i+1]) res = i + 1;
        }

        System.out.println(res);
        s.close();
    }
}
