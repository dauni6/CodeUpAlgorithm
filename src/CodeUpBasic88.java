import java.io.*;

public class CodeUpBasic88 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int num = Integer.parseInt(br.readLine());

            for (int i = 1; i <= num; i++) {
                if (i%3 != 0)
                    bw.write(i +" ");
            }
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
