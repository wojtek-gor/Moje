package pl.edu.uwm.obiektowe.s151629.kolo1;

public class Main {
    public static void przeniesZawodnika(Zawodnik za, Druzyna z, Druzyna d){
        if(d.dodajZawodnika(za)==true)
            z.usunZawodnika(za);
        else
            System.out.println("Błędne dane.");
    }
    public static void main(String[] args){
        Druzyna druzyna1 = new Druzyna("Makowa",2002,07,19);
        Druzyna druzyna2 = new Druzyna("Olsztn");
        Zawodnik z1 = new Zawodnik("122134566", "Wacek", "Miłek");
        Zawodnik z2 = new Zawodnik("125677434", "Wania", "Mania");
        Zawodnik z3 = new Zawodnik("122134554", "Ola", "Miłek");
        Zawodnik z4 = new Zawodnik("122145678", "Małrycy", "Moneta");
        Zawodnik z5 = new Zawodnik("122134566", "Michał", "Mały");
        druzyna1.dodajZawodnika(z1);
        druzyna1.dodajZawodnika(z2);
        druzyna2.dodajZawodnika(z3);
        druzyna1.dodajZawodnika(z4);
        druzyna2.dodajZawodnika(z4);
        druzyna2.dodajZawodnika(z5);
        druzyna1.wypiszDruzyne();
        druzyna2.wypiszDruzyne();
        druzyna1.usunZawodnika(3);
        druzyna2.usunZawodnika(z5);
        druzyna1.wypiszDruzyne();
        druzyna2.wypiszDruzyne();
        przeniesZawodnika(z4,druzyna2,druzyna1);
        druzyna1.wypiszDruzyne();
        druzyna2.wypiszDruzyne();
    }

}
