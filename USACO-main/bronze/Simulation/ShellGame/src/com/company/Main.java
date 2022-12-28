package ShellGame.src.com.company;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(r.readLine());
        int[] score = new int[3];
        int[] pebbles = new int[]{1, 2, 3};

        int n = Integer.parseInt(st.nextToken());
        for (int j = 0; j < n; j++) {
            st = new StringTokenizer(r.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;
            int g = Integer.parseInt(st.nextToken()) - 1;

            int t = pebbles[a];
            pebbles[a] = pebbles[b];
            pebbles[b] = t;

            score[pebbles[g]]++;
        }

        System.out.println(Math.max(score[0], Math.max(score[1], score[2])));
    }
}
