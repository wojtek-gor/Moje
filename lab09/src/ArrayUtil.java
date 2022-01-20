import java.util.ArrayList;
import java.util.Collections;

public class ArrayUtil {
    public static <T extends Comparable<? super T>> boolean isSorted(ArrayList<T> tab){
        ArrayList<T> temp= new ArrayList<>(tab);
        Collections.sort(temp);
        return tab.equals(temp);
    }

    public static <T extends Comparable<? super T>> void selectionSort(ArrayList<T> tab){
        int max;
        T temp;
        for (int i = tab.size()-1; i >= 0 ; i--)
        {
            max = 0;
            for (int j = 0; j <= i; j++)
            {
                if (tab.get(max).compareTo(tab.get(j)) < 0)
                {
                    max = j;
                }
            }

            if (max != i)
            {
                temp=tab.get(i);
                tab.set(i, tab.get(max));
                tab.set(max, temp);}
        }
    }
    public static <T extends Comparable<? super T>> int binSearch(ArrayList<T> tab, T a){
        if(ArrayUtil.isSorted(tab)){
            int i = 0;
            int r = tab.size() - 1;
            while (i <= r) {
                int m = i + (r - i) / 2;
                if (tab.get(m).equals(a))
                    return m;
                if (tab.get(m).compareTo(a)<0)
                    i = m + 1;
                else
                    r = m - 1;
            }
        }
        return -1;
    }
    public static <T extends Comparable<? super T>>  void mergeSort(ArrayList<T> tab){
        if (tab.size() > 1) {
            ArrayList<T> left = new ArrayList<>();
            ArrayList<T> right = new ArrayList<>();
            boolean logicalSwitch = true;
            while (!tab.isEmpty()) {
                if (logicalSwitch) {
                    left.add(tab.remove(0));
                } else {
                    right.add(tab.remove(tab.size()/2));
                }
                logicalSwitch = !logicalSwitch;
            }
            mergeSort(left);
            mergeSort(right);
            while (!left.isEmpty() && !right.isEmpty()) {
                if(left.get(0).compareTo(right.get(0)) <= 0){
                    tab.add(left.remove(0));
                }
                else {
                    tab.add(right.remove(0));
                }
            }
            if(!left.isEmpty()){
                tab.addAll(left);
            }
            else if (right.isEmpty() == false){
                tab.addAll(right);
            }
        }
    }
}

//  !x x == false