package oop1.ex;

public class AccountMain {

    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(10000);

        account.withdraw(9000);
        account.withdraw(2000);

        System.out.println("잔고: "+account.balance);
    }
} // 절차와 객체의 차이는 절차지향은 데이터와 해당 데이터에 대한 처리방식이 분리 되어있음
// 객체는 데이터와 그 데이터에 대한 행동이 하나의 객체 안에 함께 포함.
