package factory.framework;

public abstract class Product {

// 추상클래스는 생성자를 abstract 키워드로 만들 수 없다.
// 추상 메서드는 하위 클래스에서 반드시 오버라이드 해야 하는데 생성자는 오버라이드 대상 아님
//    public abstract Product() {
//    }

    public abstract void use();
}
