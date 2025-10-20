package chapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Chapter3Test {
    private final Chapter3 chapter3 = new Chapter3();

    @Test
    public void exampleProblem1Test() {
        int result1 = chapter3.exampleProblem1(700);
        assertEquals(result1, 3);

        int result2 = chapter3.exampleProblem1(1200);
        assertEquals(result2, 4);

        int result3 = chapter3.exampleProblem1(1250);
        assertEquals(result3, 5);

        int result4 = chapter3.exampleProblem1(1760);
        assertEquals(result4, 7);
    }

    @Test
    public void practicalProblem2Test() {
        int result1 = chapter3.practicalProblem3(8, 3, new int[]{2, 4, 5, 4, 6});
        assertEquals(result1, 46);

        int result2 = chapter3.practicalProblem3(7, 2, new int[]{3, 4, 3, 4, 3});
        assertEquals(result2, 28);
    }

    @Test
    public void practicalProblem2_2Test() {
        int result1 = chapter3.practicalProblem2_2(8, 3, new int[]{2, 4, 5, 4, 6});
        assertEquals(result1, 46);

        int result2 = chapter3.practicalProblem2_2(7, 2, new int[]{3, 4, 3, 4, 3});
        assertEquals(result2, 28);
    }

    @Test
    public void practicalProblem3Test() {
        int result1 = chapter3.practicalProblem3(new int[][]{ {3, 1, 2}, {4, 1, 4}, {2, 2, 2}});
        assertEquals(result1, 2);

        int result2 = chapter3.practicalProblem3(new int[][]{ {7, 3, 1, 8}, {3, 3, 3, 4} });
        assertEquals(result2, 3);
    }

    @Test
    public void practicalProblem4Test() {
        int result1 = chapter3.practicalProblem4(25, 5);
        assertEquals(result1, 2);

        int result2 = chapter3.practicalProblem4_2(25, 3);
        assertEquals(result2, 6);
    }
}