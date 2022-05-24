import java.util.Scanner;

public class URI1104 {
    public static void main(String[] args) {
        int a, b;
        Scanner scn = new Scanner(System.in);

        while ((a = scn.nextInt()) != 0 && (b = scn.nextInt()) != 0) {
            int[] aCards = new int[100001];
            int[] bCards = new int[100001];
            for (int i = 0; i < a; i++) {
                int num =scn.nextInt();
                aCards[num]++;
            }
            for (int i = 0; i < b; i++) {
                int num = scn.nextInt();
                bCards[num]++;
            }
            int aRes = 0;
            int bRes = 0;
            for (int i = 0; i < aCards.length; i++) {
                if (aCards[i] >= 1 && bCards[i] == 0) {
                    aRes++;
                }
                if (aCards[i] == 0 && bCards[i] >= 1) {
                    bRes++;
                }
            }
            System.out.println(Math.min(aRes,bRes));
        }
    }
}