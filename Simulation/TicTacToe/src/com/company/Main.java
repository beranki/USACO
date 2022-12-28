package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception{
	// write your code here
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        char[][] lets = new char[3][3];
        int single_score = 0;
        int double_score = 0;
        for (int i = 0; i < 3; i++) {
            String s = r.readLine();
            for (int j = 0; j < 3; j++) {
                char move = s.charAt(j);
                lets[i][j] = move;
                System.out.println(lets[i][j]);

            }
            //vertical

        }

        //vertical
        for (int i = 0; i < 3; i++) {
            if (lets[i][0] == lets[i][1] && lets[i][1] == lets[i][2]) {single_score++;}
            else if (lets[i][0] == lets[i][1] || lets[i][1] == lets[i][2] || lets[i][0] == lets[i][2]) {double_score++;}
        }

        for (int i = 0; i < 3; i++) {
            if (lets[0][i] == lets[1][i] && lets[1][i] == lets[2][i]) {single_score++;}
            else if (lets[0][i] == lets[1][i] || lets[1][i] == lets[2][i] || lets[0][i] == lets[2][i]) {double_score++;}
        }

        if (lets[0][0] == lets[1][1] && lets[1][1] == lets[2][2]) {
            single_score++;
        }
        if (lets[0][2] == lets[1][1] && lets[1][1] == lets[2][0]) {
            single_score++;
        }
        else {
            if (lets[0][0] == lets[1][1] || lets[1][1] == lets[2][2] || lets[0][0] == lets[2][2]) {
                double_score++;
            }
            if (lets[0][2] == lets[1][1] || lets[1][1] == lets[2][0] || lets[2][0] == lets[0][2]) {
                double_score++;
            }
        }
        System.out.println(single_score);
        System.out.println(double_score);

    }
}
