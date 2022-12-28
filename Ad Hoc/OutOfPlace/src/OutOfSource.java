import java.util.*;

public class OutOfSource {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] elems = new int[n];
        int[] copy = new int[n];
        for (int i = 0; i < n; i++) {
            elems[i] = copy[i] = s.nextInt();
        }

        int res = 0;
        Arrays.sort(copy);
        for (int i = 0; i < n; i++) {
            if (elems[i] != copy[i]) res++;
        }

        System.out.println(res-1);
        s.close();
    }
}
