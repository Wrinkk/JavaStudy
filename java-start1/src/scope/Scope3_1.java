package scope;

public class Scope3_1 {
    public static void main(String[] args) {

        int m = 10;
        int temp = 0;
        if (m > 8){
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
} // temp 의 생존 길이가 길어지기에 비효율적인 메모리 사용과 코드 복잡성이 증가하기에 활동범위 내에서 선언해서 사용하는것이 좋다.
