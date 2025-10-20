package chapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Chapter7Test {
    private Chapter7 chapter7 = new Chapter7();

    @Test
    public void practicalProblem2Test() {
        chapter7.practicalProblem2(new int[]{8, 3, 7, 9, 2}, new int[]{5, 7, 9});
    }

    @Test
    public void practicalProblem3Test() {
        chapter7.practicalProblem3(new int[]{19, 15, 10, 17}, 6);
    }

}