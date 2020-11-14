import java.util.Scanner;

public class EvalApp implements EvalControl
{
    public static void main(String[] args)
    {
        //fields used for plugins, menu navigation and expression evaluations
        List<EvaluatorPlugin> plugins = new ArrayList<EvaluatorPlugin>();
        Scanner sc = new Scanner(System.in);
        boolean deciding = true;
        boolean plugging = true;
        int menuChoice = 0;
        int plugChoice = 0;
        int min = 0;
        int max = 0;
        int inc = 0;
        String inExp;
        EquationEvaluator ee = new EquationEvaluator();

        System.out.println("Welcome to the Equation Evaluator Application!");

        //initial menu that has the user decide if they want to evaluate, add plugins or exit
        while (deciding)
        {
            System.out.println("Please select an option");
            System.out.println("1: Type in expression");
            System.out.println("2: Select plugins");
            System.out.println("3: Exit");
            menuChoice = sc.nextInt();
            switch (menuChoice) {
                case 1:
                    System.out.println("Please input the expression: ");
                    inExp = sc.next();
                    System.out.println("Please input the minimum x value: ");
                    min = sc.nextInt();
                    System.out.println("Please input the maximum x value: ");
                    max = sc.nextInt();
                    System.out.println("Please input the increment of x: ");
                    inc = sc.nextInt();
                    ee.evaluateRange(inExp, min, max, inc);
                    break;
                //submenu for user to decide what plugins to use
                case 2:
                    while (plugging)
                        System.out.println("Please select the plugins you wish to use");
                        System.out.println("1: Write to CSV");
                        System.out.println("2: Add progress bar");
                        System.out.println("3: Implement additional functions");
                        System.out.println("4: add C version of progress bar");
                        System.out.println("5: Back");
                        switch (plugChoice)
                        {
                            case 1:
                                CSVWriter cw = new CSVWriter();
                                cw.start(this);
                                registerCSVWriter();
                                break;
                            case 2:
                                ProgressBar pb = new ProgressBar();
                                pb.start(this);
                                registerProgressBar();
                                break;
                            case 3:
                                Functions fs = new Functions();
                                fs.start(this);
                                registerOtherFunctions();
                                break;
                            case 4:
                                CProgressBar cpb = new CProgressBar();
                                cpb.start(this);
                                registerCProgressBar();
                                break;
                            case 5:
                                plugging = false;
                                break;
                            default:
                                System.out.println("Please input a valid option");
                        }
                    break;
                case 3:
                    deciding = false;
                    break;
                default:
                    System.out.println("Please input a valid option");
            }
        }
    }

    //Below methods are used to add the plugins to the main application
    public static void registerProgressBar(ProgressBar callback)
    {
        callback.api = this;
        this.plugins.attach(callback);
    }

    public static void registerCSVWriter(CSVWriter callback)
    {
        callback.api = this;
        this.plugins.attach(callback);
    }

    public static void registerOtherFunctions(Functions callback)
    {
        callback.api = this;
        this.plugins.attach(callback);
    }

    public static void registerCProgressBar(CProgressBar callback)
    {
        callback.api = this;
        this.plugins.attach(callback);
    }
}
