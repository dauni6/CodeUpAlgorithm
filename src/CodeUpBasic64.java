import java.util.Scanner;

public class CodeUpBasic64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        String[] nums = num.split(" ");
        int a = Integer.parseInt(nums[0]);
        int b = Integer.parseInt(nums[1]);
        int c = Integer.parseInt(nums[2]);
        System.out.println((a < b ? a : b) < c ? (a < b ? a : b) : c);

    }
}
