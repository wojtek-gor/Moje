public class PairUtilDemo {
    public static void main(String[] args) {
        Pair<Integer> p1 = new Pair<>(1,2);
        Pair<Integer> p11 = PairUtil.swap(p1);
        System.out.println(p1.getFirst() + " " + p1.getSecond());
        Pair<String> p2 = new Pair<>("Ola", "ALa");
        Pair<String> p22 = PairUtil.swap(p2);
        System.out.println(p2.getFirst() + " " + p2.getSecond());

    }
}
