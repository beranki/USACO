package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(r.readLine());
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[][] scores = new int[k][n];
        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(r.readLine());
            for (int j = 0; j < n; j++) {
                scores[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int counter = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) continue;

                boolean valid = true;
                for (int[] score: scores) {
                    if (index(score, j) < index(score, i)) {
                        valid = false;
                        break;
                    }
                }

                if (valid) {counter++;}
            }
        }

        System.out.println(counter);
    }

    static int index(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return i;
            }
        }
        return -1;
    }
}
