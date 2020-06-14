import java.io.*;

public class CodeUpBasic86 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            String input = br.readLine();
            String[] datas = input.split(" ");
            double w = Double.parseDouble(datas[0]);
            double h = Double.parseDouble(datas[1]);
            double b = Double.parseDouble(datas[2]);

            double one = ( (w * h * b) / 8) / 1024 / 1024;
            String result = String.format("%.2f", one);
            bw.write(result + " MB");
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
