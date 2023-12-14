package access.a;

public class PublicClass {
    public static void main(String[] args) {
        // public 클래스는 파일명이 같아야하며, 하나만 존재할 수 있음.
        PublicClass publicClass = new PublicClass();
        DefaultClass1 class1 = new DefaultClass1();
        DefaultClass2 class2 = new DefaultClass2();
    }
}
class DefaultClass1 {

}

class DefaultClass2 {

}
