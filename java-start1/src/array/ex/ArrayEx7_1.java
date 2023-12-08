package array.ex;

import java.util.Scanner;

public class ArrayEx7_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int [][] score = new int [4][3];
        String subject [] = {"국어","영어","수학"};
        for(int i=0; i < 4; i++){
            int total = 0;
            System.out.println((i+1) + "번 학생의 성적을 입력하세요:");
            for(int j=0; j<3; j++){
                System.out.print(subject[j] + "점수: "); //과목 수가 결국 점수칸의 배열 개수랑 같기에 이중 for문을 이용하여 작성.
                score [i][j] = scanner.nextInt();

                total += score[i][j];

            }
            double average = total / 3.0;
            System.out.println((i+1) + "번 학생의 총점: " + total +", 평균: " + average );
        }  // 점수 입력할 때마다 평균 나오게하는 코드

    }
}
