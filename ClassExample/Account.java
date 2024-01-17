package ClassExample;

public class Account {

    private int balance = 0;

    public Account() {
    }


    public int deposit(int amount)
    {
        balance += amount;
        System.out.println(amount + "원 입금하였습니다. 현재 잔액: " + balance);
        return balance;
    }

    public int withdraw(int amount) {
        if (balance >= amount)
        {
            balance -= amount;
            System.out.println(amount + "원 출금하였습니다. 현재 잔액: " + balance);
        }else{
            System.out.println("잔액이 부족합니다. 현재 잔액은 " + balance + "원 남아있습니다.");
        }
        return balance;
    }

    public void showbalance() {
        System.out.println("현재 잔액 " + balance + "원 있습니다.");
    }
}
