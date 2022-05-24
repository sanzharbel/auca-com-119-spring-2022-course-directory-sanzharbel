import java.util.Scanner;

public class URI1558 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        while (scn.hasNextInt()) {
            int n = scn.nextInt();
            if (n < 0) {
                System.out.println("NO");
                continue;
            }
            boolean b = false;
            one:
            for (int i = 0; i * i <= n; i++) {
                for (int j = 0; j * j <= n; j++) {
                    if (i * i + j * j == n) {
                        b = true;
                        break one;
                    }
                    if (i * i + j * j > n) {
                        break;
                    }
                }
            }
            System.out.println(b ? "YES" : "NO");
        }
    }
}