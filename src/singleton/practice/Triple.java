package singleton.practice;

import java.util.HashMap;
import java.util.Map;

public class Triple {
    private String name;
    private static final Map<String,Triple> instances = new HashMap<>();

    private static final Triple ALPHA =  new Triple("ALPHA");
    private static final Triple BETA =  new Triple("BETA");
    private static final Triple GAMMA =  new Triple("GAMMA");

    static {
        instances.put("ALPHA", ALPHA);
        instances.put("BETA", BETA);
        instances.put("GAMMA", GAMMA);
    }

    private Triple(String name) {
        this.name = name;
    }

    public static Triple getInstance(String name) {
        Triple triple = instances.get(name);

        if (triple == null) {
            throw new RuntimeException(name + "은 지원하지 않는 이름입니다.");
        }

        return triple;
    }

}
