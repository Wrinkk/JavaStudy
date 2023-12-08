package loop.ex;

public class NestedEx1 {

    public static void main(String[] args) {

        for(int i=0; i<=9;i++){
            for(int j=1;j<=9;j++){
             int sum = i * j;
                System.out.println(i +" * "+j +" = " +sum);
            }
        } // i =1 일때, j가 9가될 때까지 곱해주는 식 i가 올라가도 동일하게 반복된다.
    }
}
