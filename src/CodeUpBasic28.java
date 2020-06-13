import java.util.Scanner;

public class CodeUpBasic28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseUnsignedInt(sc.nextLine());
        String sInt = Integer.toUnsignedString(num);
        System.out.println(sInt);
    }
}
