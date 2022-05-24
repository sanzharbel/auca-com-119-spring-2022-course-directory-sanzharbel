import java.util.Scanner;

public class URI1285 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        while (scn.hasNextInt()) {
            int f = scn.nextInt();
            int t = scn.nextInt();
            int res = 0;
            for (int i = f; i <= t; i++) {
                boolean[] b = new boolean[10];
                boolean isRep = false;
                int temp = i;
                while (temp != 0) {
                    if (b[temp % 10]) {
                        isRep = true;
                        break;
                    }
                    b[temp % 10] = true;
                    temp /= 10;
                }
                if (!isRep) {
                    res++;
                }
            }
            System.out.println(res);
        }
    }
}