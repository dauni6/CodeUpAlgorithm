import java.util.Scanner;

public class CodeUpBasic57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        String[] nums = num.split(" ");
        int a = Integer.parseInt(nums[0]);
        int b = Integer.parseInt(nums[1]);
        if (a == b ) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
