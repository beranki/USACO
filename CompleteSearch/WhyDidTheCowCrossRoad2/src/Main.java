import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main
{
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String cows  = r.readLine();

        int res = 0;
        for (int i = 0; i < cows.length(); i++) {
            for (int j = i + 1; j < cows.length(); j++) {
                if (cows.indexOf(cows.charAt(j), j+1) == cows.indexOf(cows.charAt(i), i+1) + 1) {res++;}
            }
        }

        System.out.println(res);
    }
}
