package Lab5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Budynek {
    String nazwa;
    LocalDate rokBudowy;
    int liczbaPieter;
    LocalDate teraz = LocalDate.now();

    public Budynek() {}

    public Budynek(String nazwa, LocalDate rokBudowy, int liczbaPieter) {
        this.nazwa = nazwa;
        this.rokBudowy = rokBudowy;
        this.liczbaPieter = liczbaPieter;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setRokBudowy(LocalDate rokBudowy) {
        this.rokBudowy = rokBudowy;
    }

    public void setLiczbaPieter(int liczbaPieter) {
        this.liczbaPieter = liczbaPieter;
    }

    public void dane() {
        System.out.println(this.nazwa);
        System.out.println("Data budowy: " + this.rokBudowy);
        System.out.println("Liczba pieter: " + this.liczbaPieter);
    }

    public long zakresCzasu() {
        return ChronoUnit.YEARS.between(this.rokBudowy, this.teraz);
    }

}