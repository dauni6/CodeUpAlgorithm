import java.util.Scanner;

public class CodeUpBasic42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strs = str.split(" ");
        int a = Integer.parseInt(strs[0]);
        int b = Integer.parseInt(strs[1]);
        int result = a/b;
        System.out.println(result);

    }
}
