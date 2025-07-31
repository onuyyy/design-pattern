package template_method.practice;

public class CharDisplay implements AbstractDisplay2 {
    private char ch;

    public CharDisplay(char ch) {
        this.ch = ch;
    }

    @Override
    public void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }

    @Override
    public void print() {
        System.out.print(ch);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }

    @Override
    public void open() {
        System.out.print("<<");
    }
}
