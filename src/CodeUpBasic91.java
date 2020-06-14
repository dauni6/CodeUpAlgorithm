import java.io.*;

public class CodeUpBasic91 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            String input = br.readLine();
            String[] nums = input.split(" ");
            long a = Long.parseLong(nums[0]);
            long m = Long.parseLong(nums[1]);
            long d = Long.parseLong(nums[2]);
            long n = Long.parseLong(nums[3]);

            long save = a;
            for (int i = 1; i < n; i++) {
                save = (save * m) + d;
            }
            bw.write(save + "");
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
