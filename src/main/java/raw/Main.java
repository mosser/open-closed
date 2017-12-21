package raw;

import raw.strategies.Complex;
import raw.strategies.Naive;
import raw.strategies.Strategy;

public class Main {


    // mvn -q exec:java -Dexec.mainClass="raw.Main" -Dexec.args="Naive"
    public static void main(String[] args) {

        if (args.length == 0)
            throw new IllegalArgumentException("No arguments given!");

        Strategy strat;

        String keyword = args[0];
        switch(keyword) {
            case "Naive":
                strat = new Naive();
                break;
            case "Complex":
                strat = new Complex();
                break;
            default:
                throw new IllegalArgumentException("Unknown method ["+ keyword+"]");
        }

        strat.apply();

    }

}
