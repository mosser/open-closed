package staticBinding.strategies;

public class Complex implements Strategy {

    static {
        System.out.println("  ## Registering Complex");
        Binding.strategies.put("Complex", new Complex());
    }

    @Override public void apply() {
        System.out.println("A very complex strategy");
    }
    
}
