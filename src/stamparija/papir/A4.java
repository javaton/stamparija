package stamparija.papir;

import java.util.ArrayList;
import java.util.List;

import stamparija.Stampa;

public class A4 extends Papir implements Stampa {

	public A4(String gramaza, String sadrzaj) {
		super(gramaza, sadrzaj);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void prikaziNaEkranu() {
		System.out.println(getSadrzaj());		
	}
	
	@Override
	public List<String> pripremiZaStampu() {
		List<String> lista = new ArrayList<>();
		lista.add(getSadrzaj());
		return lista;
	}

}
