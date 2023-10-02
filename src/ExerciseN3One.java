import java.util.Scanner;

public class ExerciseN3One {

    public static void main(String[] args) {
        System.out.println("Inserisci un numero intero. Es: 1,2 o 3");
        Scanner scanner= new Scanner(System.in);
        int firstNumber = isItInt(scanner);
        System.out.print("Se trovi lo 0, il numero è pari, altrimenti è dispari");
        System.out.println(":" + firstNumber%2);

    }


    private static int isItInt(Scanner scanner){
        while (true){
            try{
                return scanner.nextInt();
            }catch (java.util.InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Inserisci un numero intero tipo : 1,2,o 3");
                System.out.print("Riprova: ");
            }
        }
    }

}
