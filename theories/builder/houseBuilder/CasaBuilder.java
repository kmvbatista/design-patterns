package houseBuilder;

public abstract class CasaBuilder {
  private Casa casa;
  protected void construir(String alicerce, String estrutura, String telhado, String interior) {
    Casa novaCasa = new Casa();
    novaCasa.setAlicerce(alicerce);
    novaCasa.setEstrutura(estrutura);
    novaCasa.setInterior(interior);
    novaCasa.setTelhado(telhado);
    this.casa = novaCasa;
  }

  public void construir() {
  }

  public Casa getCasa() {
    return casa;
  }
  public void setCasa(Casa casa) {
    this.casa = casa;
  }
}
