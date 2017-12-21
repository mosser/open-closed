package reflectAttributes.strategies;

public class Dwarf implements Strategy {

    @Override public void apply() {
        System.out.println("A very complex strategy");
    }

    @Override public String getName() { return "Complex"; }

}
