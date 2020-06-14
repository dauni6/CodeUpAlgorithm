import java.util.Scanner;

public class CodeUpBasic48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        String[] nums = num.split(" ");
        int a = Integer.parseInt(nums[0]);
        int b = Integer.parseInt(nums[1]);
        a <<= b ;
        System.out.println(a);
    }
}
