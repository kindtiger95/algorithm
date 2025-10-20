package chapter;

import org.junit.jupiter.api.Test;

class Chapter6Test {
    private final Chapter6 chapter6 = new Chapter6();
    @Test
    public void exampleProblem1Test() {
        chapter6.exampleProblem1(new int[]{7, 5, 9, 0, 3, 1, 6, 2, 4, 8});
    }

    @Test
    public void exampleProblem2Test() { chapter6.exampleProblem2(new int[]{7, 5, 9, 0, 3, 1, 6, 2, 4, 8}); }

    @Test
    public void exampleProblem3Test() {
        int[] lists = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
        chapter6.exampleProblem3(lists, 0, 9);

        for (int elem : lists) {
            System.out.print(elem + " ");
        }
    }

    @Test
    public void exampleProblem4Test() { chapter6.exampleProblem4(new int[]{7, 5, 9, 0, 3, 1, 6, 2, 4, 8}); }

    @Test
    public void practicalProblem2Test() { chapter6.practicalProblem2(new int[]{15, 27, 12}); }
}