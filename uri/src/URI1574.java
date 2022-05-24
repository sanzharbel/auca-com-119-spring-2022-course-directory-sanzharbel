import java.util.Scanner;

public class URI1574 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 0; i < n; i++) {
            int x = 0;
            int c = scn.nextInt();
            scn.nextLine();
            int[] cmds = new int[c + 1];
            for (int j = 1; j < cmds.length; j++) {
                String cmd = scn.nextLine();
                switch (cmd) {
                    case "LEFT":
                        cmds[j] = 0;
                        break;
                    case "RIGHT":
                        cmds[j] = 1;
                        break;
                    default:
                        String[] a = cmd.split(" ");
                        cmds[j] = cmds[Integer.parseInt(a[a.length - 1])];
                }
                x = cmds[j] == 0 ? --x : ++x;
            }
            System.out.println(x);
        }
    }
}
