package pl.edu.uwm.obiektowe.s151629.kolo1;


import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;

public class Osoba {
    Osoba(String imie,String nazwisko,int rokUrodzenia, int miesiacUrodzenia, int dzienUrodzenia){
        this.imie=imie;
        this.nazwisko=nazwisko;
        dataUrodzenia = LocalDate.of(rokUrodzenia,miesiacUrodzenia,dzienUrodzenia);
        obWiek();
    }
    private void obWiek(){
        wiek=LocalDate.now().compareTo(dataUrodzenia);
    }
    public String Imie(){
        return imie;
    }
    public String Nazwisko(){
        return nazwisko;
    }
    public LocalDate DataUrodzenia(){
        return dataUrodzenia;
    }
    public int Wiek(){
        return LocalDate.now().compareTo(dataUrodzenia);
    }
    void noweImie(String imie){
        this.imie=imie;
    }
    void noweNazwisko(String nazwisko){
        this.nazwisko=nazwisko;
    }
    void nowaDataUrodzenia(int rokUrodzenia, int miesiacUrodzenia, int dzienUrodzenia){
        LocalDate nowa = LocalDate.of(rokUrodzenia,miesiacUrodzenia,dzienUrodzenia);
        if(LocalDate.now().compareTo(nowa)<0)
        {
            System.out.println("Blad, podano niepoprawne dane.");
            return;
        }
        dataUrodzenia = nowa;
    }
    public String toString(){
        return "Osoba "+ imie +" "+nazwisko+" urodzona "+dataUrodzenia+", wiek "+ wiek;
    }
    private String imie;
    private String nazwisko;
    private LocalDate dataUrodzenia;
    private int wiek;

}
