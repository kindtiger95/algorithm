package chapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Chapter3Test {
    private final Chapter3 chapter3 = new Chapter3();

    @Test
    public void practicalSolution1Test() {
        int result = chapter3.practicalSolution1(5, 8, 3, new int[]{2, 4, 5, 4, 6});
        assertEquals(result, 46);
    }

    @Test
    public void practicalSolution2Test() {
        int result = chapter3.practicalSolution2(3, 3, new int[][]{
                {3, 1, 2},
                {4, 1, 4},
                {2, 2, 2}
        });
        assertEquals(result, 2);
    }

    @Test
    public void practicalSolution3Test() {
        int result1 = chapter3.practicalSolution3(25, 5);
        int result2 = chapter3.practicalSolution3(26, 3);
        assertEquals(result1, 2);
        assertEquals(result2, 7);
    }
}