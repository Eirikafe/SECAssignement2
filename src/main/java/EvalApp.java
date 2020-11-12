
public class EvalApp implements EvalControl
{
    public static void main(String[] args)
    {
        EquationEvaluator ee = new EquationEvaluator();
        String expression = "X + 1.0";
        System.out.println(ee.replaceX(expression, 1));
    }
}
