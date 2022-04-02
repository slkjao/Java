
public class Visualizacao {
	private Gafanhoto usuario;
	private Video video;
	
	
	public Visualizacao(Gafanhoto usuario, Video video) {
		super();
		this.usuario = usuario;
		this.video = video;
		this.usuario.setTotAssistido(this.usuario.getTotAssistido() + 1);
		this.video.setVizualizacao(this.video.getVizualizacao() + 1);
	}
	
	public void avaliar() {
		video.setAvaliacao(5);
	}
	
	public void avaliar(int nota) {
		video.setAvaliacao(nota);
	}
	
	public void avaliar(float porc) {
		int tot=0;
		if(porc < 20) {
			tot = 3;
		} else if (porc <= 50) {
			tot = 5;
		} else if (porc <= 80) {
			tot = 8;
		} else {
			tot = 10;
		}
		
		video.setAvaliacao(tot);
	}


	public Gafanhoto getUsuario() {
		return usuario;
	}


	public void setUsuario(Gafanhoto usuario) {
		this.usuario = usuario;
	}


	public Video getVideo() {
		return video;
	}


	public void setVideo(Video video) {
		this.video = video;
	}


	@Override
	public String toString() {
		return "Visualizacao [usuario=" + usuario + ", video=" + video + "]";
	}
	
	
	
}
