import java.io.*;

public class CodeUpBasic89 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            String input = br.readLine();
            String[] nums = input.split(" ");
            int a = Integer.parseInt(nums[0]);
            int d = Integer.parseInt(nums[1]);
            int n = Integer.parseInt(nums[2]);

            int sum = a;
            for (int i = 1; i < n; i++) {
                sum += d;
            }

            bw.write(sum + "");
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
