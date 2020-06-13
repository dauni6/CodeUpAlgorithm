import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CodeUpBasic27 {
    public static void main(String[] args) {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(rd).useDelimiter("^[0-9]*.[0-9]*.[0-9]*$");
        String str = sc.nextLine();
        String[] strs = str.split("\\.");
        int day = Integer.parseInt(strs[2]);
        int mon = Integer.parseInt(strs[1]);
        int year = Integer.parseInt(strs[0]);

        System.out.printf("%02d-%02d-%d", day, mon, year);

    }
}
