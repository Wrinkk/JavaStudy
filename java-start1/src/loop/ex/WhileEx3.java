package loop.ex;

public class WhileEx3 {

    public static void main(String[] args) {
        int max = 100;
        int sum = 0;
        int i = 1;
        while(i <= max)
        {
            sum += i; //  1+2+3+4 ... + max 의 값까지 더하면서 왼쪽값에 대입.
            i++;

        }
        System.out.println(sum);
    }
}
