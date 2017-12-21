package binding;

import binding.strategies.*;

public class Main {


    // mvn -q exec:java -Dexec.mainClass="maps.Main" -Dexec.args="Naive"
    public static void main(String[] args) {

        if (args.length == 0)
            throw new IllegalArgumentException("No arguments given!");


        Binding availableStrategies = new Binding();
        String keyword = args[0];
        Strategy strat = availableStrategies.get(keyword);

        strat.apply();

    }

}
