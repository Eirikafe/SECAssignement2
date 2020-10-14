import org.python.core.*;
import org.python.util.*;
import java.time.*;

public class EquationEvaluator {
    PythonInterpreter py;

    public EquationEvaluator()
    {
        this.py = new PythonInterpreter();
    }

    public String replaceX(String expression, double num)
    {
        return expression.replaceAll("X", Double.toString(num));
    }

    public String evaluateExp(String expression)
    {
        double result = ((PyFloat) py.eval("float(" + expression + ")")).getValue();
        return Double.toString(result);
    }

    public void evaluateRange(String expression, int min, int max, int increment)
    {
        String replacedExp = "";
        Instant start = Instant.now();
        for (int i = min; i <= max; i += increment)
        {
            replacedExp = replaceX(expression, i);
            String y = evaluateExp(replacedExp);
            Instant solved = Instant.now();
            Duration timeElapsed = Duration.between(start, solved);
            System.out.println("X: " + i + " Y: " + y + " Time Elapsed: " + timeElapsed.toMillis() + " ms");
        }
    }
}
