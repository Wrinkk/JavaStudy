package ClassExample;

public class Account {

    private long balance = 0;
    private String owner;

    public Account() {
    }


    public long deposit(String owner,long amount)
    {
        this.owner = owner;
        balance += amount;
        System.out.println("계좌주 명: " + owner + ", " + amount + "원 입금하였습니다. 현재 잔액: " + balance);
        return balance;
    }

    public long withdraw(long amount) {
        if (balance >= amount)
        {
            balance -= amount;
            System.out.println( this.owner + "님의 계좌에서 " + amount + "원 출금하였습니다. 현재 잔액: " + balance);
        }else{
            System.out.println("잔액이 부족합니다. 현재 잔액은 " + balance + "원 남아있습니다.");
        }
        return balance;
    }

    public void showbalance() {
        System.out.println(this.owner+"님의 계좌에 "+"현재 " + balance + "원 있습니다.");
    }
}
