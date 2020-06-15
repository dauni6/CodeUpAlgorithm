import java.io.*;
import java.util.Scanner;

public class CodeUpBasic97 {
    public static void main(String[] args) {
        try {
         int[][] baduk = new int[20][20];
         Scanner sc = new Scanner(System.in);
         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            for (int t = 1; t < baduk.length; t++) { //바둑판 돌 입력하기
                for (int k = 1; k < baduk.length; k++) {
                    baduk[t][k] = sc.nextInt();
                }
            }
            System.out.println("입력횟수 : ");
            int n = sc.nextInt(); //입력횟수
            System.out.println("좌표 입력 : ");
            for (int i = 0; i < n; i++) { //입력받기
                int x = sc.nextInt();
                int y = sc.nextInt();

                for (int u = 1; u < baduk.length; u++) {
                    for (int j = 1; j < baduk.length; j++) {
                            if (baduk[x][j] == 1) {
                                baduk[x][j] = 0;
                            } else {
                                baduk[x][j] = 1;
                            }
                    } //for 2
                    for (int j = 1; j < baduk.length; j++) {
                            if (baduk[j][y] == 1) {
                                baduk[j][y] = 0;
                            } else {
                                baduk[j][y] = 1;
                            }
                    }
                }// for 1
            }

            for (int j = 1; j < baduk.length; j++) {
                for (int q = 1; q <baduk.length; q++) {
                        bw.write(baduk[j][q]+ " ");
                }
                bw.write("\n");
            }

            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
