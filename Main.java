package pl.edu.uwm.obiektowe.s151629.kolo1;


public class Main {
    public static void main(String[] args){
        Osoba wojtek = new Osoba("Wojtek", "Góralski", 1998,4,10);
        System.out.println(wojtek.Wiek());
        System.out.println(wojtek.toString());
        Pracownik marek = new Pracownik("Marek","Miał", 1975,4,5,
                "kowal", 3500.40);
        System.out.println(marek.toString());

    }
}
