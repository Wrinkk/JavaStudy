package poly.ex4;

public abstract class AbstractAnimal {

    public abstract void sound();
    //추상 메서드가 하나라도 있으면, 추상클래스를 선언해야한다.
    // 추상 메서드는 상속 받는 자식 클래스가반드시 오버라이딩 해서 사용해야 한다.

    public abstract void move();

}
