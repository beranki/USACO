import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        TreeMap<Integer, Integer> cows = new TreeMap<>();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(r.readLine());
        int n = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(r.readLine());
            int a = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());
            cows.put(a, q);
        }

        int total_time = 0;
        int[] latest_time = new int[]{cows.firstEntry().getKey(), cows.firstEntry().getValue()};
        for (Map.Entry<Integer, Integer> cow: cows.entrySet()) {
            if (cow.getKey() >= latest_time[0] + latest_time[1]) {
                total_time += cow.getKey() - latest_time[0];
            }
            else if (cow.getKey() < latest_time[0] + latest_time[1] && cow.getKey() != latest_time[0] && cow.getValue() != latest_time[1]){
                total_time += (latest_time[1] + latest_time[0]);
            }
            latest_time[0] = cow.getKey(); latest_time[1] = cow.getValue();
        }
        System.out.println(total_time);
    }
}
