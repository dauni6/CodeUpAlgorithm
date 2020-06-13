import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class CodeUpBasic18 {

    public static void main(String[] args) {
        Reader reader = new InputStreamReader(System.in);
        Scanner sc = new Scanner(reader).useDelimiter("^[0-9]*:[0-9]*$");

        String line = sc.nextLine();
        System.out.printf(line);

        sc.close();
    }
}
