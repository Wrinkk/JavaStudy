package scanner.ex;

import java.util.Scanner;

public class ScannerEx3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("음식 이름을 입력 해주세요:");
        String food = input.nextLine();

        System.out.println("음식의 가격을 입력해주세요:" );
        int price = input.nextInt();

        System.out.println("음식의 수량을 입력해주세요");
        int foodQuantity = input.nextInt();

        int totalPrice = price * foodQuantity;

        System.out.println(food + " " + foodQuantity + "개를 주문 하셨습니다. 총 가격은 " + totalPrice + "원 입니다." );

    }
}
