package com.company;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(r.readLine());
        int k = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        ArrayList<String> ls = new ArrayList<String>();

        for (int i = 0; i < k; i++) {
            String new_row = "";
            String row = r.readLine();
            for (int j = 0; j < m; j++) {
                for (int h = 0; h < n; h++) {
                    new_row += row.charAt(j);
                }
            }
            for (int a = 0; a < n; a++)ls.add(new_row);
        }



        for (int i = 0; i < ls.size(); i++) {
            System.out.println(ls.get(i));
        }
    }
}
