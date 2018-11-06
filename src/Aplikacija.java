import stamparija.Stampac;
import stamparija.papir.A0;
import stamparija.papir.A4;

public class Aplikacija {

	public static void main(String[] args) {
		Stampac stampac = new Stampac(5);
		
		A4 a4 = new A4("15 g", "Zadatak za stampu.");
		A0 a0 = new A0("20 g", "Probaj da me odstampas!!!"); 
						
		stampac.stampaj(a4);
		stampac.stampaj(a0);
		stampac.stampaj(a4);
		stampac.stampaj(a4, 4);
//		stampac.stampaj(a0); - ne moze zbog interfejsa koji implementira
		
		stampac.stampajNaEkranu(a4);
		stampac.stampajNaEkranu(a0);
	}

}
