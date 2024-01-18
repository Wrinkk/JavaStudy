package poly_inher.ex;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.startEngine();
        car1.pressAccelerator();
        car1.pressBrake();
        car1.offEngine();



        Car car2 = new K3Car(); // 다형성 O auto up casting
        car2.startEngine();
        car2.pressAccelerator();
        car2.pressBrake();
        car2.offEngine();

        Car car3 = new SsoCar(); // 다형성 O auto up casting
        car3.startEngine();
        car3.pressAccelerator();
        car3.pressBrake();
        car3.offEngine();

        Car car4 = new TeslaCar(); // 다형성 O auto up casting
        car4.startEngine();
        car4.pressAccelerator();
        car4.pressBrake();
        car4.offEngine();

        K3Car Car = (K3Car) car1; // runtime 에러 (강제형변환시 문제점)

        Scanner scanner = new Scanner(System.in);





    }
}
