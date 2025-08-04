package singleton;

public enum SingletonEnum {
    INSTANCE;

    // 예시: 필드와 메서드 추가 가능
    private String name = "default";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
