import java.time.LocalDate;
import java.util.*;

public class main {
    public static void main(String[] args) {
        LinkedList<String> praco = new LinkedList<>();
        praco.add("Ola");
        praco.add("Ala");
        praco.add("Ela");
        praco.add("Ewa");
        praco.add("Ania");
        praco.add("Asia");
        praco.add("Kinga");
        praco.add("Kasia");
//        System.out.println(praco);
//        lab10.redukuj(praco, 3);
//        System.out.println(praco);

        lab10.odwroc(praco);
        System.out.println(praco);

        System.out.println(lab10.odwracanie("Ala ma kota. Jej kot lubi myszy."));
        lab10.cyfry(2015);
        lab10.Erastotenes(100);

        HashSet<LocalDate> daty = new HashSet<>();
        daty.add(LocalDate.of(2000,1,2));
        daty.add(LocalDate.of(2000,2,29));
        daty.add(LocalDate.of(2000,5,18));
        daty.add(LocalDate.of(2001,6,30));
        daty.add(LocalDate.of(1999,4,1));
        daty.add(LocalDate.of(2000,11,12));
        daty.add(LocalDate.of(1999,9,24));
        lab10.print(praco);
        lab10.print(daty);
    }

}
