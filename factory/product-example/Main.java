
public class Main {

	public static void main(String[] args) {
		Produto produto;
		ProdutoFactory factory;
		
		factory = new ComputadorFactory("PCGamer","16 GB","250 GB SSD","2.4 GHz");
		produto = factory.criar();
		System.out.println(produto.getInfo());
		
		factory = new ComputadorFactory("Servidor","32 GB","3 TB","2.9 GHz");
		produto = factory.criar();
		System.out.println(produto.getInfo());
		
		factory = new ComputadorFactory("Notebook","8 GB","1 TB","2.5 GHz");
		produto = factory.criar();
		System.out.println(produto.getInfo());
		
		factory = new DispositivosMoveisFactory("Tablet");
		produto = factory.criar();
		System.out.println(produto.getInfo());
		
		factory = new DispositivosMoveisFactory("Celular");
		produto = factory.criar();
		System.out.println(produto.getInfo());
		
	}

}
