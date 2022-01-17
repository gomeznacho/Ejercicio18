public class Main {
    public static void main(String[] args) {
        Excepciones.dividePorCero(5);
        Excepciones.buscarArchivo("talycual.tal");

        String[] array = {"uno", "dos", "tres", "cuatro", "cinco", "seis"};
        Excepciones.buscarNoExistente(array, 9);
    }
}
