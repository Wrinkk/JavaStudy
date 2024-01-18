package poly_inher.ex;

public class K3Car extends Car{
    @Override
    public void startEngine() {
        System.out.println("K3 시동이 걸립니다.");
    }

    @Override
    public void offEngine() {
        System.out.println("K3 시동이 꺼집니다.");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("K3의 속도가 올라갑니다.");
    }

    @Override
    public void pressBrake() {
        System.out.println("K3의 속도가 내려갑니다.");
    }
    public void fillUp() {
        System.out.println("주유중.");
    }
}
