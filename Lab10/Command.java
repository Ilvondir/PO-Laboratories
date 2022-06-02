package Lab10;

public class Command {
    String napis;

    public Command(String napis) {
        this.napis = napis;
    }

    public void operation() {
        System.out.println(this.napis);
    }
}