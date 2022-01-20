import java.util.BitSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class lab10 {
    public static <T> void redukuj(LinkedList<T> pracownicy, int n) {
        for (int i = n - 1; i < pracownicy.size(); i += n - 1) {
            pracownicy.remove(i);
        }
    }

    public static <T> void odwroc(LinkedList<T> lista){
        LinkedList<T> temp= new LinkedList<>(lista);
        for(int i=lista.size()-1,j=0;i>=0;i--,j++){
            lista.set(j,temp.get(i));
        }
    }

    public static String odwracanie(String zdanie){
        String[] text = zdanie.split(" ");
        Stack<String> neww = new Stack<>();
        StringBuilder odwrocone= new StringBuilder();
        for(String slowo: text){
            neww.push(slowo);
            if(slowo.endsWith(".")){
                while(!neww.empty()){
                    StringBuilder slowoOdwrocone = new StringBuilder();
                    slowoOdwrocone.append(neww.pop());
                    if(neww.empty()){
                        slowoOdwrocone.setCharAt(0,Character.toLowerCase(slowoOdwrocone.charAt(0)));
                        odwrocone.append(slowoOdwrocone);
                        odwrocone.append(". ");
                    }
                    else if(slowoOdwrocone.toString().equals(slowo)){
                        slowoOdwrocone.setCharAt(0,Character.toUpperCase(slowoOdwrocone.charAt(0)));
                        odwrocone.append(slowoOdwrocone, 0, slowoOdwrocone.length()-1);
                        odwrocone.append(" ");
                    }
                    else{
                        odwrocone.append(slowoOdwrocone);
                        odwrocone.append(" ");
                    }
                }
            }
        }
        return odwrocone.toString();
    }
    public static void cyfry(int liczba){
        Stack<Integer> cy = new Stack<>();
        while(liczba != 0){
            cy.push(liczba%10);
            liczba /= 10;
        }
        while (!cy.empty()){
            System.out.print(cy.pop()+" ");
        }
        System.out.println();
    }
    public static void Erastotenes(int n){
        BitSet b = new BitSet(n + 1);
        for (int j = 2; j <= n; ++j) {
            b.set(j);
        }
        int j = 2;
        while (j * j <= n) {
            if (b.get(j)) {
                int k = 2 * j;
                while (k <= n) {
                    b.clear(k);
                    k += j;
                }
            }
            ++j;
        }
        int[] primes= b.stream().toArray();
        for(int x: primes){
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static <T extends Iterable<?>> void print(T object ){
        Iterator<?> it= object.iterator();
        while (it.hasNext()){
            System.out.print(it.next());
            if (it.hasNext()){
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
