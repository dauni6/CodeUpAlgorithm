import java.util.Scanner;

public class CodeUpBasic32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String hex = Integer.toHexString(num).toLowerCase();
        System.out.println(hex);

    }
}
