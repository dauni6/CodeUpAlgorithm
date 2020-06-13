import java.util.Scanner;

public class CodeUpBasic24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        char total[] = text.toCharArray();

        for(int i=0; i<total.length; i++) {
            System.out.println("'"+total[i]+"'");
        }
    }
}
