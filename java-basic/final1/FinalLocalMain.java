package final1;

public class FinalLocalMain {

    public static void main(String[] args) {
        //final 지역 변수
        final int data1;
        data1 = 10; //최초 한번만 할당 가능
        //data1 = 20; // 컴파일 오류

        //fainal 지역 변수2
        final int data2 = 10;
        //data2 = 20; //컴파일 오류
    }

    static void method(final int parameter){
        //    parameter = 20; //컴파일오류
    }
} //final을 지역 변수에 설정할 경우 최초 한번만 할당할 수 있음. 따라서 메서드 호출시점에 사용된 값이 끝까지 사용된다.
