package binary_search;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BinarySearchTest {

    private BinarySearch bs;

    @BeforeEach
    void setUp() {
        bs = new BinarySearch();
    }

    @Test
    void emptySearchTest() {
        List<Integer> elements = new ArrayList<>();
        Integer element = 5;

        Integer result = bs.search(elements, element, Integer::compare);
        Assertions.assertNull(result);
    }

    @Test
    void searchTest() {
        List<LocalDate> elements = List.of(LocalDate.of(2022, 2, 1),
                                           LocalDate.of(2022, 2, 2),
                                           LocalDate.of(2022, 2, 3),
                                           LocalDate.of(2022, 2, 4),
                                           LocalDate.of(2022, 2, 5),
                                           LocalDate.of(2022, 2, 6));

        LocalDate element = LocalDate.of(2022, 2, 5);

        Integer result = bs.search(elements, element, LocalDate::compareTo);
        Assertions.assertEquals(4, result);
    }

    @Test
    void searchNoneExistenceElementTest() {
        List<LocalDate> elements = List.of(LocalDate.of(2022, 2, 1),
                                           LocalDate.of(2022, 2, 2),
                                           LocalDate.of(2022, 2, 3),
                                           LocalDate.of(2022, 2, 4),
                                           LocalDate.of(2022, 2, 6));

        LocalDate element = LocalDate.of(2022, 2, 5);

        Integer result = bs.search(elements, element, LocalDate::compareTo);
        Assertions.assertNull(result);
    }

    @Test
    void integerSearchTest() {
        List<Integer> elements = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8);
        Integer element = 4;

        Integer result = bs.search(elements, element, Integer::compare);
        Assertions.assertEquals(4, result);
    }

    @Test
    void longSearchTest() {
        List<Long> elements = List.of(0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L);
        Long element = 4L;

        Integer result = bs.search(elements, element, Long::compare);
        Assertions.assertEquals(4, result);
    }

    @Test
    void doubleSearchTest() {
        List<Double> elements = List.of(0D, 1D, 2D, 3D, 4D, 5D, 6D, 7D, 8D);
        Double element = 0D;

        Integer result = bs.search(elements, element, Double::compare);
        Assertions.assertEquals(0, result);
    }

    @Test
    void floatSearchTest() {
        List<Float> elements = List.of(0F, 1F, 2F, 3F, 4F, 5F, 6F, 7F, 8F);
        Float element = 8F;

        Integer result = bs.search(elements, element, Float::compare);
        Assertions.assertEquals(8, result);
    }

    @Test
    void stringSearchTest() {
        List<String> elements = List.of("Anna", "Ben", "Cindy", "Dan", "Frank", "Gabriel");
        String element = "Ben";

        Integer result = bs.search(elements, element, CharSequence::compare);
        Assertions.assertEquals(1, result);
    }

    @Test
    void recursiveBinarySearchTest() {
        List<String> elements = List.of("Anna", "Ben", "Cindy", "Dan", "Frank", "Gabriel");
        String element = "Ben";

        String result = bs.recursiveSearch(elements, element, CharSequence::compare);
        Assertions.assertEquals(element, result);
    }

    @Test
    void recursiveBinaryNotExistSearchTest() {
        List<String> elements = List.of("Anna", "Ben", "Cindy", "Dan", "Frank", "Gabriel");
        String element = "Bonk";

        String result = bs.recursiveSearch(elements, element, CharSequence::compare);
        Assertions.assertNull(result);
    }

}
