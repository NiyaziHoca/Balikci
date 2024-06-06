package fisherman;

public class Olta extends BalikTutmaEkipmani {

	public Olta() {
		super.setAdi("olta");
		super.setKapasiteKG(3);
	}
	@Override
	public String kullan() {
		return "Olta kullanılacak";
	}

	@Override
	public String balikTut() {
		return "Olta ile balık tutuluyor";
	}

}
