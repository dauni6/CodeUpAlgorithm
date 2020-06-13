import java.util.Scanner;
import java.util.StringTokenizer;

public class CodeUpBasic23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.nextLine();
        String[] nums = num.split("\\.");

        System.out.println(nums[0]+"\n"+nums[1]);
    }
}
