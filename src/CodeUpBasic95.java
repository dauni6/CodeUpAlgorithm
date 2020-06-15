import java.io.*;

public class CodeUpBasic95 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int n = Integer.parseInt(br.readLine());
            int[] arry = new int[n];

            String input = br.readLine();
            String[] nums = input.split(" ");

            for (int i = 0; i < arry.length; i++) {
                arry[i] = Integer.parseInt(nums[i]);
            }

            int lowest = arry[0];
            for (int k = 1; k < arry.length; k++) {
                if (lowest > arry[k]) {
                    lowest = arry[k];
                }
            }
            bw.write(lowest+"");
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
