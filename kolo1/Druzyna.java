package pl.edu.uwm.obiektowe.s151629.kolo1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Druzyna{
    Druzyna(String nazwa){
        this.nazwa=nazwa;
        dataUtworzenia=LocalDate.now();
    }
    Druzyna(String nazwa, int rokUtworzenia, int miesiacUtworzenia, int dzienUtworzenia){
        this.nazwa=nazwa;
        dataUtworzenia = LocalDate.of(rokUtworzenia,miesiacUtworzenia,dzienUtworzenia);
    }
    public void setNazwe(String nowaNazwa){
        nazwa=nowaNazwa;
    }
    public String getNazwa(){
        return nazwa;
    }
    public LocalDate getDataUtworzenia(){
        return dataUtworzenia;
    }
    public ArrayList getZawodnicy(){
        return zawodnicy;
    }
    public String toString(){
        return "Drużyna o nazwie "+nazwa+" utworzona dnia "+dataUtworzenia;
    }
    public boolean dodajZawodnika(Zawodnik z){
        for(int i=0;i<zawodnicy.size();i++){
            if(zawodnicy.get(i).getPesel().equals(z.getPesel())){
                System.out.println("Zawodnik o podanym peselu znajduje się już w drużynie.");
                return false;
            }
        }
        zawodnicy.add(z);
        System.out.println("Dodano zawodnika");
        return true;
    }
    public void usunZawodnika(int numer){
        zawodnicy.remove(numer-1);
        System.out.println("Usunięto zawodnika.");
    }
    public void usunZawodnika(Zawodnik z){
        int i=0;
        for(i=0;i<zawodnicy.size();i++){
            if(zawodnicy.get(i).getPesel() == z.getPesel()){
                zawodnicy.remove(i);
                System.out.println("Usunięto zawodnika.");
                return;
            }
        }
        System.out.println("Zawodnik nie znaleziony.");

    }
    public int getPunkty(){
        int suma=0;
        for(int i=0;i<zawodnicy.size();i++){
            suma +=zawodnicy.get(i).getPunkty();
        }
        return suma;
    }
    public void wypiszDruzyne(){
        System.out.println(toString());
        for(int i=0;i<zawodnicy.size();i++){
            System.out.println(i+1+". "+zawodnicy.get(i).getImie()+" "+zawodnicy.get(i).getNazwisko());
        }
        System.out.println("Ilość punktów drużyny: "+getPunkty());
    }
    private String nazwa;
    private LocalDate dataUtworzenia;
    private ArrayList<Zawodnik> zawodnicy = new ArrayList<Zawodnik>();
}
