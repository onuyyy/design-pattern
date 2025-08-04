package singleton.practice;

public class Main {
    public static void main(String[] args) {
        Triple triple = Triple.getInstance("ALPHA");
        Triple triple2 = Triple.getInstance("BETA");
        Triple triple3 = Triple.getInstance("GAMMA");

        System.out.println(triple.toString());
        System.out.println(triple.toString());
        System.out.println(triple2.toString());
        System.out.println(triple3.toString());
    }
}
