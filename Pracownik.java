package pl.edu.uwm.obiektowe.s151629.kolo1;
import java.text.DecimalFormat;

public class Pracownik extends Osoba{

    Pracownik(String imie, String nazwisko, int rokUrodzenia, int miesiacUrodzenia, int dzienUrodzenia) {
        super(imie, nazwisko, rokUrodzenia, miesiacUrodzenia, dzienUrodzenia);
    }
    Pracownik(String imie, String nazwisko, int rokUrodzenia, int miesiacUrodzenia, int dzienUrodzenia,
              String stanowisko, double pensja){
        super(imie, nazwisko, rokUrodzenia, miesiacUrodzenia, dzienUrodzenia);
        this.stanowisko=stanowisko;
        this.pensja=pensja;
    }
    public String toString(){
        DecimalFormat df = new DecimalFormat("0.00");
        return "Osoba "+ Imie() +" "+ Nazwisko() +" urodzona "+ DataUrodzenia() +", wiek "+ Wiek() +
                " jest pracownikiem na stanowisku " + stanowisko + " z pensją " + df.format(pensja) + " zł.";
    }
    String stanowisko;
    double pensja;
}
