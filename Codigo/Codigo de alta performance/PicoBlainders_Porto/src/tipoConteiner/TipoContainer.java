package tipoConteiner;

public class TipoContainer {

	int iD ;
	int moveCont;
	
	public int getiD() {
		return iD;
	}
	public void setiD(int iD) {
		this.iD = iD;
	}
	public int getmoveCont() {
		return moveCont;
	}
	public void setmoveCont(int moveCont) {
		this.moveCont = moveCont;
	}
	public TipoContainer(int iD, int moveCont) {
		super();
		this.iD = iD;
		this.moveCont = moveCont;
	}
	
	@Override
	public String toString() {
		return "TipoContainer [iD=" + iD + ", moveCont=" + moveCont + "]";
	}
	
	
}
