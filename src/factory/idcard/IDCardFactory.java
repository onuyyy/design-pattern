package factory.idcard;

import factory.framework.Factory;
import factory.framework.Product;

public class IDCardFactory extends Factory {
    private int serial = 1000;

    @Override
    protected void registerProduct(Product p) {
        System.out.println(p + "을 등록했습니다.");
        serial++;
    }

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner,  serial);
    }
}
