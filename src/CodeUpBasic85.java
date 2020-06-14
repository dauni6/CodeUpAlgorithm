import java.io.*;

public class CodeUpBasic85 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            String input = br.readLine();
            String[] datas = input.split(" ");
            double h = Double.parseDouble(datas[0]);
            double b = Double.parseDouble(datas[1]);
            double c = Double.parseDouble(datas[2]);
            double s = Double.parseDouble(datas[3]);

            double one = ( (h * b * c * s) / 8) / 1024 / 1024;
            String result = String.format("%.1f", one);
            bw.write(result + " MB");
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
