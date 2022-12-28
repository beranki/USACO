package com.company;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception{
	// write your code here
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(r.readLine());

        int end_time = Integer.MAX_VALUE;
        int start_time = 0;
        int total_buckets = 0;
        int n = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(r.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if (start_time < a) { start_time = a; }
            if (end_time > b && b > start_time) {end_time = b;}

            if (start_time == a || end_time == b) {total_buckets += c;}
        }

        System.out.println(total_buckets);
    }
}
