package staticBinding.strategies;

import staticBinding.Main;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Binding {

    public static Map<String, Strategy> strategies;

    static {
        System.out.println("  ## Creating the Strategy binding");
        strategies = new HashMap<>();
        loadStrategies();
    }

    private static void loadStrategies() {
        try {
            File thePackage = new File(Main.class.getClassLoader().getResource("staticBinding/strategies").toURI());
            System.out.println("  ## Loading strategies dynamically");
            for(String cl: thePackage.list( ((dir, name) ->  name.endsWith(".class")))) {
                Class.forName("staticBinding.strategies."+cl.split("\\.")[0]);
            }
        } catch(Exception e) {
            System.err.println(e);
        }
    }


}
