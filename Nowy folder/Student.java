package pl.imiajd.goralski;

public class Student extends Osoba
{
    public Student(String nazwisko,String[] imiona, int rokUr, int miesiacUr, int dzienUr, boolean plec, String kierunek, double sredniaOcena)
    {
        super(nazwisko, imiona, rokUr, miesiacUr, dzienUr, plec);
        this.kierunek = kierunek;
        this.sredniaOcena=sredniaOcena;
    }
    public double getSredniaOcena()
    {
        return sredniaOcena;
    }

    public String getOpis()
    {
        return "kierunek studiów: " + kierunek + " z średnią ocen "+sredniaOcena;
    }
    public void setSredniaOcena(double sredniaOcena)
    {
        this.sredniaOcena=sredniaOcena;
    }
    private String kierunek;
    private double sredniaOcena;
}