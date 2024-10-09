package chapter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Chapter4Test {
    final Chapter4 chapter4 = new Chapter4();

    @Test
    void example1Test() {
        int[] result = chapter4.example1(5, new String[]{"R", "R", "R", "U", "D", "D"});
        assertEquals(result[0], 3);
        assertEquals(result[1], 4);

        int[] result2 = chapter4.example1(7, new String[]{"U", "U", "L", "R", "R", "R", "U", "D", "D", "D" });
        assertEquals(result2[0], 4);
        assertEquals(result2[1], 4);
    }

    @Test
    void example2Test() {
        int result = chapter4.example2(5);
        assertEquals(result, 11475);
    }
}