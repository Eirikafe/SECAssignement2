import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

//plugin used to write the values of X and Y into a csv file
public class CSVWriter implements EvaluatorPlugin{
    private FileWriter fw;
    private Map<Double, Double> X_Y_MAP;
    private String[] HEADERS;
    private EvalControl api;

    @Override
    public void start(EvalControl api)
    {

    }

    //Initializes the hashmap, headers and creates the .csv file
    public CSVWriter() throws IOException
    {
        X_Y_MAP = new HashMap<>();
        HEADERS = {X, Y};
        fw = new FileWriter("XandY.csv");

    }

    //adds the given values of X and Y into the map
    public void addtoMap(Double X, Double Y)
    {
        X_Y_MAP.put(X, Y);
    }

    //takes all values in the map and adds it writes it into the csv
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
