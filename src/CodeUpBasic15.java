import java.util.Scanner;

public class CodeUpBasic15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n =  sc.nextFloat();
        String result = String.format("%.2f", n);
        System.out.println(result);

        sc.close();

    }
}
