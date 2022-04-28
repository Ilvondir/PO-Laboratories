package Ex1;

public class Main {
    public static void main(String[] args) {

        Punkt p1 = new Punkt();
        Punkt p2 = new Punkt(-1, 3);
        Punkt p3 = new Punkt(-0.8, 1.45);

        p1.opis();
        p1.przesun(1.2,2.1);
        p1.opis();

        Figura fig = new Figura("Czerwony");
        Prostokat pros1 = new Prostokat(10, 5);
        Trojkat tr1 = new Trojkat(9, 4);

        System.out.println(fig.opis());
        System.out.println("Pole prostokata pros1: " + pros1.getPowierzchnia());

        Prostokat pros2 = new Prostokat(p2, 4, 5);
        pros2.przesun(3,5);

        Kwadrat kw1 = new Kwadrat(5,"Czarny");

        Okrag okr1 = new Okrag(new Punkt(3.4,5.1), 10);

        System.out.println("\n\nOpisy:");
        p1.opis();
        System.out.println(fig.opis());
        System.out.println(pros2.opis());
        System.out.println(tr1.opis());
        System.out.println(okr1.opis());

        System.out.println("\nTestowanie metod okregu: ");
        System.out.println("Czy Punkt p2=(-1,3) nalezy do tego okregu?");
        System.out.println(okr1.wSrodku(p1));

        System.out.println("Powierzchnia: " + okr1.getPowierzchnia());
        System.out.println("Srednica: " + okr1.getSrednica());
    }
}
