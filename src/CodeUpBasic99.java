import java.io.*;
import java.util.Scanner;

public class CodeUpBasic99 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            //첫번째 행 전부 1
            //두번째 부터 마지막행 전까지는 배열 인덱스0 과 끝만 1
            //마지막 행 전부 1
            //개미의 진행방향은 배열 인덱스가 0 부터 탐색하는것 과 같다. 1을 만나면 다음 행으로 넘어가면 된다.
            //1을 만나면 다음행에는 그 막혔던 부분을 먼저 탐색. 1이 없으면 이동 만나면 반복
            //2를 만나면 종료

            //미로상자 만들기
            int[][] maze = new int[10][10]; //미로상자 만듦

            // 배열 생성
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    maze[i][j] = sc.nextInt();
                }
            }

            //이동하기(이동한 자리는 9로 바꿔주고, 2를 만나고 난 이후에도 9로 바꿔줘야함)
            //출발점은 (2, 2) 부터 시작
            int c = 1;
            loop:
            for (int i = 1; i < 10; i++) {
                for (int j = c; j < 10; j++) {
                    if (maze[i][j] == 2) {
                        maze[i][j] = 9;
                        break loop;
                    } else {
                        if (maze[i][j] == 0) {
                            maze[i][j] = 9;
                        } else { // 1이면
                            c = j - 1;
                            break;
                        }
                    }
                }
            }

            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    bw.write(maze[i][j] + " ");
                }
                bw.write("\n");
            }

            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
