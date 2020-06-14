import java.io.*;

public class CodeUpBasic84  {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String num = br.readLine();
        String[] nums = num.split(" ");
        int r = Integer.parseInt(nums[0]);
        int g = Integer.parseInt(nums[1]);
        int b = Integer.parseInt(nums[2]);


        for (int i = 0; i < r; i++) {
            for (int j = 0; j < g; j++){
                for (int k = 0; k < b; k++) {
                    bw.write(i + " " + j + " " + k + "\n");
                }
            }
        }
        bw.write(r * g * b +"\n");
        bw.flush();
    }
}