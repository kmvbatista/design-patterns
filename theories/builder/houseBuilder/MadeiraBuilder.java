package houseBuilder;

public class MadeiraBuilder extends CasaBuilder {
  @Override
  public void construir() {
    super.construir("Baras de Madeira", "Blocos de Madeira", "Telhado de Madeira", "Lareira");
  }
}
