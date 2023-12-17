package extends1.super2;

public class ClassC extends ClassB{

    public ClassC() {
        super(10,20);
        System.out.println("ClassC 생성자");
    }
} // 예외로 생성자 첫줄에 this가 사용할수있음. 그 대신 super을 무조건 한번 거쳐야함.
