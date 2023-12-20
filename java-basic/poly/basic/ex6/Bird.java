package poly.ex6;
//extends를 통한 상속은 하나만 할 수 있으며,
// implments를 통한 인터페이스는 다중 구현 할 수 있기 때문에 둘이 함께 나온경우, extends가 먼저 나와야함.
//또한 인터페이스는 많이 상속 받을 수 있음!!
public class Bird extends AbstractAnimal implements Fly{
    @Override
    public void sound() {
        System.out.println("짹짹");
    }

    @Override
    public void Fly() {
        System.out.println("새 날기");
    }
}
