import ProgressBar.*;
import CSWriter.*;
import OtherFunction.*;
import CProgressBar.*;

//interface implemented by the main application
public interface EvalControl {
    void registerProgressBar(ProgressBar callBack);
    void registerCSVWriter(CSVWriter callBack);
    void registerOtherFunctions(OtherFunction callBack);
    void registerCProgressBar(CProgressbar callBack)
}
