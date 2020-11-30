package pizzaBuilder;

public class FrangoPizzaBuilder extends PizzaBuilder {
  @Override
  public void construir() {
    super.construir("frango", "com borda", "picante");
	}
}
