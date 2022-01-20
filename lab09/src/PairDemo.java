public class PairDemo {
    public static void main(String[] args) {
        Pair<Integer> p = new Pair<>(10,6);
        Pair<String> pa = new Pair<>("Ala", "Ola");
        System.out.println(p.getFirst() + " " + p.getSecond());
        p.swap();
        System.out.println(p.getFirst() + " " + p.getSecond());
        System.out.println(pa.getFirst() + " " + pa.getSecond());
        pa.swap();
        System.out.println(pa.getFirst() + " " + pa.getSecond());
    }
}
