public class ComputadorFactory implements ProdutoFactory {
  private String type;
  private String memory;
  private String hd;
  private String cpu;

  public ComputadorFactory(String type, String memory, String hd, String cpu) {
    this.type=type;
    this.memory = memory;
    this.hd = hd;
    this.cpu = cpu;
  }

  public Computador criar() {
    switch (type) {
      case "PCGamer":
        return new PCGamer(memory, hd, cpu);
      case "Servidor":
        return new Servidor(memory, hd, cpu);
      case "Notebook":
        return new Notebook(memory, hd, cpu);
      default:
        return null;
    }
  }
}
