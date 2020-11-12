import ProgressBar.*;
import CSWriter.*;
import OtherFunction.*;

public interface EvalControl {
    void registerProgressBar(ProgressBar callBack);
    void registerCSVWriter(CSVWriter callBack);
    void registerOtherFunctions(OtherFunction callBack);
}
