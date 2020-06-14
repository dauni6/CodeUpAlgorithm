import java.util.Scanner;

public class CodeUpBasic80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int sum = 0;
        int i = 1;
        while (true) {
            sum += i;
            if (sum >= target) {
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}
