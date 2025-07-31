package template_method;

public abstract class AbstractDisplay {
    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }

    public abstract void print();
    public abstract void close();
    public abstract void open();
}
