package staticBinding.strategies;


public class Naive implements Strategy {

    static {
        System.out.println("  ## Registering Naive");
        Binding.strategies.put("Naive", new Naive());
    }


    @Override public void apply() {
        System.out.println("A very naive strategy");
    }

}
