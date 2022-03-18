package quick_sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class QuickSort {

    public <T> List<T> sort(List<T> list, Comparator<T> comparator) {
        if (list.isEmpty() || list.size() == 1) {
            return list;
        }

        List<T> leftList = new ArrayList<>();
        List<T> rightList = new ArrayList<>();
        T pivot = list.get(list.size() / 2);

        for(int i = 0; i < list.size(); i++) {
            if (i == list.size() / 2) continue;
            if (comparator.compare(list.get(i), pivot) <= 0) {
                leftList.add(list.get(i));
            } else {
                rightList.add(list.get(i));
            }
        }

        List<T> leftSorted = sort(leftList, comparator);
        leftSorted.add(pivot);
        leftSorted.addAll(sort(rightList, comparator));

        return leftSorted;
    }

}
