package ref;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
        data.value = 0; //NullPointerException 예외 발생  (주소지가 null 이기에.)
        System.out.println("data = " + data.value);
    }
}
