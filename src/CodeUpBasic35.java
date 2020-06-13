import java.util.Scanner;

public class CodeUpBasic35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();

        int hex = Integer.parseInt(num, 16);
        String octal = Integer.toOctalString(hex);
        System.out.println(octal);


    }
}
