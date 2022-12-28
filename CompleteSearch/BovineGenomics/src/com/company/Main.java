package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception{
	// write your code here
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(r.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] genomes = new String[n*2];
        //String[][] genomes = new String[n][m];
        for (int i = 0; i < n*2; i++) {
            genomes[i] = r.readLine();
            //System.out.println(genomes[i]);
        }

        int counter = 0;
        for (int j = 0; j < m; j++) {
            boolean valid = true;
            for (int i = n; i < n*2 - 1; i++) {
                if (genomes[i].charAt(j) != genomes[i+1].charAt(j)) {
                    valid = false;
                    break;
                }
            }
            //if (valid) System.out.println(j);
            if (valid) {
                char lookout = genomes[n].charAt(j);
                for (int i = 0; i < n-1; i++) {
                    if (genomes[i].charAt(j) == lookout) {
                        valid = false;
                        break;
                    }
                }
                if (valid) counter++;
            }
        }
        System.out.println(counter);
    }
}
