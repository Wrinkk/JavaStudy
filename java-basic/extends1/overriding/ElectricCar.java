package extends1.overriding;

public class ElectricCar extends Car {

    @Override //생략 가능 하지만 @ 애노테이션을 붙이면, 컴파일러가 인식 , 체크 한 후 에러로 알려줌.
    //필수는 아니지만, 코드의 명확성을 위해 붙여주는것이 좋음. 관례 느낌!
    public void move() {

        System.out.println("전기차를 빠르게 이동합니다.");
    }

    public void charge() {
        System.out.println("충전합니다.");
    }
}
