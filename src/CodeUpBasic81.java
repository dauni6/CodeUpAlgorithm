import java.util.Scanner;

public class CodeUpBasic81 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String num = sc.nextLine();
      String[] nums = num.split(" ");
      int a = Integer.parseInt(nums[0]);
      int b = Integer.parseInt(nums[1]);
      for (int i = 1; i <= a; i++) {
          for (int j = 1; j <= b; j++) {
              System.out.println(i + " " + j);
          }
      }

    }
}
