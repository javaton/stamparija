package stamparija.papir;

public class Papir {

	private String gramaza;
	private String sadrzaj;
	
	
	
	public Papir(String gramaza, String sadrzaj) {
		super();
		this.gramaza = gramaza;
		this.sadrzaj = sadrzaj;
	}
	public String getGramaza() {
		return gramaza;
	}
	public void setGramaza(String gramaza) {
		this.gramaza = gramaza;
	}
	public String getSadrzaj() {
		return sadrzaj;
	}
	public void setSadrzaj(String sadrzaj) {
		this.sadrzaj = sadrzaj;
	}
	
	
	
}
