package exercises;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumTest {

    private Sum sum;

    @BeforeEach
    void setUp() {
        sum = new Sum();
    }

    @Test
    void recursiveIntSumTest() {
        List<Integer> elements = List.of(1, 2, 3, 4);
        Integer result = sum.recursiveSum(elements, Integer::sum);

        Assertions.assertEquals(10, result);
    }

    @Test
    void recursiveStringSumTest() {
        List<String> elements = List.of("1", "2", "3", "4");
        String result = sum.recursiveSum(elements, this::stringSum);

        Assertions.assertEquals("1234", result);
    }

    private String stringSum(String s1, String s2) {
        return s1 + s2;
    }

    @Test
    void recursiveCountTest() {
        List<String> elements = List.of("1", "2", "3", "4");
        int result = sum.recursiveCount(elements);

        Assertions.assertEquals(4, result);
    }

    @Test
    void recursiveCountOneTest() {
        List<String> elements = List.of("1");
        int result = sum.recursiveCount(elements);

        Assertions.assertEquals(1, result);
    }

    @Test
    void recursiveMaxTest() {
        List<Integer> elements = List.of(9, 2, 4, 12, 3);
        Integer result = sum.recursiveMax(elements, Integer::compare);

        Assertions.assertEquals(12, result);
    }

    @Test
    void recursiveMaxOneTest() {
        List<Integer> elements = List.of(9);
        Integer result = sum.recursiveMax(elements, Integer::compare);

        Assertions.assertEquals(9, result);
    }

}
