import javax.crypto.spec.PSource;
import java.util.Arrays;

public class ExerciseN1 {

    public static void main(String[] args) {


        String stringArray[]={"sole","cuore","amore","ciao","amici"};
        int numeriInteri[] = new int [20];

        for (int i =1;i < 20; i++) {
            numeriInteri[i] = i + 1;
        }
        System.out.println(Moltiplica(numeriInteri));
        System.out.println(Concatena("Numero :",numeriInteri));
        System.out.println(pushNumber3Position(stringArray,"vediamo"));





    }

    public static int Moltiplica(int[]Numero1){

        double random1= Math.random()*19;
        double random2= Math.random()*19;

        int randomNumber1 = (int) Math.floor(random1)+1;
        int randomNumber2 =(int) Math.floor(random2)+1;

        return Numero1[randomNumber1] * Numero1[randomNumber2];
    }


    public static String Concatena(String stringa, int[] Numero){
        double random1= Math.random()*19;

        int randomNumber1 = (int) Math.floor(random1)+1;
        return stringa+Numero[randomNumber1];
    }

    public static String pushNumber3Position(String[] array, String stringa){
        String[] newArray = new String[6];

        for (int i = 0; i < 3; i++) {
            newArray[i] = array[i];
        }

        newArray[3]= stringa;

        for (int i = 4; i < 6; i++) {
            newArray[i] = array[i - 1];
        }

        return Arrays.toString(newArray);
    }
}
