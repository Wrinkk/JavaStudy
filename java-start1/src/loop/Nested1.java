package loop;

public class Nested1 {

    public static void main(String[] args) {
        for (int i=0; i < 2; i++){
            System.out.println("외부 for 시작 i:" + i);
            for (int j = 0; j < 3; j++) {
                System.out.println("-> 내부 for " + i + "-" + j);
            }
            System.out.println("외부 for 종료 i:" + i);
            System.out.println(); //라인 구분용
        } // 외부 i 1번을 돌면 내부 j 3번을 다돌고 나오는 코드
    }
}