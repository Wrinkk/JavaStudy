package poly.ex6;




public class SoundFlyMain {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Chicken chicken = new Chicken();

        soundAnimal(dog);
        soundAnimal(bird);
        soundAnimal(chicken);

        flyAnimal(bird);
        flyAnimal(chicken);


    }
    private static void soundAnimal(AbstractAnimal animal) {
        //변하지 않는 부분
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    //Fly 인터페이스가 있으면 사용 가능
    private static void flyAnimal(Fly fly) {
        System.out.println("날기 테스트 시작");
        fly.Fly();
        System.out.println("날기 테스트 종료");
    }
    // 인터페이스와 상속을 잘이용하면 여러곳에서 상속을 할수 있음. (?) 질문해보기
}
