package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(r.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[][] pts = new int[n][2];

        st = new StringTokenizer(r.readLine());
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(st.nextToken());
            pts[i][0] = x;
        }
        st = new StringTokenizer(r.readLine());
        for (int i = 0; i < n; i++) {
            int y = Integer.parseInt(st.nextToken());
            pts[i][1] = y;
        }

        double max_dist = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                max_dist = Math.max(max_dist, (Math.pow(pts[i][0] - pts[j][0], 2) + (Math.pow(pts[i][1] - pts[j][1], 2))));
            }
        }
        System.out.println((int)max_dist);
    }
}
