package factory.framework;

public abstract class Factory {

    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    protected abstract void registerProduct(Product p);

    // 자식 factory가 어떤 걸 반환할지 결정하도록
    protected abstract Product createProduct(String owner);
}
