package Code;

public class Utilidades {

    public static void eliminarMatriz(int index, Object[][] matriz) {
        for (int i = index; i < matriz.length - 1; i++) {
            matriz[i] = matriz[i + 1];
        }
    }

}
