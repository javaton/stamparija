package stamparija.papir;

import java.util.ArrayList;
import java.util.List;

import stamparija.Prikazi;
import stamparija.Stampa;

public class A0 extends Papir implements Stampa{

	public A0(String gramaza, String sadrzaj) {
		super(gramaza, sadrzaj);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void prikaziNaEkranu() {
		System.out.println(getSadrzaj());		
	}

	@Override
	public List<String> pripremiZaStampu() {
		List<String> lista  = new ArrayList<>();
		lista.add(getSadrzaj().substring(0, getSadrzaj().length()/4));
		lista.add(getSadrzaj().substring(getSadrzaj().length()/4, getSadrzaj().length()/2));
		lista.add(getSadrzaj().substring(getSadrzaj().length()/2, getSadrzaj().length()));
		return lista;
	}



}
