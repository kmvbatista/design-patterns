package pizzaBuilder;


public class Garcom {
  private PizzaBuilder pizzaBuilder;
  public void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
    this.pizzaBuilder = pizzaBuilder;
  }
  public void construirPizza() {
    pizzaBuilder.construir();
  }
}
