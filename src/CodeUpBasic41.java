import java.util.Scanner;

public class CodeUpBasic41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char alpa = sc.nextLine().charAt(0); //a라면
        int decimal = (char)alpa;
        char nextAlpa = (char)(decimal + 1);
        System.out.println(nextAlpa);

    }
}
