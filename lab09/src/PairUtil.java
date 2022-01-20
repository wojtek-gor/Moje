public class PairUtil<T>{
    public static <T> Pair<T> swap(Pair<T> p){
        Pair<T> prev_p = new Pair<>(p.getFirst(), p.getSecond());
        p.swap();
        return prev_p;
    }
}
