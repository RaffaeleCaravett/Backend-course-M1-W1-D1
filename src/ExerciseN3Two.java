import java.util.Locale;
import java.util.Scanner;

public class ExerciseN3Two {
    public static void main(String[] args) {
        System.out.println("Inserisci in susseguenza e premendo invio dopo ogni inserimento, tre numeri diversi, anche decimali");
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double firstTriangleSide = giveUsArea(scanner);
        System.out.println("Inserisci un altro numero :");
        double secondTriangleSide = giveUsArea(scanner);
        System.out.println("Inserisci un ultimo numero");
        double thirdTriangleSide = giveUsArea(scanner);
        System.out.println("L'area del triangolo avente i lati della lunghezza da te inserita è (Usando il metodo di Erone :"
            + calculateTriangleArea(firstTriangleSide,secondTriangleSide,thirdTriangleSide)+")") ;
        scanner.close();
    }


    private static double giveUsArea(Scanner scanner){
        while(true){
            try{
                return  scanner.nextDouble();
            } catch (java.util.InputMismatchException e){
                scanner.nextLine();
                System.out.println("Inserisci un numero, per favore.");
                System.out.println("Riprova :");
            }
        }
    }

    private static double calculateTriangleArea(double number1, double number2, double number3){
        double semiPerimeter = (number1+number2+number3)/2.0;
        return Math.sqrt(semiPerimeter * (semiPerimeter-number1) * (semiPerimeter-number2) * (semiPerimeter*number3));
    }

}
