package singleton;

public class Singleton {
    private static final Singleton singleton = new Singleton();

    Singleton() {
        System.out.println("인스턴스 생성");
    }

    public static Singleton getInstance() {
//        이렇게 하면 멀티스레드 환경에서 안전하지 않다
//        두 개의 스레드가 동시에 if 조건을 통과하면 new Singleton이 두 번 호출되어 인스턴스 두 개 생성
//        if (singleton == null) {
//            System.out.println("새로 생성합니다");
//            return singleton = new Singleton();
//        } else {
//            System.out.println("기존 인스턴스 반환합니다");
//            return singleton;
//        }
        return singleton;
    }

}
