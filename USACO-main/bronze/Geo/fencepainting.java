package bronze;

import java.io.*;
import java.util.*;

class fencepainting {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pr = new PrintWriter(System.out);

        StringTokenizer sa = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(sa.nextToken());
        int b = Integer.parseInt(sa.nextToken());
        StringTokenizer sb = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(sb.nextToken());
        int d = Integer.parseInt(sb.nextToken());

        int intersection = Math.max(Math.min(b, d) - Math.max(a, c), 0);
        int tp = b-a + d-c - intersection;

        pr.println(tp);
        pr.close();
    }
}
