package Lab10;

public class Ex3 {
    public static void main() {
        Stos stosik = new Stos<Character>();
        stosik.push('B');
        stosik.push('a');
        stosik.push('l');
        System.out.println(stosik.pop());
        System.out.println(stosik.pop());
        System.out.println(stosik.pop());
        stosik.push('a');
        stosik.push('g');
        stosik.push('a');
        System.out.println(stosik.pop());
        System.out.println(stosik.pop());
        System.out.println(stosik.pop());
        stosik.push('n');
        System.out.println(stosik.pop());
        stosik.push('w');
        System.out.println(stosik.pop());
        stosik.push('l');
        stosik.push('i');
        stosik.push('t');
        System.out.println(stosik.pop());
        System.out.println(stosik.pop());
        System.out.println(stosik.pop());
        stosik.push('e');
        System.out.println(stosik.pop());
        stosik.push('r');
        stosik.push('k');
        System.out.println(stosik.pop());
        System.out.println(stosik.pop());
        stosik.push('a');
        stosik.push('c');
        stosik.push('h');
        System.out.println(stosik.pop());
        System.out.println(stosik.pop());
        System.out.println(stosik.pop());
    }
}
