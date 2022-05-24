
import java.util.Scanner;

public class URI1031 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a;
        while ((a = scn.nextInt()) != 0) {
            int i = 0;
            while (true) {
                int res = 0;
                for (int j = 2; j < a; j++) {
                    res = (res + i) % j;
                }
                if (res + 2 == 13 ) {
                    break;
                }
                i++;
            }
            System.out.println(i);
        }
    }
}