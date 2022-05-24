import java.util.Scanner;

public class URI1743 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        boolean isCompatible = true;
        int[][] arr = new int[2][5];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[i][j] == arr[i + 1][j]) {
                    isCompatible = false;
                    break;
                }
            }
        }
        System.out.println(isCompatible ? 'Y' : 'N');
    }
}