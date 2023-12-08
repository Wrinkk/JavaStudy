package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};

        //일반 for문
        for (int i = 0; i < numbers.length; ++i) {
            int number = numbers[i];
            System.out.println(number);
        }
        //향상된 for 문 , 배열의 인덱스를 사용하지 않고도 배열의 요소를 순회할 수 있기 떄문에 코드가 간결하고 가독성이 좋음. ,단축키 iter
        for(int number : numbers){
            System.out.println(number);
        }

        //for-each문을 사용 할 수 없는 경우, 증가하는 index 값 필요 할 때,
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("nuber" + i + "번의 결과는" + numbers[i]);
        }


    }
}
