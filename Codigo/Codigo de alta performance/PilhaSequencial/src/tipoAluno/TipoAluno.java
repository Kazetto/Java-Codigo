package tipoAluno;

public class TipoAluno {

	int rm;
	double media;
	public int getRm() {
		return rm;
	}
	
	public void setRm(int rm) {
		this.rm = rm;
	}
	
	public double getMedia() {
		return media;
	}
	
	public void setMedia(double media) {
		this.media = media;
	}
	
	public TipoAluno(int rm, double media) {
		super();
		this.rm = rm;
		this.media = media;
	}
	
}
