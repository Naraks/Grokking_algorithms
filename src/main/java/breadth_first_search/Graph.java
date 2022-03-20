package breadth_first_search;

import java.util.ArrayList;
import java.util.List;

public class Graph<T> {

    private T value;
    private List<Graph<T>> neighbours;

    public Graph() {
        neighbours = new ArrayList<>();
    }

    public Graph(T value) {
        neighbours = new ArrayList<>();
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public List<Graph<T>> getNeighbours() {
        return neighbours;
    }

    public void addNeighbour(Graph<T> neighbour) {
        neighbours.add(neighbour);
    }

    public void removeNeighbour(Graph<T> neighbour) {
        neighbours.remove(neighbour);
    }
}
