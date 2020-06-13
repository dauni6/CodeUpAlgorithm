import java.util.Scanner;

public class CodeUpBasic21 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char data[] = new char[51];

        String word = sc.nextLine(); //한 문자열 입력받기
        if (word.length() < 52) {

            //charAt 으로 data[] 에 한글자 씩 넣기
            for (int i = 0; i < word.length(); i++)
                data[i] = word.charAt(i);


            for (int k = 0; k < data.length; k++)
                System.out.printf("%s", data[k]);


        } else
            System.out.println("입력 문자가 너무 깁니다.");

    }

}
