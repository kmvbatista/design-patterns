package pizzaBuilder;

public abstract class PizzaBuilder {
  protected void construir(String cobertura, String massa, String molho) {
    Pizza pizza = new Pizza();
    pizza.setCobertura(cobertura);
    pizza.setMassa(massa);
    pizza.setMolho(molho);
    this.setPizza(pizza);
  }

  public void construir() {
    
  }

  private Pizza pizza;

  public Pizza getPizza() {
    return pizza;
  }
  public void setPizza(Pizza pizza) {
    this.pizza = pizza;
  }
}
