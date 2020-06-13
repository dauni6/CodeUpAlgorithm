import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class CodeUpBasic19 {

    public static void main(String[] args) {
        Reader reader = new InputStreamReader(System.in);
        Scanner sc = new Scanner(reader).useDelimiter("^[0-9]*.[0-9]*.[0-9]*$");

        String line = sc.nextLine();
        String[] parsing = line.split("\\.");
        int year = Integer.parseInt(parsing[0]);
        int mon = Integer.parseInt(parsing[1]);
        int day = Integer.parseInt(parsing[2]);

        System.out.printf("%04d.%02d.%02d", year, mon, day);

    }
}
