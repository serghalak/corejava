package generics.pair;

import java.util.Comparator;

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
    public static <T extends Comparable> Pair<T> minmax(T[] a) {
        if(a == null || a.length == 0)
            return null;
        T min = a[0];
        T max = a[1];
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

    public static <T extends Comparable> T min(T[] a) {

        if (a == null || a.length == 0)
            return null;
        T smallest = a[0];
        for (int i = 1; i < a.length; i++) {
            if (smallest.compareTo(a[i]) > 0)
                smallest = a[i];
        }
        return smallest;
    }
}
