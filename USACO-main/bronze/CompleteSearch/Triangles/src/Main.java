import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(r.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[][] points = new int[n][2];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(r.readLine());
            points[i][0] = Integer.parseInt(st.nextToken());
            points[i][1] = Integer.parseInt(st.nextToken());
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i) continue;
                for (int k = 0; k < n; k++) {
                    if (k == i || k == j) continue;

                    if (points[i][1] != points[j][1]) continue; //not horizontally aligned
                    if (points[i][0] != points[k][0]) continue; //not vertically aligned

                    max = Math.max(max, Math.abs(points[i][0] - points[j][0])*Math.abs(points[i][1] - points[k][1]));
                }
            }
        }

        System.out.println(max);
    }
}
