import java.util.Scanner;

public class CodeUpBasic39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = sc.nextLine().split(" ");
        long one = Long.parseLong(strs[0]);
        long two = Long.parseLong(strs[1]);
        long sum = one + two;
        System.out.println(sum);

    }
}
