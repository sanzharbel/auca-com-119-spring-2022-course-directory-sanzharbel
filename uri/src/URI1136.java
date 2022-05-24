import java.util.Scanner;

public class URI1136 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n, b;
        one:
        while ((n = scn.nextInt()) != 0 && (b = scn.nextInt()) != 0) {
            int[] ar = new int[n + 1];
            for (int i = 0; i < b; i++) {
                ar[scn.nextInt()]++;
            }
            for (int i = 0; i <= n; i++) {
                if (ar[i] == 0) {
                    boolean isIn = false;
                    int c = 0;
                    while (c <= n) {
                        if (i + c <= n && ar[i + c] > 0 && ar[c] > 0) {
                            isIn = true;
                            break;
                        }
                        c++;
                    }
                    if (!isIn || i == 0) {
                        System.out.println('N');
                        continue one;
                    }
                }
            }
            System.out.println('Y');
        }
    }
}