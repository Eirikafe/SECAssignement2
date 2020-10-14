public interface EvalControl {
    void registerProgressBar(ProgressBar bar);
    void registerCSVWriter(CSVWriter writer);
    void registerOtherFunctions(OtherFunction of);
}
