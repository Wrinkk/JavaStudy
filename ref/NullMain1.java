package ref;

public class NullMain1 {

    public static void main(String[] args) {
        Data data = null; //
        System.out.println("1. data = " + data);
        data = new Data(); // value가 있기에 0이 들어감 x001
        System.out.println("2. data = " + data);
        data = null; // data 인스턴스를 참조하지않음
        System.out.println("3. data = " + data);
        // 자바는 아무도 참조하지 않는 인스턴스가 있으면 JVM의 GC가 더이상 사용하지 않는 인스턴스라 판단하고 해당 인스턴스를 자동으로 메모리에서 제거.
    }
}
