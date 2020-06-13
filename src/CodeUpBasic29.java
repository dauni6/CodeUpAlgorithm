import java.util.Scanner;

public class CodeUpBasic29 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double actual = sc.nextDouble();
        String result = String.format("%.11f ", actual);
        System.out.println(result);
        sc.close();
    }
}
