package com.company;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int[] buckets = new int[3];
        int[] capacities = new int[3];
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(r.readLine());
            int m = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            capacities[i] = m;
            buckets[i] = c;
        }

        for (int i = 0; i < 100; i++) {
            buckets[(i + 1) % 3] = Math.min(buckets[i % 3] + buckets[(i + 1) % 3], capacities[(i + 1) % 3]);
            buckets[i % 3] = Math.max(buckets[i % 3] - capacities[(i + 1) % 3], 0);
            System.out.print(buckets[0] + " ");
            System.out.print(buckets[1] + " ");
            System.out.print(buckets[2] + " ");
            System.out.println();
        }

    }
}
