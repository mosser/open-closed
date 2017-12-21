package raw.strategies;

public class Naive implements Strategy {

    @Override public void apply() {
        System.out.println("A very naive strategy");
    }

}
