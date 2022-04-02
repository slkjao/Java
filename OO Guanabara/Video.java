
public class Video implements AcoesVideo{
	private String titulo;
	private int avaliacao;
	private int vizualizacao;
	private int curtidas;
	private boolean reproduzindo;
	
	
	
	
	public Video(String titulo) {
		this.titulo = titulo;
		this.avaliacao = 0;
		this.vizualizacao = 0;
		this.curtidas = 0;
		this.reproduzindo = false;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		this.reproduzindo = true;
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		this.reproduzindo = false;
	}

	@Override
	public void like() {
		// TODO Auto-generated method stub
		this.curtidas++;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(int avaliacao) {
		int nota;
		nota = (int) ((this.avaliacao + avaliacao) / this.vizualizacao);
		this.avaliacao = nota;
	}

	public int getVizualizacao() {
		return vizualizacao;
	}

	public void setVizualizacao(int vizualizacao) {
		this.vizualizacao = vizualizacao;
	}

	public int getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}

	public boolean isReproduzindo() {
		return reproduzindo;
	}

	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}

	@Override
	public String toString() {
		return "Video [titulo=" + titulo + ", avaliacao=" + avaliacao + ", vizualizacao=" + vizualizacao + ", curtidas="
				+ curtidas + ", reproduzindo=" + reproduzindo + "]";
	}

	

}
