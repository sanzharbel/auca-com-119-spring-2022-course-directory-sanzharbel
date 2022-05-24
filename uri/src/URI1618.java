import java.util.Scanner;

public class URI1618 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 0; i < n; i++) {
            int ax = scn.nextInt();
            int ay = scn.nextInt();
            int bx = scn.nextInt();
            int by = scn.nextInt();
            int cx = scn.nextInt();
            int cy = scn.nextInt();
            int dx = scn.nextInt();
            int dy = scn.nextInt();
            int rx = scn.nextInt();
            int ry = scn.nextInt();
            if(rx >= ax && rx <= bx && rx >= dx && rx <= cx && ry >= ay && ry <= dy && ry >= by && ry <= cy){
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}