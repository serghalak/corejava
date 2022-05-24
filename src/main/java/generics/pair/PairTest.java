package generics.pair;

public class PairTest {
    public static void main(String[] args) {
        String[] words = {"Mary", "had", "a", "little", "lamd"};
        Pair<String> mm = ArrayAlg.minmax(words);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());

        String middle = ArrayAlg.<String>getMiddle("John", "Q", "Public");
        System.out.println("middle element: " + middle);

        //double middle1 = ArrayAlg.getMiddle(3.14, 1729, 0);//error
        double middle1 = ArrayAlg.getMiddle(3.14, 1729.0, 0.0);

    }
}

class ArrayAlg {
    public static Pair<String> minmax(String[] a) {
        if(a == null || a.length == 0)
            return null;
        String min = a[0];
        String max = a[1];
        for (int i = 1; i < a.length; i++) {
            if(min.compareTo(a[i]) > 0)
                min = a[i];
            if(max.compareTo(a[i]) < 0)
                max = a[i];
        }
        return new Pair<>(min, max);
    }

    public static <T> T getMiddle(T ... a) {
        return a[a.length / 2];
    }
}
