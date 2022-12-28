package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static boolean inbetween(int a, int b, int c) {
        return a <= b && b <= c;
    }

    public static void main(String[] args) throws Exception{
	// write your code here

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(r.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y=  Integer.parseInt(st.nextToken());

        int total = 0, curx = x, mult = 1;

            // Simulate.
        while (true) {

                // Go to the new x.
                int newx = x + mult;
                int min = Math.min(curx,newx);
                int max = Math.max(curx,newx);
                int travel = max-min;

                // We made it, get out.
                if (inbetween(min, y, max)) {
                    total += Math.abs(y-curx);
                    break;
                }

                // Go to next iteration.
                mult *= (-2);
                total += travel;
                curx = newx;
            }

            // Ta da!
            System.out.println(total);
    }
}
