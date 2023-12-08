package scanner.ex;

import java.util.Scanner;

public class ChangeVarEx {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;


        temp = a;
        a = b;
        b = temp; // a와 b 만으로 값을 옮기기엔 한쪽 값이 사라지기에 temp 라는 공간을 이용하여 옮길 수 있다.


        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
