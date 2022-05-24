import java.util.Scanner;

public class URI1300 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        while (scn.hasNextInt()){
            int r =scn.nextInt();
            System.out.println(r % 6 ==0 ? "Y" : "N");
        }
    }
}