package chapter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Chapter4Test {
    final Chapter4 chapter4 = new Chapter4();

    @Test
    void exampleProblem1Test() {
        String result = chapter4.exampleProblem1("R R R U D D", 5);
        Assertions.assertEquals(result, "3 4");
    }

    @Test
    void exampleProblem2Test() {
        int result = chapter4.exampleProblem2(5);
        Assertions.assertEquals(result, 11475);
    }

    @Test
    void practicalProblem2Test() {
        int result = chapter4.practicalProblem2("a1");
        Assertions.assertEquals(result, 2);

        int result2 = chapter4.practicalProblem2("d5");
        Assertions.assertEquals(result2, 8);
    }

    @Test
    void practicalProblem3Test() {
        int result = chapter4.practicalProblem3(new int[][]{ {1, 1, 1, 1}, {1, 0, 0, 1}, {1, 1, 0, 1}, {1, 1, 1, 1}}, new int[]{ 1, 1}, 0);
        Assertions.assertEquals(result, 3);
    }
}