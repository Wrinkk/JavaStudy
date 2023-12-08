package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0;

        while(true){
            System.out.println("-----------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4. 종료");
            System.out.println("-----------------------------------");
            System.out.print("선택 :");
            int select = scanner.nextInt();
            if (select == 1){
                System.out.print("입금액을 입력하세요: ");
                balance = deposit(balance, scanner.nextInt());
            }else if(select == 2){
                System.out.print("출금액을 입력하세요: ");
                balance = withdraw(balance, scanner.nextInt());
            }else if(select == 3){
                System.out.print("현재 잔액 : " + balance);
                System.out.println();
            }else if(select == 4){
                System.out.println("프로그램을 종료합니다.");
                break;
            }else {
                System.out.println("올바른 선택을 해주세요.");
            }
        }
    } // if else를 많이 사용하게 되면 switch문을 사용해보도록 하자.
    public static int deposit(int balance,int amount){
        balance += amount;
        System.out.println(amount +"원을 입금하였습니다. 현재 잔액: " + balance);
        return balance;
    }
    public static int withdraw(int balance,int amount){
        if(balance >= amount){
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance);
        }else {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }
}
