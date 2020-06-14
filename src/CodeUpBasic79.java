import java.util.Scanner;

public class CodeUpBasic79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            char alphabet = sc.next().charAt(0);
            System.out.println(alphabet);
            if ('q' == alphabet) {
               break;
            }
        }
    }
}
