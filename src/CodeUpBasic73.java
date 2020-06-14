import java.util.Scanner;

public class CodeUpBasic73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            int num = sc.nextInt();
            if (num != 0)
                System.out.println(num);
            else
                flag = false;
        }

    }
}
