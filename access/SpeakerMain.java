package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumUp();
        speaker.showVolume();

        speaker.volumUp();
        speaker.showVolume();

        /*필드에 직접 접근 (private로 접근 차단)
        System.out.println("Volum 필드 직접 접근");
        speaker.volume = 200;
        speaker.showVolume(); 자유로운 프로그램이 좋은것이 아니라 적당한 제약이 있는 프로그램이 좋은 프로그램이다. */
    }
}
