import java.util.ArrayList;
import java.util.Scanner;

public class URI1609 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int c = scn.nextInt();
        for (int i = 0; i < c; i++) {
            int s = scn.nextInt();
            ArrayList<Integer> r = new ArrayList<>();
            int res = 0;
            for (int j = 0; j < s; j++) {
                int id = scn.nextInt();
                if (!r.contains(id)) {
                    r.add(id);
                    res++;
                }
            }
            System.out.println(res);
        }
    }
}