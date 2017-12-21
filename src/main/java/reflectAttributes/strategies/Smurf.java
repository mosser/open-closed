package reflectAttributes.strategies;


public class Smurf implements Strategy {

    @Override public void apply() {
        System.out.println("A very naive strategy");
    }

    @Override public String getName() { return "Naive"; }

}
