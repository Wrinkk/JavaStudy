package poly_inher.ex;

public class SsoCar extends Car{
    @Override
    public void startEngine() {
        System.out.println("쏘카의 시동이 걸립니다.");
    }

    @Override
    public void offEngine() {
        System.out.println("쏘카의 시동이 꺼집니다.");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("쏘카의 속도가 올라갑니다.");
    }

    @Override
    public void pressBrake() {
        System.out.println("쏘카의 속도가 줄어듭니다.");
    }
    public void rentalPrice() {
        System.out.println("요금을 충전합니다.");
    }
}
