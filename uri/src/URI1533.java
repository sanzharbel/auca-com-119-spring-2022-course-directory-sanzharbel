import java.util.Scanner;

public class URI1533 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a;
        while ((a = scn.nextInt()) != 0) {
            int max = 0, max2 = 0, index = 0;
            int[] arr = new int[a];
            for (int i = 0; i < a; i++) {
                arr[i] = scn.nextInt();
                if (arr[i] > max) {
                    index = i;
                    max = arr[i];
                }
            }
            int res = 0;
            for (int i = 0; i < a; i++) {
                if (i == index) {
                    continue;
                }
                if (max2 < arr[i]) {
                    max2 = arr[i];
                    res = i;
                }
            }
            System.out.println(res + 1);
        }
    }
}