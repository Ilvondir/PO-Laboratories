package Lab8;

class NieprawidlowyAdresException extends Exception {
    public NieprawidlowyAdresException(String message) {
        super(message);
    }
}

public class Adres {
    String ulica, miasto, kodPocztowy;
    int numerDomu;

    public Adres(String ulica, String miasto, String kodPocztowy, int numerDomu) throws NieprawidlowyAdresException {
        boolean ulicaException = false, miastoException = false, kodPocztowyException = false, numerDomuException = false;
        String message = "";
        this.ulica = ulica;
        if (ulica==null) ulicaException = true;
        this.miasto = miasto;
        if (miasto==null) miastoException = true;
        this.kodPocztowy = kodPocztowy;
        if (kodPocztowy==null) kodPocztowyException = true;
        this.numerDomu = numerDomu;
        if (numerDomu<0) numerDomuException = true;

        if (ulicaException) message += "Ulica nie moze byc nullem. ";
        if (miastoException) message += "Miasto nie moze byc nullem. ";
        if (kodPocztowyException) message += "Kod pocztowy nie moze byc nullem. ";
        if (numerDomuException) message += "Numer domu nie moze byc ujemny.";

        if (ulicaException || miastoException || kodPocztowyException || numerDomuException) throw new NieprawidlowyAdresException(message);

    }
}
