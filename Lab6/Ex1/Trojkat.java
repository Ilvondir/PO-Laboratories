package Ex1;

class Trojkat extends Figura {
	double wys = 0, podst = 0;

	Trojkat(double wys, double podst) {
		this.wys = wys;
		this.podst = podst;
	}

	Trojkat(String kolor, double wys, double podst) {
		super(kolor);
		this.wys = wys;
		this.podst = podst;
	}

	public String opis() {
		return "Klasa Trojkat. Kolor obiektu: " + kolor;
	}
}