import org.python.core.*;
import org.python.util.*;
import java.time.*;

public class EquationEvaluator {
    // initialize python interpreter
    PythonInterpreter py;

    // constructor method that instantiates the interpreter
    public EquationEvaluator()
    {
        this.py = new PythonInterpreter();
    }

    // method used to replace the variable x with a double
    public String replaceX(String expression, double num)
    {
        return expression.replaceAll("X", Double.toString(num));
    }

    // method that uses a script to convert strings to solvable equations and returns the result
    public String evaluateExp(String expression)
    {
        double result = ((PyFloat) py.eval("float(" + expression + ")")).getValue();
        return Double.toString(result);
    }

    //uses the above two methods to evaluate an expression given a range of values for x from min to max. The value of x is increased by increment
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
