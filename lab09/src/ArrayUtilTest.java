import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayList<LocalDate> data = new ArrayList<>();
        data.add(LocalDate.of(2021,12,20));
        data.add(LocalDate.of(2021,11,20));
        data.add(LocalDate.of(2021,12,21));
        System.out.println(ArrayUtil.isSorted(data));
        Collections.sort(data);
        System.out.println(ArrayUtil.isSorted(data));
        ArrayList<Integer> x = new ArrayList<>();
        x.add(3);
        x.add(8);
        x.add(1);
        x.add(6);
        x.add(2);
        x.add(4);
        x.add(5);
        x.add(8);
        x.add(5);
        System.out.println(ArrayUtil.isSorted(x));
        Collections.sort(x);
        System.out.println(ArrayUtil.isSorted(x)+"\n");
        System.out.println(ArrayUtil.binSearch(x,8));

        System.out.println(ArrayUtil.binSearch(x,10));

        System.out.println(ArrayUtil.binSearch(data,LocalDate.of(2021,12,20)));
        System.out.println(ArrayUtil.binSearch(data,LocalDate.of(2021,1,21))+"\n");

        ArrayUtil.selectionSort(data);
        ArrayUtil.selectionSort(x);
        ArrayUtil.mergeSort(data);
        ArrayUtil.mergeSort(x);

        System.out.println(data);
        System.out.println(x +"\n");

    }
}
