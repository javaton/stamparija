package stamparija;

public class Stampac {

	private Integer brojKopija;

	public Stampac(Integer brojKopija) {
		super();
		this.brojKopija = brojKopija;
	}
	
	public void stampaj(Stampa stampa) {
		if(brojKopija > 0) {
			for(String s : stampa.pripremiZaStampu()) {
			brojKopija = brojKopija - 1; //brojkopija--;
			System.out.println("Izlaz na stampac: " + s);
			}
		} else {
			System.out.println("Nema Papira!!!");
		}	
	}
	
	public void stampaj(Stampa stampa, Integer broj) {
		for(int i = 0; i < broj; i++) {
			stampaj(stampa);
		}
	}
	
	
	public void stampajNaEkranu(Prikazi prikazi) {
		System.out.println("Stampa na ekranu: ");
		prikazi.prikaziNaEkranu();
	}
	
	public Integer getBrojKopija() {
		return brojKopija;
	}

	public void setBrojKopija(Integer brojKopija) {
		this.brojKopija = brojKopija;
	}
}
