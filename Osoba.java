import java.time.LocalDate;
import java.lang.*;
import java.util.Objects;

public class Osoba implements Cloneable, Comparable<Osoba>{
    Osoba(String nazwisko, int rokUrodzenia, int miesiacUrodzenia, int dzienUrodzenia){
        this.nazwosko=nazwisko;
        dataUrodzenia=dataUrodzenia.of(rokUrodzenia,miesiacUrodzenia,dzienUrodzenia);
    }
    @Override
    public String toString()
    {
        return getClass().getName()+" [ "+nazwosko+" "+dataUrodzenia+" ]";
    }
    @Override
    public int compareTo(Osoba obiekt)
    {
        if(this.nazwosko.compareTo(obiekt.nazwosko)==0)
        {
            if(this.dataUrodzenia.equals(obiekt.dataUrodzenia))
                return 0;
            else
                return this.dataUrodzenia.compareTo(obiekt.dataUrodzenia);
        }
        return this.nazwosko.compareTo(obiekt.nazwosko);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Osoba osoba = (Osoba) o;
        return Objects.equals(nazwosko, osoba.nazwosko) &&
                Objects.equals(dataUrodzenia, osoba.dataUrodzenia);
    }

    public String getNazwosko() {
        return nazwosko;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    private String nazwosko;
    private LocalDate dataUrodzenia;
}
