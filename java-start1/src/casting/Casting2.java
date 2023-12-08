package casting;

public class Casting2 {

    public static void main(String[] args) {
        double doubleValue =1.5;
        int intValue = 0;

       // intValue = doubleValue; 컴파일 오류 발생
       intValue = (int) doubleValue; // 형변환
        System.out.println(intValue);
    } // 형변환을 한다고 doubleValue 자체의 타입이 변경되거나 그 안에 있는 값이 변경되는 것이 아님.
}
