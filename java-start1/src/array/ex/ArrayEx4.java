package array.ex;

import java.util.Scanner;

public class ArrayEx4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double average;
        int [] numbers = new int[5];
        System.out.println("5개의 정수를 입력하세요");
        for(int i = 0; i<numbers.length; i++){
            numbers[i] = scanner.nextInt();

            sum += numbers[i];
        }
        average = (double)sum / 5;
        System.out.println("정수의 합: " + sum);
        System.out.println("정수의 평균 값: " + average);
    }
}
