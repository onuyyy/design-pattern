package factory.idcard;

import factory.framework.Product;

public class IDCard extends Product {

    private String owner;
    private int serial;

    // public 생성자가 아닌 이유는 패키지 내에서만 사용 가능한데,
    // 같은 패키지 내 팩토리 클래스만이 생성할 수 있도록 제한
    IDCard(String owner, int serial) {
        System.out.println(owner + "의 카드를 만듭니다.");
        this.owner = owner;
        this.serial = serial;
    }

    @Override
    public void use() {
        System.out.println(this + "을 사용합니다.");
    }

    @Override
    public String toString() {
        return "[IDCard:" + owner + ", serial:" + serial + "]";

    }

    public String getOwner() {
        return owner;
    }
}
