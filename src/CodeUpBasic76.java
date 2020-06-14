import java.util.Scanner;

public class CodeUpBasic76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char alphabet = sc.nextLine().charAt(0);
        int decimal = alphabet;
        for (int i = 97; i <= decimal; i++) {
            System.out.print((char)i + " ");
        }
    }
}
