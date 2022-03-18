package binary_search;

import java.util.Comparator;
import java.util.List;

public class BinarySearch {

    /**
     * recursive binary search
     *
     * @param elements sorted array of elements
     * @param item desired element
     * @return desired element or null if element not found
     */
    public <T> T recursiveSearch(List<T> elements, T item, Comparator<T> comparator) {
        if (elements == null || elements.isEmpty()) {
            return null;
        }

        int currIndex = elements.size() / 2;
        int compareResult = comparator.compare(item, elements.get(currIndex));

        if (compareResult == 0) {
            return elements.get(currIndex);
        } else if (compareResult < 0) {
            return recursiveSearch(elements.subList(0, currIndex), item, comparator);
        } else {
            return recursiveSearch(elements.subList(currIndex + 1, elements.size()), item, comparator);
        }
    }

    /**
     * binary search
     *
     * @param elements sorted array of elements
     * @param item desired element
     * @return index of desired element or null if element not found
     */
    public <T> Integer search(List<T> elements, T item, Comparator<T> comparator) {
        if (elements == null || elements.isEmpty()) {
            return null;
        }

        int leftEdge = 0;
        int rightEdge = elements.size();

        while (leftEdge != rightEdge) {
            int currIndex = (leftEdge + rightEdge) / 2;

            int compareResult = comparator.compare(item, elements.get(currIndex));

            if (compareResult == 0) {
                return currIndex;
            } else if (compareResult < 0) {
                rightEdge = currIndex;
            } else {
                leftEdge = currIndex + 1;
            }
        }

        return null;
    }

    public Integer integerSearch(List<Integer> elements, Integer item) {
        return search(elements, item, Integer::compare);
    }

    public Integer longSearch(List<Long> elements, Long item) {
        return search(elements, item, Long::compare);
    }

    public Integer doubleSearch(List<Double> elements, Double item) {
        return search(elements, item, Double::compare);
    }

    public Integer floatSearch(List<Float> elements, Float item) {
        return search(elements, item, Float::compare);
    }

    public Integer stringSearch(List<String> elements, String item) {
        return search(elements, item, CharSequence::compare);
    }

}
