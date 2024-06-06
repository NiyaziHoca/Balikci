package fisherman;

public class Balikci {
	private String adi;
	private Liman liman;
	private Tekne tekne;
	private BalikTutmaEkipmani[] bte;
	
	public Balikci(String adi, Liman liman,Tekne tekne, BalikTutmaEkipmani[] bte) {
		this.adi=adi;
		this.liman=liman;
		this.tekne=tekne;
		this.setBte(bte);
	}// constructor sonu

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public Liman getLiman() {
		return this.liman;
	}

	public void setLiman(Liman liman) {
		this.liman = liman;
	}

	public Tekne getTekne() {
		return tekne;
	}

	public void setTekne(Tekne tekne) {
		this.tekne = tekne;
	}

	public BalikTutmaEkipmani[] getBte() {
		return bte;
	}

	public void setBte(BalikTutmaEkipmani[] bte) {
		this.bte = bte;
	}
	
	
	
}// class sonu
