package ua.opnu;

import java.util.Arrays;
import java.util.function.Predicate;

public class Utils {

    @SuppressWarnings("unchecked")
    public static <T> T[] filter(T[] input, Predicate<T> p) {
        T[] result = Arrays.copyOf(input, input.length);

        int counter = 0;
        for (T element : input) {
            if (p.test(element)) {
                result[counter++] = element;
            }
        }
        return Arrays.copyOf(result, counter);
    }

    public static <T extends Comparable<T>, V extends T> boolean contains(T[] array, V element) {
        for (T t : array) {
            if (t.equals(element)) {
                return true;
            }
        }
        return false;
    }
}