package template_method.practice;

/*
    템플릿 기능을 가진 패턴이다. 상위 클래스 쪽에 템플릿이 될 메서드가 정의되어 있고,
    그 메서드 정의에 추상 메소드를 사용한다.

    상위 클래스에서 처리의 뼈대를 결정하고, 하위 클래스에서 그 구체적 내용을 결정하는 패턴. (상속 + 추상화)
    - 로직을 공통화할 수 있다
 */

public class Main {
    public static void main(String[] args) {
        AbstractDisplay2 a1 = new CharDisplay('H');

        AbstractDisplay2 a2 = new StringDisplay("Hello, World");

        a1.display();
        a2.display();
    }
}
