package com.company;
import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws Exception{
	// write your code here
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(r.readLine());
        int[] alphabet = new int[26];
        for (int i=0; i<n*2; i+=2) {
            StringTokenizer tok = new StringTokenizer(r.readLine());
            String s = tok.nextToken();
            String t = tok.nextToken();

            int[] s_let = new int[26];
            int[] t_let = new int[26];
            for (int a = 0; a < s.length(); a++) {
                s_let[(int)s.charAt(a)-'a'] ++;
            }
            for (int a = 0; a < t.length(); a++) {
                t_let[(int)t.charAt(a)-'a'] ++;
            }
            for (int a = 0; a < 26; a++) {
                alphabet[a] += Math.max(s_let[a], t_let[a]);
            }
        }

        for (int i = 0; i < 26; i++) {
            System.out.println(alphabet[i]);
        }

    }
}
