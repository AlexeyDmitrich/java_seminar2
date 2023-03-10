import java.io.IOException;
import java.util.InputMismatchException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class HomeTask4 {
        public static void main(String[] args) throws IOException {
            Logger logger = Logger.getLogger(HomeTask4.class.getName());
            logger.setLevel(Level.INFO);
            FileHandler fh = new FileHandler("calclog.txt");
            SimpleFormatter txt = new SimpleFormatter();
            fh.setFormatter(txt);
            logger.addHandler(fh);

            try {
                double usNum1 = input.Double("Введите первое число");
                String math = input.Str("Введите действие");
                double usNum2 = input.Double("Введите второе число");
                try {
                    double result = calc(usNum1, usNum2, math);
                    System.out.println(result);
                    StringBuilder toLog = new StringBuilder();
                    toLog.append("request: \t");
                    toLog.append(usNum1);
                    toLog.append(math);
                    toLog.append(usNum2);
                    String resLog = toLog.toString();
                    logger.log(Level.INFO, resLog);
                    StringBuilder respLog = new StringBuilder();
                    respLog.append("Response: \t");
                    respLog.append(result);
                    logger.log((Level.INFO), (respLog).toString());

                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                    logger.log(Level.WARNING, e.getMessage());
                }
            } catch (InputMismatchException e){
                System.out.println(e.getMessage());
                logger.log(Level.WARNING, ("Неверный ввод: " + e.getMessage()));
            }
        }

        public static double calc (double num1, double num2, String operation){
            switch (operation){
                case "+":
                    return num1+num2;
                case "-":
                    return num1-num2;
                case "*":
                    return num1*num2;
                case "/":
                    return num1/num2;
                default:
                    throw new RuntimeException("Запрашиваемое действие не найдено");
            }
        }

    }

