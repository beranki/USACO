import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(r.readLine());
        int n = Integer.parseInt(st.nextToken());
        String mailboxes = r.readLine();

        int length = 0;
        for (int i = 0; i < n; i++) {
            if (mailboxes.indexOf(mailboxes.substring(0, i), i) == -1) {break;}
            length++;
        }
        System.out.println(length);
    }
 }
