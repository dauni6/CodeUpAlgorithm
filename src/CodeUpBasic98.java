import java.io.*;

public class CodeUpBasic98 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            //격자판 가로h, 세로w
            System.out.println("세로, 가로 입력 : ");
            String input = br.readLine();
            String[] hw = input.split(" ");
            int h = Integer.parseInt(hw[0]);
            int w = Integer.parseInt(hw[1]);
            int[][] matrix = new int[h][w]; //격자판

            System.out.println("놓을 수 있는 막대의 개수 : ");
            int n = Integer.parseInt(br.readLine());

            System.out.println("막대 길이, 방향, 좌표입력 : ");
            //가로면 x로, 세로면 y로 결국 길이 l만큼 반복해서 1을 뿌려주면 될 거 같다.

            for (int i = 0; i < n; i ++) {
                String data = br.readLine();
                String[] nums = data.split(" ");
                int l = Integer.parseInt(nums[0]); //길이
                int d = Integer.parseInt(nums[1]); //막대 방향 가로 0, 세로1
                int x = Integer.parseInt(nums[2]); //x좌표
                int y = Integer.parseInt(nums[3]); //y좌표
                int c;
                if (d == 0) { //가로
                    c = y - 1;
                    for (int j = 0; j < l; j++) {
                        matrix[x - 1][c] = 1;
                        c++;
                    }
                } else {
                    c = x - 1;
                    for (int j = 0; j < l; j++) {
                        matrix[c][y - 1] = 1;
                        c++;
                    }
                }
            }

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    bw.write(matrix[i][j] + " ");
                }
                bw.write("\n");
            }

            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
