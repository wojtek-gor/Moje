package pl.edu.uwm.obiektowe.s151629.kolo1;

public class Zawodnik{
    Zawodnik(String pesel, String imie, String nazwisko){
        this.pesel=pesel;
        this.imie=imie;
        this.nazwisko=nazwisko;
        punkty=0;
    }
    public String getPesel(){
        return pesel;
    }
    public String getImie(){
        return imie;
    }
    public String getNazwisko(){
        return nazwisko;
    }
    public int getPunkty(){
        return punkty;
    }
    public void setPesel(String nowyPesel){
        pesel=nowyPesel;
    }
    public void setImie(String noweImie){
        imie=noweImie;
    }
    public void setNazwisko(String noweNazwisko){
        nazwisko=noweNazwisko;
    }
    public void dodajPunkty(int p){
        if(punkty>=0)
            punkty+=p;
    }
    public String toString(){
        return "Zawodnik "+imie+" "+nazwisko+" posiada "+punkty+" punktów.";
    }
    private String pesel;
    private String imie;
    private String nazwisko;
    private int punkty;
}
