package reflection;

import reflection.strategies.Strategy;


public class Main {

    // mvn -q exec:java -Dexec.mainClass="reflection.Main" -Dexec.args="Naive"
    public static void main(String[] args) throws Exception {

        if (args.length == 0)
            throw new IllegalArgumentException("No arguments given!");

        String keyword = args[0];

        Strategy strat = (Strategy) Class.forName("reflection.strategies." + keyword).newInstance();
        strat.apply();
    }

}
