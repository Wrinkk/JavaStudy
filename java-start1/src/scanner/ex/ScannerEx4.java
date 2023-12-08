package scanner.ex;

import java.util.Scanner;

public class ScannerEx4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("구구단의 단 수를 입력해주세요:");
        int num1 = input.nextInt();

        System.out.println(num1 + "단의 구구단: ");

        for (int i= 1; i<=9; i++){
            int gob = num1 * i;
            System.out.println(num1 +" * "+ i +" = "+ gob);
        }
    }
}
