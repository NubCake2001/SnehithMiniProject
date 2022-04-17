package SciCal;
import java.util.*;
import java.lang.Math;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class My_Main {
    private static final Logger logger = LogManager.getLogger(My_Main.class);

    public My_Main() {}

    public double root(double n1) {
        double return_val = Math.sqrt(n1);
        logger.info("[ROOT] - " + return_val);
        return return_val;
    }

    public double factorial(int n1) {
        if (n1 < 0)
            return Double.NaN;
        double fact = 1;
        for (int i = 1; i <= n1; i++)
            fact = fact * i;
        logger.info("[FACTORIAL] - " + fact);
        return fact;
    }

    public double log(double n1) {
        double return_val = Math.log(n1);
        logger.info("[LOG] - " + return_val);
        return return_val;
    }

    public double power(double n1, double n2) {
        double return_val = Math.pow(n1, n2);
        logger.info("[POWER] - " + return_val);
        return return_val;
    }
    public static void main(String[] args) {
        My_Main calculator = new My_Main();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 1 to get square root \nPress 2 to get factorial");
        System.out.println("\nPress 3 to get natural logarithm\nPress 4 to get power");
        int input = scanner.nextInt();
        if (input == 1) {
            System.out.println("Square root output is : " + calculator.root(scanner.nextDouble()));
        } else if (input == 2) {
          System.out.println("Factorial output is : " + calculator.factorial(scanner.nextInt()));
        } else if (input == 3) {
            System.out.println("Natural logarithm output is : " + calculator.log(scanner.nextDouble()));
          } else if (input == 4) {
            System.out.println("Power output is : " + calculator.power(scanner.nextDouble(), scanner.nextDouble()));
        } else
        {
          System.out.println("Not a valid input.");
        }
        scanner.close();
    }
}