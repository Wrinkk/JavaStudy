package access.ex;

public class MaxCounter {
    private int count = 0;
    private int max;

    public MaxCounter(int max){
        this.max = max; // this를 써줘야 밖에 있는 max에 값을 집어넣을 수있었음.. 기억하자!!
    }

    public void increment() {
        if (count >= max){
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }
        count++;
    }
    public int getCount() {
        return count;
    }
}
