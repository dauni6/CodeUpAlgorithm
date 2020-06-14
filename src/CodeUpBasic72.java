import java.util.Scanner;

public class CodeUpBasic72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int[] nums = new int[limit];
        for (int i = 0; i < limit; i++) {
            nums[i] = sc.nextInt();
        }

        for (int j = 0; j< nums.length; j++) {
            System.out.println(nums[j]);
        }

    }
}
