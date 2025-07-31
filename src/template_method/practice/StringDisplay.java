package template_method.practice;

public class StringDisplay implements AbstractDisplay2 {
    private String string;
    private int width;

    public StringDisplay(String string) {
        this.string = string;
        this.width = string.length();
    }

    public void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
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
        System.out.println("|" + this.string + "|");
    }

    @Override
    public void close() {
        printLine();
    }

    @Override
    public void open() {
        printLine();
    }
}
