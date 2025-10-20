package chapter;

import org.junit.jupiter.api.Test;

class Chapter8Test {
    @Test
    public void exampleProblem1Test() {
        Chapter8 chapter8 = new Chapter8();
        System.out.println(chapter8.exampleProblem1(10));
    }

    @Test
    public void practicalProblem2Test() {
        Chapter8 chapter8 = new Chapter8();
        int result = chapter8.practicalProblem2(16);
        System.out.println(result);
    }

    @Test
    public void practicalProblem3Test() {
        Chapter8 chapter8 = new Chapter8();
        int result = chapter8.practicalProblem3(new int[]{1, 3, 1, 5});
        System.out.println(result);
    }

    @Test
    public void practicalProblem5Test() {
        Chapter8 chapter8 = new Chapter8();
        int result = chapter8.practicalProblem5(new int[]{2, 3}, 15);
        System.out.println(result);
    }

}