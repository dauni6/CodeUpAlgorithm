import java.io.*;

public class CodeUpBasic94 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int n = Integer.parseInt(br.readLine());
            int[] arry = new int[n];

            String input = br.readLine();
            String[] nums = input.split(" ");

            int k = 0;
            for (int i = nums.length - 1; i >= 0; i--) {
                arry[k] = Integer.parseInt(nums[i]);
                bw.write(arry[k] + " ");
                k++;
            }

            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
