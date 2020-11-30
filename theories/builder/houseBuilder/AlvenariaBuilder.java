package houseBuilder;

public class AlvenariaBuilder extends CasaBuilder {
  @Override
  public void construir() {
    super.construir("Baras de Ferro", "Blocos de Cimento", "Telhado de Barro", "Churrasqueira");
  }
}
