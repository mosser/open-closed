package binding.strategies;

import java.util.HashMap;
import java.util.Map;

public class Binding {


    private Map<String, Strategy> strategies = new HashMap<>();

    public Binding() {
        strategies.put("Naive", new Naive());
        strategies.put("Complex", new Complex());
    }

    public Strategy get(String stratName) {
        return strategies.get(stratName);
    }

}
