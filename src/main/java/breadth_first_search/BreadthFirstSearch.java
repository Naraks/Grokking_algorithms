package breadth_first_search;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class BreadthFirstSearch {

    public <T> Graph<T> search(Graph<T> initialElement, Predicate<Graph<T>> predicate) {

        List<Graph<T>> searchableElements = initialElement.getNeighbours();
        List<Graph<T>> checkedElements = new ArrayList<>();

        while (searchableElements.size() != 0) {
            Graph<T> currGraph = searchableElements.get(0);
            searchableElements.remove(0);

            if (checkedElements.contains(currGraph)) {
                continue;
            }

            if (predicate.test(currGraph)) {
                return currGraph;
            } else {
                checkedElements.add(currGraph);
                searchableElements.addAll(currGraph.getNeighbours());
            }
        }
        return null;
    }

}
