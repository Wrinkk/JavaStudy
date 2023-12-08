package scope;

public class Scope3_2 {
    public static void main(String[] args) {

        int m = 10;
        if (m > 8){
            int temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
} // temp를 필요한곳에서만 사용함으로써 메모리 효율과 코드복잡성이 없어짐.
