import java.util.*;

public class ModernArt {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] painting = new int[n][n];
        ArrayList<Integer> vals = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                painting[i][j] = s.nextInt();
                if (vals.contains(painting[i][j])) vals.add(painting[i][j]);
            }
        }

        int[][] tl_vals = new int[vals.size()][2];
        int[][] br_vals = new int[vals.size()][2];

        for (int i = 0; i < vals.size(); i++) {
            tl_vals[i] = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
            br_vals[i] = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        }

        for (int i = 0; i < vals.size(); i++) {
            for (int m = 0; m < n; m++) {
                for (int j = 0; j < n; j++) {
                    
                }
            }
        }
        s.close();
    }
}
