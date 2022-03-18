package quick_sort;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class QuickSortTest {

    private QuickSort qs;

    @BeforeEach
    void setUp() {
        qs = new QuickSort();
    }

    @Test
    void sortTest() {
        List<Integer> elements = List.of(7, 12, 3, 99, 13, 2, 59, 43, 77, 60);

        List<Integer> result = qs.sort(elements, Integer::compare);

        Assertions.assertEquals(2, result.get(0));
        Assertions.assertEquals(3, result.get(1));
        Assertions.assertEquals(7, result.get(2));
        Assertions.assertEquals(12, result.get(3));
        Assertions.assertEquals(13, result.get(4));
        Assertions.assertEquals(43, result.get(5));
        Assertions.assertEquals(59, result.get(6));
        Assertions.assertEquals(60, result.get(7));
        Assertions.assertEquals(77, result.get(8));
        Assertions.assertEquals(99, result.get(9));
    }

    @Test
    void sortOneElementTest() {
        List<Integer> elements = List.of(7);

        List<Integer> result = qs.sort(elements, Integer::compare);

        Assertions.assertEquals(7, result.get(0));
    }

    @Test
    void sortTwoElementTest() {
        List<Integer> elements = List.of(7, 3);

        List<Integer> result = qs.sort(elements, Integer::compare);

        Assertions.assertEquals(3, result.get(0));
        Assertions.assertEquals(7, result.get(1));
    }

    @Test
    void sortTwoElementTestTwo() {
        List<Integer> elements = List.of(3, 7);

        List<Integer> result = qs.sort(elements, Integer::compare);

        Assertions.assertEquals(3, result.get(0));
        Assertions.assertEquals(7, result.get(1));
    }

}
