import java.io.*;

public class CodeUpBasic96 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int n = Integer.parseInt(br.readLine());
            int[][] baduk = new int[20][20];

            for (int i = 0; i < n; i++) { //입력받기
                String input = br.readLine();
                String[] nums = input.split(" ");
                int x = Integer.parseInt(nums[0]);
                int y = Integer.parseInt(nums[1]);
                baduk[x][y] = 1;
            }

            for (int t = 1; t < baduk.length; t++) {
                for (int k = 1; k < baduk.length; k++) {
                    if (baduk[t][k] == 1) {
                        bw.write("1 ");
                    } else {
                        bw.write("0 ");
                    }
                }
                bw.write("\n");
            }

            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
