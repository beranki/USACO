import java.util.*;


public class SleepyCowHerding {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt();
        int e = scan.nextInt();
        int m = scan.nextInt();

        int min_moves;
        int max_moves;
        if (b + 1 == e && e + 1 == m) min_moves = 0;
        else if (b + 2 == e || e + 2 == m) min_moves = 1;
        else min_moves = 2;

        max_moves = Math.max(e - b, e - m) - 1;

        System.out.println(min_moves);
        System.out.println(max_moves);
        scan.close();
    }
}
