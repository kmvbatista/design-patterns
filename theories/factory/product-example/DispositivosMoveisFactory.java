public class DispositivosMoveisFactory implements ProdutoFactory{
  private String type;

  public DispositivosMoveisFactory(String type) {
    this.type=type;
  }
  
  public Produto criar() {
    switch (type) {
      case "Tablet":
        return new Tablet();
      case "Servidor":
        return new Celular();
      default:
        return null;
    }
  }
}
