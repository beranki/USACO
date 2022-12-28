package com.company;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(r.readLine());

        int n = Integer.parseInt(st.nextToken());
        int totalCows = 0;
        int[] rooms = new int[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(r.readLine());
            int a = Integer.parseInt(st.nextToken());
            rooms[i] = a;
            totalCows += a;
        }
        int minDist = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int dist = 0;
            int cowsLeft = totalCows;
            for (int j = 0; j < n; j++) {
                cowsLeft -= rooms[(i + j) % n];
                dist += cowsLeft;
            }
            if (dist < minDist) {minDist = dist;}
        }

        System.out.println(minDist);
    }
}
