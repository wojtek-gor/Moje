package pl.imiajd.goralski;
import java.time.LocalDate;

public abstract class Osoba
{
    public Osoba(String nazwisko, String [] imiona, int rokUr, int miesiacUr, int dzienUr, boolean plec)
    {
        this.nazwisko = nazwisko;
        this.imiona = imiona;
        dataUrodzenia=dataUrodzenia.of(rokUr,miesiacUr,dzienUr);
        this.plec = plec;

    }

    public abstract String getOpis();

    public String getNazwisko()
    {
        return nazwisko;
    }
    public String [] getImiona()
    {
        return imiona;
    }
    public LocalDate getDataUrodzenia()
    {
        return dataUrodzenia;
    }
    public boolean getPlec()
    {
        return plec;
    }

    private String nazwisko;
    private String [] imiona;
    private LocalDate dataUrodzenia;
    private boolean plec;
}
