package method;

public class MethodValue2 {
 // 자바는 값을 복사해서 대입한다.
    public static void main(String[] args) {
        int number = 5;
        System.out.println("1. changeNumber 호출 전, number: " + number); //5
        changeNumber(number);
        System.out.println("4. changeNumber 호출 후, number: " + number); // 5가 출력 됨.
    }

    public static void changeNumber(int number) {
        System.out.println("1. changeNumber 변경 전, num2: " + number); //num1의 값 5가 num 2에 복사됨.
        number = number * 2; //num 2에 2를 곱함.
        System.out.println("3. changeNumber 변경 후, num2: " + number); //10
    }
} // 결과적으로 매개변수 num2의 값만 10으로 변경되고 num1의 값은 변경되지 않고 기존 값인 5로 유지된다.
// 자바는 항상 값을 복사해서 전달하기때문에 num2의 값을 바꾸더라도 num1 에는 영향을 주지 않음.
