package reflectAttributes.strategies;

import staticBinding.Main;

import java.io.File;

public class Binding {

    public static Strategy get(String stratName) {
        try {
            File thePackage =
                    new File(Main.class.getClassLoader().getResource("reflectAttributes/strategies").toURI());

            for(String cl: thePackage.list( ((dir, name) ->  name.endsWith(".class")))) {
                Class clazz = Class.forName("reflectAttributes.strategies."+cl.split("\\.")[0]);
                if(Strategy.class.isAssignableFrom(clazz)) {
                    Strategy candidate = (Strategy) clazz.newInstance();
                    if (candidate.getName().equals(stratName))
                        return candidate;
                }
            }
        } catch(Exception e) {
            System.err.println(e);
        }
        return null;
    }

}
