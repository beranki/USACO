import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Photoshoot {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(r.readLine());
        char[] seq = r.readLine().toCharArray();

        ArrayList<Boolean> shortened = new ArrayList<>();
        for (int i = 0; i <= n - 2; i+=2) {
            if (seq[i] != seq[i+1]) {
                if (seq[i] == 'G' && (shortened.isEmpty() || shortened.get(shortened.size() - 1) != false)) shortened.add(false);
                else if (seq[i] == 'H' && (shortened.isEmpty() || shortened.get(shortened.size() - 1)!= true)) shortened.add(true);
            }
        }

        int res = shortened.size();
        if (shortened.get(shortened.size()-1)) res--;

        System.out.println(res);
        
    }
}
