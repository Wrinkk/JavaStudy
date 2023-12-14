package oop1;

public class MusicPlayerMain4 {

    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        player.on();

        //볼륨증가
        player.volumeUp();
        //볼륨증가
        player.volumeUp();
        //볼륨감소
        player.volumeDown();

        //음악 플레이어 상태
        System.out.println("음악 플레이어 상태 확인");
        player.showStatus();

        player.off();
    }
}
