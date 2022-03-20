package breadth_first_search;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BreadthFirstSearchTest {

    private BreadthFirstSearch bfs;

    private Graph<String> initialGraph;

    @BeforeEach
    void setUp() {
        bfs = new BreadthFirstSearch();

        Graph<String> anna = new Graph<>("anna");
        Graph<String> ben = new Graph<>("ben");
        Graph<String> cindy = new Graph<>("cindy");

        anna.addNeighbour(ben);
        anna.addNeighbour(cindy);

        Graph<String> frank = new Graph<>("frank");
        cindy.addNeighbour(frank);

        Graph<String> den = new Graph<>("den");
        Graph<String> endy = new Graph<>("endy");

        initialGraph = new Graph<>("init");
        initialGraph.addNeighbour(anna);
        initialGraph.addNeighbour(den);
        initialGraph.addNeighbour(endy);
    }


    @Test
    void searchTest() {
        Graph<String> search = bfs.search(initialGraph, this::predicateTrue);

        Assertions.assertEquals("cindy", search.getValue());
    }

    private boolean predicateTrue(Graph<String> graph) {
        return graph.getValue().equals("cindy");
    }

    @Test
    void searchNotExistTest() {
        Graph<String> search = bfs.search(initialGraph, this::predicateFalse);

        Assertions.assertNull(search);
    }

    private boolean predicateFalse(Graph<String> graph) {
        return graph.getValue().equals("cindy1");
    }

}
