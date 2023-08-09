import org.junit.Assert;
import org.junit.Test;

public class ArithmeticQuizTest {

    @Test
    public void testConstructor() {
        ArithmeticQuiz quiz = new ArithmeticQuiz(12);
        Assert.assertTrue(quiz.getMax() == 12);
    }

    @Test
    public void computeTestAdd() {
        ArithmeticQuiz quiz = new ArithmeticQuiz(12);
        Assert.assertTrue(quiz.compute(1, 1, "+") == 2);
        Assert.assertTrue(quiz.compute(1, 12, "+") == 13);
    }

    @Test
    public void computeTestSubtract() {
        ArithmeticQuiz quiz = new ArithmeticQuiz(12);
        Assert.assertTrue(quiz.compute(10, 10, "-") == 0);
        Assert.assertTrue(quiz.compute(10, 2, "-") == 8);
        Assert.assertTrue(quiz.compute(1, 7, "-") == -6);
    }

    @Test
    public void computeTestMultiply() {
        ArithmeticQuiz quiz = new ArithmeticQuiz(12);
        Assert.assertTrue(quiz.compute(1, 1, "x") == 1);
        Assert.assertTrue(quiz.compute(10, 12, "x") == 120);
        Assert.assertTrue(quiz.compute(12, 12, "x") == 144);
    }
}