import java.io.*;

public class CodeUpBasic92 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            String input = br.readLine();
            String[] nums = input.split(" ");
            int a = Integer.parseInt(nums[0]);
            int b = Integer.parseInt(nums[1]);
            int c = Integer.parseInt(nums[2]);

            int day = 1;
            while (true) {
                if (day%a != 0 || day%b != 0 || day%c !=0) {
                        day++;
                } else {
                    bw.write(day + "");
                    break;
                }
            }

            bw.flush();
            bw.close();
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
