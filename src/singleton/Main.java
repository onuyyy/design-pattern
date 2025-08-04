package singleton;

/*
    인스턴스가 하나만 존재하는 것을 보증하는 패턴을 싱글턴 패턴이라고 한다.
    인스턴스가 여러 개 존재하면 인스턴스가 서로 영향을 미쳐 뜻밖의 버그를 일으킨다
    인스턴스가 하나 뿐이라는 보장이 있다면 그 전제 조건 하에 프로그래밍 가능
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("start");

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        if (singleton1 == singleton2) {
            System.out.println("singleton equal");
        } else  {
            System.out.println("singleton not equal");
        }

        SingletonEnum singleton = SingletonEnum.INSTANCE;
        singleton.setName("test");

        System.out.println(singleton.getName()); // "test"

        SingletonEnum other = SingletonEnum.INSTANCE;
        System.out.println(other.getName()); // "test" (같은 인스턴스)
    }
}
