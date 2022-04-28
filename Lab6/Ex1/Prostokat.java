package Ex1;

class Prostokat extends Figura {
	double wys=0, szer=0;
	
	Prostokat(double wys,double szer) {
		this.wys = wys;
		this.szer = szer;
	}

	Prostokat(String kolor, float wys, float szer) {
		super(kolor);
		this.wys = wys;
		this.szer = szer;
	}

	public Prostokat(Punkt punkt, double wys, double szer) {
		super(punkt);
		this.wys = wys;
		this.szer = szer;
	}

	public Prostokat(String kolor) {
		super(kolor);
		this.wys = 0;
		this.szer = 0;
	}

	double getPowierzchnia() {
        return (szer * wys);
    }

	void przesun(float x, float y) {
		System.out.println("Wspolrzedne wierzcholkow prostokata przed przesunieciem: ");
		System.out.print("(" + this.punkt.x + "," + this.punkt.y + ") ");
		System.out.print("(" + (this.punkt.x + this.szer) + "," + this.punkt.y + ") ");
		System.out.print("(" + (this.punkt.x + this.szer) + "," + (this.punkt.y + this.wys) + ") ");
		System.out.print("(" + this.punkt.x + "," + (this.punkt.y + this.wys) + ") ");

		System.out.println("\nWspolrzedne wierzcholkow prostokata po przesunieciu: ");
		System.out.print("(" + (x + this.punkt.x) + "," + (y + this.punkt.y) + ") ");
		System.out.print("(" + (this.punkt.x + this.szer + x) + "," + (this.punkt.y + y) + ") ");
		System.out.print("(" + (this.punkt.x + this.szer + x) + "," + (this.punkt.y + this.wys + y) + ") ");
		System.out.print("(" + (this.punkt.x + x) + "," + (this.punkt.y + this.wys + y) + ") ");
	}

	public String opis() {
		return "Klasa Prostokat. Kolor obiektu: " + kolor;
	}
}