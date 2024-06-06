package fisherman;



public abstract class BalikTutmaEkipmani implements Ekipman {
	
	private String adi;
	private int kapasiteKG;
	
	public abstract String balikTut();
	
	public String getAdi() {
		return adi;
	}
	
	public void setAdi(String adi) {
		this.adi = adi;
	}
	
	public int getKapasiteKG() {
		return kapasiteKG;
	}
	
	public void setKapasiteKG(int kapasiteKG) {
		this.kapasiteKG = kapasiteKG;
	}
}
