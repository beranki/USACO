package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(r.readLine());
        int n = Integer.parseInt(st.nextToken());
        int max = 0;
        int change_counter = 0;
        HashMap<String, Integer> cows = new HashMap<>();
        cows.put("Mildred", 7);
        cows.put("Bessie", 7);
        cows.put("Elsie", 7);
        SortedMap<Integer, Event> days = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(r.readLine());
            int d = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            String add = st.nextToken();

            int op;
            if (add.indexOf('+') != -1) {op = (int)add.charAt(1) - 48;}
            else {op = -(int)add.charAt(1) + 48;}
            days.put(d, new Event(op, name));
        }

        for (Map.Entry<Integer, Event> entry : days.entrySet()) {
            if (findValue(cows, entry.getValue().name) != null) {
                if (findValue(cows, entry.getValue().name) + entry.getValue().change >= max ||
                    findKey(cows, max).equals(entry.getValue().name)) {

                    max = findValue(cows, entry.getValue().name) + entry.getValue().change;
                    //System.out.println(max);
                    change_counter++;
                }

                cows.replace(entry.getValue().name, findValue(cows, entry.getValue().name) + entry.getValue().change);
                //System.out.println(entry.getValue().name + "-> " + findValue(cows, entry.getValue().name));
            }
        }

        System.out.println(change_counter);

    }

    public static class Event {
        int change;
        String name;
        public Event(int b, String n) {
            change = b;
            name = n;
        }
    }

    public static Integer findValue(HashMap<String, Integer> a, String key) {
        for (Map.Entry<String, Integer> entry: a.entrySet()) {
            if (entry.getKey().equals(key)) return entry.getValue();
        }
        return null;
    }

    public static String findKey(HashMap<String, Integer> a, Integer val) {
        for (Map.Entry<String, Integer> entry: a.entrySet()) {
            if (entry.getValue() == val) return entry.getKey();
        }
        return null;
    }
}

