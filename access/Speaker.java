package access;

public class Speaker {

    private int volume; //private 을 이용하여서 외부에서의 접근을 막는것.
    // private -> default(기본값) -> protected(상속관계) -> public 순으로 허용범위

    Speaker(int volume) {
        this.volume = volume;
    }

    void volumUp() {
        if(volume >= 100){
            System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");

        }else {
            volume += 10;
            System.out.println("음량을 10 증가합니다.");

        }
    }

    void volumDown() {
        volume -= 10;
        System.out.println("volumDown 호출");
    }
    void showVolume(){
        System.out.println("현재 음량은: " + volume );
    }

}
