//import CSVWriter.csvWrite;

public class Main {
    public static void main(String[] args)
    {
        EquationEvaluator ee = new EquationEvaluator();
        String expression = "X + 1.0";
        System.out.println(ee.replaceX(expression, 1));
        //CSVWriter.CSVWriter cw = new CSVWriter.CSVWriter();
    }
}
