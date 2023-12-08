package array.ex;

import java.util.Scanner;

public class ArrayEx6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("입력 받을 숫자의 개수를 입력하세요 : ");
        int j = scanner.nextInt();
        int[] numbers  = new int[j];
        int minNumber, maxNumber;
        System.out.println(j + "개의 정수를 입력하세요:");
        for(int i = 0; i < j ; i++){
            numbers[i] = scanner.nextInt();
        }

        minNumber = numbers[0];
        maxNumber = numbers[0];
        for (int i = 1; i < j; i++){
            if(numbers[i] < minNumber){
                minNumber = numbers[i];
            }
            if(numbers[i] > maxNumber){
                maxNumber = numbers[i];
            }
        }
        System.out.println("가장 작은 수: " + minNumber);
        System.out.println("가장 큰 수: " + maxNumber);
    }
}
