package pl.imiajd.goralski;
public class TestOsoba
{
    public static void main(String[] args)
    {
        Osoba[] ludzie = new Osoba[2];

        ludzie[0] = new Pracownik("Kowalski", new String[]{"Jan"},1991,1,12,true, 50000);
        ludzie[1] = new Student("Nowak", new String[]{"Małgorzata"},2000,12,1,false,"informatyka", 3.15);
        // ludzie[2] = new Osoba("Dyl Sowizdrzał");

        for (Osoba p : ludzie) {
            System.out.println(p.getNazwisko() + ": " + p.getOpis());
        }

    }
}




