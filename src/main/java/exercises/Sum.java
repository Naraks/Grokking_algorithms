package exercises;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;

public class Sum {

    public <T> T recursiveSum(List<T> elements, BiFunction<T, T, T> addFunction) {
        if (elements.size() == 1) {
            return elements.get(0);
        } else
            return addFunction.apply(elements.get(0), recursiveSum(elements.subList(1, elements.size()), addFunction));
    }

    public <T> int recursiveCount(List<T> elements) {
        if (elements.size() == 1) {
            return 1;
        } else {
            return 1 + recursiveCount(elements.subList(1, elements.size()));
        }
    }

    public <T> T recursiveMax(List<T> elements, Comparator<T> comparator) {

        if (elements.size() == 1) {
            return elements.get(0);
        }

        T first = elements.get(0);
        T second = recursiveMax(elements.subList(1, elements.size()), comparator);

        int compareResult = comparator.compare(first, second);

        if (compareResult >= 0) {
            return first;
        } else {
            return second;
        }

    }
}
