package Ex1;

public class Punkt {
    public double x, y;

    public Punkt() {
        this.x = 0;
        this.y = 0;
    }

    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void zeruj() {
        this.x = 0;
        this.y = 0;
    }

    public void opis() {
        System.out.println("Punkt o wspolrzednych: x: " + this.x + ", y: " + this. y);
    }

    public void przesun(double x, double y) {
        this.x += x;
        this.y += y;
    }
}
