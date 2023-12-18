package poly.ex2;

public class AnimalPolyMain3 {

    public static void main(String[] args) {
        Animal[] animalArr = {new Dog(), new Cat(), new Cow()};

        for (Animal animal : animalArr) {

            soundAnimal(animal);    // Ctrl + Alt + M 으로 객체생성

        }

    }

    private static void soundAnimal(Animal animal) {
        //변하지 않는 부분
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
