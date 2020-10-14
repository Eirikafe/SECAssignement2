import org.python.antlr.op.Eq;

public class Main {
    public static void main(String[] args)
    {
        EquationEvaluator ee = new EquationEvaluator();
        String expression = "X + 1";
        System.out.println(ee.replaceX(expression, 1));
    }
}
