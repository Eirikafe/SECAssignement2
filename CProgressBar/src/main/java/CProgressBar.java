public class CProgressBar implements EvaluatorPlugin
{
    private EvalControl api;

    @Override
    public void start(EvalControl api)
    {

    }

    //loads the native lib
    static
    {
        System.loadLibrary("mynativelibrary");
    }

    public void CProgressBar()
    {

    }

    //uses native prefix to indicate JNI will be used
    public native void displayProgress(Double current, Double max);
}