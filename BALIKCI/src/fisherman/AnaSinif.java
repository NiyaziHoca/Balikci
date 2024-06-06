package fisherman;

public class AnaSinif {

	public static void main(String[] args) {
		Tekne tekne=new Tekne("Nemo","Gırgır");
		
		Liman lm=new Liman("Bartın Limanı");
		
		Balikci b1=new Balikci("Temel Reis",lm,tekne);
		
		System.out.println("Tekne Adı: "+b1.getTekne().getAdi()+"\nKaptan: "+
		b1.getAdi()+"\nTekne Tipi: "+b1.getTekne().getTipi()+
		"\nLiman: "+b1.getLiman().getAdi());

	}

}
