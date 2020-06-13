import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class CodeUpBasic26 {

    public static void main(String[] args) {

        Reader reader = new InputStreamReader(System.in);
        Scanner sc = new Scanner(reader).useDelimiter("^[0-9]*.[0-9]*.[0-9]*$");
        String str = sc.nextLine();
        String[] strs = str.split(":");
        int minute = Integer.parseInt(strs[1]);
        System.out.println(minute);

    }
}
