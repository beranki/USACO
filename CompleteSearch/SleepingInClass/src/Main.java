import java.util.*;
import java.io.*;
//this one was hard -> REVIEW IT!
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(r.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(r.readLine());
            int len = Integer.parseInt(st.nextToken());
            int[] nums = new int[len];
            st = new StringTokenizer(r.readLine());
            int sum = 0;
            for (int l = 0; l < len; l++) {
                nums[l] = Integer.parseInt(st.nextToken());
                sum += nums[l];
            }
            
            for (int j = len; j >=1; j--) {
                if (sum % j == 0) {
                    int target_sum = sum / j;
                    boolean poss = true;
                    int t_sum = 0;
                    for (int num: nums) {
                        t_sum += num;
                        if (t_sum > target_sum) {
                            poss = false;
                            break;
                        } if (t_sum == target_sum) {
                            t_sum = 0;
                        }
                    }
                    if (poss) {
                        res[i] = len-j; 
                        break;
                    }
                }
            }
            
        }

        for (int i = 0; i < n; i++) {System.out.println(res[i]);}
    }
}
