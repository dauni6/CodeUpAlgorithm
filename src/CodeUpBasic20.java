import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class CodeUpBasic20 {

    public static void main(String[] args) {
        Reader reader = new InputStreamReader(System.in);
        Scanner sc = new Scanner(reader).useDelimiter("^[0-9]*-[0-9]*$");

        try{
            String line = sc.nextLine();
            String[] parsing = line.split("-");
            int first = Integer.parseInt(parsing[0]);
            int second = Integer.parseInt(parsing[1]);

            System.out.printf("%06d%07d", first, second);
        } catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }



    }
}
