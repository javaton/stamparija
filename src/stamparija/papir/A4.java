package stamparija.papir;

import stamparija.Prikazi;
import stamparija.Stampa;

public class A4 extends Papir implements Stampa, Prikazi {

	public A4(String gramaza, String sadrzaj) {
		super(gramaza, sadrzaj);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void prikaziNaEkranu() {
		System.out.println(getSadrzaj());		
	}
	
	public String pripremiZaStampu() {
		return getSadrzaj();
	}

}
