import java.util.Scanner;

public class CodeUpBasic46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strs = str.split(" ");
        int a = Integer.parseInt(strs[0]);
        int b = Integer.parseInt(strs[1]);
        int c = Integer.parseInt(strs[2]);

        System.out.println(a + b + c);
        double mean = (a + b + c) / (double)strs.length;
        double result = Double.parseDouble(String.format("%.2f", mean));
        System.out.printf("%.1f", result);

    }
}
