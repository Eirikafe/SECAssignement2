public class ProgressBar implements EvaluatorPlugin
{
    private EvalControl api;
    private double min, max, increment, current, progress;

    @Override
    public void start(EvalControl api)
    {

    }

    //initializes the progress bar fields
    public void ProgressBar()
    {
        min = 0.0;
        max = 0.0;
        increment = 1.0;
        current = 0.0;
        progress = 0.0;
    }

    //displays the progress bar in the console, uses \r to rewrite on the same line
    public void displayProgress(double inCurrent, double inMax)
    {
        progress = inCurrent / inMax;
        System.out.printf("\r Progress: %.2f", progress);
    }
}
