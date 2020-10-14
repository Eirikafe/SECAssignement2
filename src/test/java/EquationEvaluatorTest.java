import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EquationEvaluatorTest {

    EquationEvaluator ee = new EquationEvaluator();
    String expression = "";
    String expected = "";
    String replacedEx = "";
    String evalEx = "";
    double num;

    @Test
    public void givenX_andANumber_whenReplaceXCalled_thenXSwappedWithNum()
    {
        expression = "X - X + 1.0";
        num = 3.0;
        expected = "3.0 - 3.0 + 1.0";

        replacedEx = ee.replaceX(expression, num);

        assertEquals(expected, replacedEx);
    }

    @Test
    public void givenExpression_whenEvaluateExpCalled_thenDoubleStringReturned()
    {
        expression = "3.0 + 1.0";
        expected = "4.0";
        evalEx = ee.evaluateExp(expression);

        assertEquals(expected, evalEx);
    }

    @Test
    public void givenExpression_andNumber_whenReplaceX_andEvaluateExpCalled_thenDoubleStringReturned()
    {
        expression = "X - X + 5.0";
        num = 3.0;
        replacedEx = ee.replaceX(expression, num);
        evalEx = ee.evaluateExp(replacedEx);
        expected = "5.0";

        assertEquals(expected, evalEx);
    }

    @Test
    public void givenExpression_andMin_andMax_andIncrement_whenEvaluateRangeCalled_thenPrintXandY()
    {
        expression = "X * 10 + X * X - 10";
        int min = 0;
        int max = 10000;
        ee.evaluateRange(expression, min, max, 5);
    }
}
