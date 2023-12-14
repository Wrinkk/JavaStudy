package pack;

import pack.a.User;

public class PackageMain3 {

    public static void main(String[] args) {
        User userA = new User();
        pack.b.User userB = new pack.b.User();

    } // 내가 오픈소스나 라이브러리를 만들어서 외부에 제공한다면 도메인 이름을 거꾸로 사용하자.
}
