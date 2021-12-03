package pl.imiajd.goralski;

import java.time.LocalDate;

public class Pracownik extends Osoba
{
    public Pracownik(String nazwisko,String[] imiona, int rokUr, int miesiacUr, int dzienUr, boolean plec, double pobory)
    {
        super(nazwisko, imiona, rokUr, miesiacUr, dzienUr, plec);
        this.pobory = pobory;
        dataZatrudnienia = dataZatrudnienia.now();
    }
    public Pracownik(String nazwisko,String[] imiona, int rokUr, int miesiacUr, int dzienUr, boolean plec, int rokZat, int miesiacZat, int dzienZat, double pobory)
    {
        super(nazwisko, imiona, rokUr, miesiacUr, dzienUr, plec);
        this.pobory = pobory;
        dataZatrudnienia = dataZatrudnienia.of(rokZat,miesiacZat,dzienZat);
    }

    public double getPobory()
    {
        return pobory;
    }
    public LocalDate getDataZatrudnienia()
    {
        return dataZatrudnienia;
    }

    public String getOpis()
    {
        return "pracownik z pensją "+pobory+" zł zatrudniony "+dataZatrudnienia;
    }

    private double pobory;
    private LocalDate dataZatrudnienia;
}