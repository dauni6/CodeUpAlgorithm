import java.io.*;

public class CodeUpBasic93 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int n = Integer.parseInt(br.readLine());
            int[] arry = new int[24];

            String input = br.readLine();
            String[] nums = input.split(" ");

            for (int i = 0; i < n; i++) {
                int num = Integer.parseInt(nums[i]);
                arry[num]++;
            }

            for (int i = 1; i < arry.length; i++) {
                bw.write(arry[i] + " ");
            }
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
