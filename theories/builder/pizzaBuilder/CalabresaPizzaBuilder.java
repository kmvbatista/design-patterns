package pizzaBuilder;

public class CalabresaPizzaBuilder extends PizzaBuilder {
    @Override
    public void construir() {
        super.construir("calabresa", "tradicional", "tomate");
    }
}
