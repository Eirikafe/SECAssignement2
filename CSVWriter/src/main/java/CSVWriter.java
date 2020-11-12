import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class CSVWriter {
    FileWriter fw;
    Map<Double, Double> X_Y_MAP;
    String[] HEADERS;
    public CSVWriter() throws IOException
    {
        X_Y_MAP = new HashMap<>();
        HEADERS = {X, Y};
        fw = new FileWriter("XandY.csv");

    }

    public void addtoMap(Double X, Double Y)
    {
        X_Y_MAP.put(X, Y);
    }

    public void csvWrite() {
        try(CSVPrinter printer = new CSVPrinter(fw, CSVFormat.DEFAULT.withHeader(HEADERS)))
        {
            X_Y_MAP.forEach((X, Y) -> {
                try {
                    printer.printRecord(X, Y);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
