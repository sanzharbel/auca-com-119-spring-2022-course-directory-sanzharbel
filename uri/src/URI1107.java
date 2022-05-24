
import java.util.Scanner;

public class URI1107 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a, b;
        while ((a = scn.nextInt()) != 0 && (b = scn.nextInt()) != 0) {
            int res = 0;
            int[] l = new int[b];
            for (int i = 0; i < b; i++) {
                l[i] = scn.nextInt();
                if (i > 0) {
                    if (l[i - 1] > l[i]) {
                        res += l[i - 1] - l[i];
                    }
                } else {
                    res += a - l[i];
                }
            }
            System.out.println(res);
        }
    }
}