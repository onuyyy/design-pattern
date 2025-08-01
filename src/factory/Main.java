package factory;

/*
    인스턴스 생성 방법을 상위 클래스에서 결정,
    구체적인 클래스 이름은 결정 x -> 구체적인 살은 모두 하위 클래스에서 붙임
    인스턴스 생성을 위한 뼈대와 인스턴스를 생성하는 클래스를 나눔
 */

import factory.framework.Factory;
import factory.framework.Product;
import factory.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product c1 = factory.create("kim");
        Product c2 = factory.create("jin");
        Product c3 = factory.create("ho");

        c1.use();
        c2.use();
        c3.use();
    }
}
