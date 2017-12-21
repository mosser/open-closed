package staticBinding;

import staticBinding.strategies.Binding;
import staticBinding.strategies.Strategy;


public class Main {

    // mvn -q exec:java -Dexec.mainClass="staticBinding.Main" -Dexec.args="Naive"
    public static void main(String[] args) {

        if (args.length == 0)
            throw new IllegalArgumentException("No arguments given!");

        String keyword = args[0];
        Strategy strat = Binding.strategies.get(keyword);

        strat.apply();

    }

}
