import java.io.*;

public class CodeUpBasic90 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            String input = br.readLine();
            String[] nums = input.split(" ");
            long a = Long.parseLong(nums[0]);
            long r = Long.parseLong(nums[1]);
            long n = Long.parseLong(nums[2]);

            long save = a;
            for (int i = 1; i < n; i++) {
                save *= r;
            }
            bw.write(save + "");
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
