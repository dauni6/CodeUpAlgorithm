import java.util.Scanner;

public class CodeUpBasic34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int octal = Integer.valueOf(num, 8);
        int decimal = Integer.valueOf(String.valueOf(octal), 10);
        System.out.println(decimal);

    }
}
