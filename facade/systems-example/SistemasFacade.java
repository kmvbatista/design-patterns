public class SistemasFacade {
  private SistemaDeAudio audio = new SistemaDeAudio();
	private SistemaDeInput input = new SistemaDeInput();
  private SistemaDeVideo video = new SistemaDeVideo();
  
  public void inicializarSubsistemas() {
    audio.configurarCanais();
    input.configurarJoystick();
    input.configurarTeclado();
    video.configurarCores();
    video.configurarResolucao();
  }
  public void reproduzirAudio(String fileName) {
    audio.reproduzirAudio(fileName);
  }
  public void lerInput() {
    input.lerInput();
  }
  public void renderizarImagem(String fileName) {
    video.renderizarImagem(fileName);
  }
}
