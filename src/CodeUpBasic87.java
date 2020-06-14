import java.io.*;

public class CodeUpBasic87 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            int num = Integer.parseInt(br.readLine());
            int i = 1;
            int sum = 1;
            while (true) {
                if (sum >= num) {
                    bw.write(sum + "");
                    bw.flush();
                    break;
                }
                i++;
                sum += i;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
