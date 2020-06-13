import java.util.Scanner;

public class CodeUpBasic45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strs = str.split(" ");
        int a = Integer.parseInt(strs[0]);
        int b = Integer.parseInt(strs[1]);

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        double c = Double.parseDouble(String.format("%.3f", (double)a / (double) b));
        System.out.printf("%.2f", c);

    }
}
