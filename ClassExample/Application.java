package ClassExample;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();
        while (true) {
            System.out.println("-----------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4. 종료");
            System.out.println("-----------------------------------");
            System.out.print("선택 : ");
            int input = scanner.nextInt();

            switch (input) {

                case 1:
                    System.out.print("계좌주와 입금금액을 입력하세요 : ");
                    account.deposit(scanner.next(),scanner.nextInt());
                    break;
                case 2:
                    System.out.print("출금금액을 입력하세요 : ");
                    account.withdraw(scanner.nextInt());
                    break;
                case 3:
                    account.showbalance();
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    return;
            }


        }
    }

}
