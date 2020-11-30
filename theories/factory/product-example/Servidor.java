
public class Servidor extends Computador {

	public Servidor(String ram, String hdd, String cpu){
		this.ram=ram;
		this.hd=hdd;
		this.cpu=cpu;
	}
	@Override
	public String getInfo() {
		return "Servior: RAM= "+this.ram +", HDD="+this.hd+", CPU="+this.cpu;
	}
}
