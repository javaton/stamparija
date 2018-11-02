package stamparija.papir;

import stamparija.Prikazi;

public class A0 extends Papir implements Prikazi{

	public A0(String gramaza, String sadrzaj) {
		super(gramaza, sadrzaj);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void prikaziNaEkranu() {
		System.out.println(getSadrzaj());		
	}



}
