package houseBuilder;
public class Engenheiro {
  private CasaBuilder builder;

  public Engenheiro(CasaBuilder builder) {
    this.builder = builder;
  }

  public CasaBuilder getBuilder() {
	  return builder;
  }

  public void setBuilder(CasaBuilder builder) {
    this.builder = builder;
  }

  public void construirCasa() {
    this.builder.construir();
  }
}
