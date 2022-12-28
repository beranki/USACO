import java.util.*;
import java.io.*;

public class MadScientist {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(r.readLine());
        int n = Integer.parseInt(st.nextToken());
        char[] a = r.readLine().toCharArray();
        char[] b = r.readLine().toCharArray();

        int c = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] != b[i]) {
                c++;
                while (a[i] != b[i]) i++;
            }
        }

        System.out.println(c);
    }
}
