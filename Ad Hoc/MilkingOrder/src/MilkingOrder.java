import java.util.*;

public class MilkingOrder {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int k = s.nextInt();

        int[] cows = new int[n];
        ArrayList<Integer> hier = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            hier.add(s.nextInt());
        }

        for (int i = 0; i < k; i++) {
            int elem = s.nextInt();
            int ind = s.nextInt();
            cows[ind - 1] = elem;
            if (hier.contains(elem)) hier.remove(hier.indexOf(elem));
        }

        for (int i = 0; i < n; i++) {
            if (cows[i] == 0) {
                if (hier.size() == 1) {
                    System.out.println(i+1);
                    break;
                }

                cows[i] = hier.get(0);
                hier.remove(0);
            }
        }


        s.close();
    }

}
