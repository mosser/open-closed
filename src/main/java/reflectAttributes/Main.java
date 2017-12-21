package reflectAttributes;

import reflectAttributes.strategies.Binding;
import reflectAttributes.strategies.Strategy;


public class Main {

    // mvn -q exec:java -Dexec.mainClass="reflectAttributes.Main" -Dexec.args="Naive"
    public static void main(String[] args) throws Exception {

        if (args.length == 0)
            throw new IllegalArgumentException("No arguments given!");

        String keyword = args[0];

        Strategy strat = Binding.get(keyword);
        strat.apply();
    }

}
