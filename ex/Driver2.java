package poly_inher.ex;

import java.util.Scanner;

public class Driver2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car[] car = new Car[3];
        car[0] = new K3Car();
        car[1] = new TeslaCar();
        car[2] = new SsoCar();

        System.out.println("랜덤한 번호의 차량을 선택하세요.: ");
        int input = scanner.nextInt();

        switch (input)
        {
            case 1:
                car[0].startEngine();
                break;
            case 2:
                car[1].startEngine();
                break;
            case 3:
                car[2].startEngine();
                break;

        }


        if (car[input-1] instanceof K3Car){
            car[0].pressAccelerator();
        }
        if (car[input-1] instanceof TeslaCar){
            car[1].pressAccelerator();
        }
        if (car[input-1] instanceof SsoCar){
            car[2].pressAccelerator();
        }







    }
}
