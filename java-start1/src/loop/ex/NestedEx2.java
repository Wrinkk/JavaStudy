package loop.ex;

public class NestedEx2 {
    public static void main(String[] args) {

        int rosw = 5;
        for(int i = 0;i <rosw; i++){
            for(int j = 0; j<=i;j++){

                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
