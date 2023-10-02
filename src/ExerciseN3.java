import java.util.Locale;
import java.util.Scanner;

public class ExerciseN3 {
    public static void main(String[] args) {

        System.out.println("Inserisci nella linea seguente un numero. ( Es: 0.1, o anche solo 1)");
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);;
        double firstNumber =getNextDouble(scanner);
        System.out.println("Inserisci,adesso, un altro numero decimale");
        double secondNumber = getNextDouble(scanner);
        System.out.println("Ecco il perimetro di un rettangolo avente due lati delle lunghezze da te fornite");
        System.out.println(rectangularPerimeter(firstNumber,secondNumber));
        scanner.close();
    }

    private static double getNextDouble(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (java.util.InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Input non valido. Assicurati di inserire un numero decimale valido.");
                System.out.print("Riprova: ");
            }
        }
    }

    public static double rectangularPerimeter(double number1 , double number2 ){

       double integerNumber=(number1+number2)*2;

        return    integerNumber;
    }

}
