import java.util.Scanner;

public class URI1553 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a, b;
        while ((a = scn.nextInt()) != 0 && (b = scn.nextInt()) != 0) {
            int[] arr = new int[101];
            for (int i = 0; i < a; i++) {
                arr[scn.nextInt()]++;
            }
            int res = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] >= b) {
                    res++;
                }
            }
            System.out.println(res);
        }
    }
}