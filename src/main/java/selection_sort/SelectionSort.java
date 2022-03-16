package selection_sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SelectionSort {

    /**
     * Selection sort
     * @param list unsorted list of elements
     * @param comparator comparator
     * @param <T> type of elements
     * @return sorted list of elements
     */
    public <T> List<T> sort(List<T> list, Comparator<T> comparator) {
        if (list.isEmpty()) {
            return Collections.emptyList();
        }

        List<T> unsortedList = new ArrayList<>(list);
        List<T> sortedList = new ArrayList<>();

        while (!unsortedList.isEmpty()) {
            T maxElement = unsortedList.get(0);
            for (T element : unsortedList) {
                if (comparator.compare(element, maxElement) < 0) {
                    maxElement = element;
                }
            }
            sortedList.add(maxElement);
            unsortedList.remove(maxElement);
        }

        return sortedList;
    }

}
