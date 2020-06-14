import java.util.Scanner;

public class CodeUpBasic82 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String input = sc.nextLine().toUpperCase();
      int a = Integer.valueOf(input, 16);

      for (int i = 1; i < 16; i++) {
          String hex = Integer.toHexString(i).toUpperCase();
          int b = Integer.valueOf(hex, 16);
          int by = a * b;
          String result = Integer.toHexString(by).toUpperCase();
        System.out.println(input + "*" + hex + "=" + result);
      }

    }
}
