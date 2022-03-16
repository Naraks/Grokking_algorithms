package selection_sort;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SelectionSortTest {

    private SelectionSort ss;

    @BeforeEach
    void setUp() {
        ss = new SelectionSort();
    }

    @Test
    void testEmptyList() {
        List<String> list = new ArrayList<>();
        List<String> sortedList = ss.sort(list, CharSequence::compare);

        Assertions.assertEquals(0, sortedList.size());
    }

    @Test
    void testIntegerSort() {
        List<Integer> list = List.of(6, 3, 8, 2, 9, 1, 0);
        List<Integer> sortedList = ss.sort(list, Integer::compare);

        Assertions.assertEquals(0, sortedList.get(0));
        Assertions.assertEquals(1, sortedList.get(1));
        Assertions.assertEquals(2, sortedList.get(2));
        Assertions.assertEquals(3, sortedList.get(3));
        Assertions.assertEquals(6, sortedList.get(4));
        Assertions.assertEquals(8, sortedList.get(5));
        Assertions.assertEquals(9, sortedList.get(6));
    }

    @Test
    void testSort() {
        List<String> list = List.of("n", "f", "a", "t", "d", "g");
        List<String> sortedList = ss.sort(list, CharSequence::compare);

        Assertions.assertEquals("a", sortedList.get(0));
        Assertions.assertEquals("d", sortedList.get(1));
        Assertions.assertEquals("f", sortedList.get(2));
        Assertions.assertEquals("g", sortedList.get(3));
        Assertions.assertEquals("n", sortedList.get(4));
        Assertions.assertEquals("t", sortedList.get(5));
    }

}
