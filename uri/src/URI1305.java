import java.util.Scanner;

public class URI1305 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        while (scn.hasNext()){
            String num = scn.next();
            String around = scn.next();
            double temp1, temp2;
            if (num.contains(".")){
                temp1 = Double.parseDouble(num);
                temp2 = Double.parseDouble(around);
                if (temp1 - (int)(temp1) > temp2){
                    System.out.println((int)(temp1) + 1);
                }else
                    System.out.println((int)(temp1));
            }else
                System.out.println(num);
        }
    }
}