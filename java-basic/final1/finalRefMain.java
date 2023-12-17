package final1;

public class finalRefMain {
    public static void main(String[] args) {
        final Data data = new Data();
        //data = new Data();

        //참조 대상의 값은 변경 가능. Data.value의 값은 final이 아니기때문. 참조값만 바꿀수가 없음.
        data.value =10;
        System.out.println(data.value);
        data.value =20;
        System.out.println(data.value);

    }
}
