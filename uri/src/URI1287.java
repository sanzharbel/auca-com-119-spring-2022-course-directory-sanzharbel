import java.util.Scanner;

public class URI1287 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String msg = sc.nextLine();
            msg = msg.replaceAll("l", "1");
            msg = msg.replaceAll("o", "0");
            msg = msg.replaceAll("O", "0");
            msg = msg.replaceAll(",", "");
            msg = msg.replaceAll(" ", "");

            StringBuilder ab = new StringBuilder(msg);
            if (msg.length() == 0)
                System.out.println("error");
            else {
                while (ab.length() > 0 && ab.charAt(0) == '0') {
                    ab.deleteCharAt(0);
                }
                if (ab.length() == 0)
                    ab.append("0");
                try {
                    int aa = Integer.parseInt(ab.toString());
                    System.out.println(ab);
                } catch (Exception e) {
                    System.out.println("error");
                }
            }
        }
    }
}