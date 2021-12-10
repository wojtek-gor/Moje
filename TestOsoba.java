import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestOsoba {
    public static void main(String[] args)
    {
        ArrayList<Osoba> grupa = new ArrayList<Osoba>();
        grupa.add(new Osoba("Kowal",1985,10,5));
        grupa.add(new Osoba("Kolar",1989,10,5));
        grupa.add(new Osoba("Akod",1967,10,5));
        grupa.add(new Osoba("Kjyhdfcv",1989,10,5));
        grupa.add(new Osoba("Kowal",1912,6,5));
        grupa.forEach(x -> System.out.println(x));
        Collections.sort(grupa);
        System.out.println();
        grupa.forEach(x -> System.out.println(x));

    }
}
