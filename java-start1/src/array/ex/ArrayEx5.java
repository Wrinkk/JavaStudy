package array.ex;

import java.util.Scanner;

public class ArrayEx5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double average ;
        System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
        int j = scanner.nextInt();
        int[] numbers  = new int[j];
        System.out.println(j + "개의 정수를 입력하세요:");
        for(int i = 0; i < j ; i++){
            numbers[i] = scanner.nextInt();

            sum += numbers[i];
        }
        average = (double)sum / j;
        System.out.println("정수의 합: " + sum);
        System.out.println("정수의 평균 값: " + average);
    }
}
