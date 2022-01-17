import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Excepciones {

    public static int dividePorCero(int a){
        try {
            return a / 0;
        }
        catch(ArithmeticException e){
            System.out.println("no se puede dividir por cero");
        }
        return 0;
    }

    public static String buscarNoExistente(String [] sa, int a){
        try{
            return sa[a];
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("el array no tiene tantos elementos");
        }
        return "";
    }

    public static FileInputStream buscarArchivo(String a){
        try {
            FileInputStream file = new FileInputStream(a);
            return file;
        }
        catch (FileNotFoundException e){
            System.out.println("El archivo no existe");
        }
        return null;
    }
}
