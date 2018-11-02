package stamparija;

public class Stampac {

	private Integer brojKopija;

	public Integer getBrojKopija() {
		return brojKopija;
	}

	public void setBrojKopija(Integer brojKopija) {
		this.brojKopija = brojKopija;
	}

	public Stampac(Integer brojKopija) {
		super();
		this.brojKopija = brojKopija;
	}
	
	public void stampaj(Stampa stampa) {
		if(brojKopija <= 0) {
			System.out.println("Nema papira!!!");
		} else {
			brojKopija--;
			System.out.println("Izlaz na stampac: " + stampa.pripremiZaStampu());
		}
	}
	
	public void stampaj(Stampa stampa, Integer kopije) {
		for(int i = 0; i < kopije; i++) {
			stampaj(stampa);
		}
	}
	
	public void stampajNaEkranu(Prikazi prikazi) {
		System.out.println("Ispis na ekranu: ");
		prikazi.prikaziNaEkranu();
	}
}
