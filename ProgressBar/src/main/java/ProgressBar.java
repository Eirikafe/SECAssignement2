public class ProgressBar implements EvaluatorPlugin
{
   public void ProgressBar()
    {
        double min = 0.0;
        double max = 0.0;
        double increment = 1.0;
        double current = 0.0;
        double progress = 0.0;
    }

    public void registerProgressBar(double inMin, double inMax, double inIncrement, ProgressBar callBack)
    {
        this.min = inMin;
        this.max = inMax;
        this.increment = inIncrement;
    }

    public void displayProgress(double inCurrent, double inMax)
    {
        progress = inCurrent / inMax;
        System.out.printf("\r Progress: %.2f", progress);
    }
}
