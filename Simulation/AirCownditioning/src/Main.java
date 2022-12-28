import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(r.readLine());
        int n = Integer.parseInt(st.nextToken());
        
        int[] ideal = Arrays.stream(r.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
        int[] current = Arrays.stream(r.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
        
        int turns = 0;
        while (true) {
            outer: for (int i = 0; i < n; i++) {
                if (ideal[i] == current[i]) {continue;}
                if (ideal[i] > current[i]) {
                    current[i]++;
                    for (int j = i + 1; j < n; j++) {
                        if (current[j] >= ideal[j]) {break outer;}
                        current[j]++;
                    }
                }

                if (ideal[i] < current[i]) {
                    current[i]--;
                    for (int j = i + 1; j < n; j++) {
                        if (current[j] <= ideal[j]) {break outer;} 
                        current[j]--;
                    }
                } 
            }
            turns++;
            System.out.println(Arrays.toString(current) + "=>" + turns);
            
            if (Arrays.equals(ideal, current)) break;
        }

        System.out.println(turns);
    
    }
}
