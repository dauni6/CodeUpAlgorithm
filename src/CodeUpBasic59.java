import java.util.Scanner;

public class CodeUpBasic59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        num = ~num; //~ 는 not 연산자
        System.out.println(num);
    }
}
