import java.util.Scanner;

public class ExerciseN2 {

    public static void main(String[] args) {
        System.out.println("Inserisci tre stringhe, una alla volta e dopo aver premuto invio.");

        Scanner scanner = new Scanner(System.in);
        String stringN1 = scanner.nextLine();
        System.out.println("Inserisci la seconda stringa.");
        String stringN2 = scanner.nextLine();
        System.out.println("Inserisci la terza stringa.");
        String stringN3 = scanner.nextLine();
        System.out.println("Nella prossima linea trovi le stringhe in ordine di inserimento");
        System.out.println(reverse(stringN1,stringN2,stringN3));


        scanner.close();

    }


    public static String reverse(String string1, String string2, String string3){

        String allTogheter="";
        String allTogheterReverse="";

            allTogheter= string1 + ' ' + string2 + ' ' + string3;
            allTogheterReverse= string3 + ' ' + string2 + ' ' + string1;

            return "In ordine :" + allTogheter + ", al contrario :" + allTogheterReverse;
    }


}
