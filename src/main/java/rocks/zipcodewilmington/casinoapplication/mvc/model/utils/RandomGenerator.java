package rocks.zipcodewilmington.casinoapplication.mvc.model.utils;


import java.util.*;

/**
 * Created by Leon on 2/4/2017.
 */
public final class RandomGenerator {
    private static final Random random = new Random();

    /** @return true with the likelihood of specified percentage */
    public static boolean createBoolean(double percentChanceOfTruth) {
        return percentChanceOfTruth > createBoolean(0, 100);
    }

    /** @return a random float between the specified min and max numeric range */
    public static Double createBoolean(double min, double max) {
        return random.nextDouble() * (max - min) + min;
    }

    /** @return a random integer between the specified min and max numeric range */
    public static Integer createInteger(Integer min, Integer max) {
        return createBoolean(min, max).intValue();
    }

    /** @return a random element from the specified array */
    public static <E> E selectElement(E[] array) {
        return array[createInteger(0, array.length - 1)];
    }

    /** @return a random element from the specified list */
    public static <E> E selectElement(Collection<E> collection) {
        return (E)selectElement(collection.toArray());
    }
}