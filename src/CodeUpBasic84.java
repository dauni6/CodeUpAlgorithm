import java.io.*;
import java.util.Scanner;

public class CodeUpBasic84 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String num = br.readLine();
        String[] nums = num.split(" ");
        int r = Integer.parseInt(nums[0]);
        int g = Integer.parseInt(nums[1]);
        int b = Integer.parseInt(nums[2]);

        int rt = 0;
        int gt = 0;
        int bt = 0;

        for (int i = 0; i < r * g * b; i++) {
            bw.write(rt + " " + gt + " " + bt + "\n");
            bw.flush();
            if (bt != b - 1){
                bt++;
            } else {
                bt = 0;
                if (gt != g - 1) {
                    gt++;
                } else {
                    gt = 0;
                    rt++;
                }
            }
        }
        System.out.println(r * g * b);
    }
}
