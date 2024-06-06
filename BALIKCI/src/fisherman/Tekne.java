package fisherman;


public class Tekne {
	private String adi;
	private String tipi;
	
	public Tekne(String adi,String tipi) {
		this.adi=adi;
		this.tipi=tipi;//tipi: gırgır, trol,vb.
	}// constructor sonu

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getTipi() {
		return tipi;
	}

	public void setTipi(String tipi) {
		this.tipi = tipi;
	}
	
	

}// class sonu
