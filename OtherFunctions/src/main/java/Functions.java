public class Functions {
    private EvalControl api;
    @Override
    public void start(EvalControl api)
    {

    }

    public void Functions()
    {

    }

    //method used to calculate factorials. It is only an estimation and seems convoluted because we were told that they would be used in complex ways
    //this equation can find factorial values for fractions, for example.
    public static double Gamma(double x)
    {
        x++;
        double tmp = (x - 0.5) * Math.log(x + 4.5) - (x + 4.5);
        double est = 1.0 + 76.18009173       /  (x + 0)   - 86.50532033     /   (x + 1)
                         + 24.01409822       /  (x + 2)   - 1.231739516     /   (x + 3)
                         + 0.00120858003     /  (x + 4)   - 0.00000536382   /   (x + 5);
        double logy = tmp + Math.log(est * Math.sqrt(2 * Math.PI));
        return Math.exp(logy);
    }

    //same with the above method, but for fibonacci's sequence. This equation can estimate more complex fibonnaci values
    public static double Fibonacci(double x)
    {
        double Phi = 1.6180339887;
        double phi = 0.6180339887;

        return ((Math.pow(Phi, x) - Math.pow(-phi, x)) / Math.sqrt(5));
    }
}
