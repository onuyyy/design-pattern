package adapter;

/*
    Adapter 패턴은 Wrapper 패턴이라고도 한다. 래퍼는 감싸는 것을 의미하는데,
    무엇인가를 포장해서 다른 용도로 사용할 수 있도록 변환해주는 것이 래퍼이자 어댑터이다.

    1. 클래스에 의한 Adapter 패턴 (상속)
    2. 인스턴스에 이한 Adapter 패턴 (위임)

    어떨 때 사용할까?
    - 기존 클래스를 재사용하고 싶을 때, Adapter 패턴은 기존 클래스에 한겹 덧씌워 필요한 클래스를 만든다.
    - 기존 코드 안 바꾸고 새로운 코드와 호환

    상속, 위임 어느 쪽을 사용할까?
    - 일반적으로 위임을 사용하는 편이 문제가 적다.
      상속은 상위 클래스의 내부 동작을 모르면, 효율적으로 사용하기 어려운 경우가 많기 때문이다.

    이 패턴의 핵심은 인터페이스 또는 추상클래스를 활용한 다형성이다.
 */

public class Main {
    public static void main(String[] args) {
        // 제공된 것 : 교류 100 볼트 Banner 클래스
        // 변환 장치 : 어댑터 PrintBanner
        // 필요한 것 : 직류 12볼트 Print 인터페이스

        // 1. 상속 Adapter
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();

        // 2. 위임 Adapter
        Print2 p2 = new PrintBanner2("Hello");
        p2.printWeak();
        p2.printStrong();
    }
}
