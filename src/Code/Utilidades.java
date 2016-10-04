package Code;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Utilidades {

    public static void eliminarMatriz(int index, Object[][] matriz) {
        for (int i = index; i < matriz.length - 1; i++) {
            matriz[i] = matriz[i + 1];
        }
    }
    
    public static boolean numeros(String s){
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 1 || s.charAt(i) == 2 || s.charAt(i) == 3 || s.charAt(i) == 4 || s.charAt(i) == 5 || s.charAt(i) == 6 || s.charAt(i) == 7 || s.charAt(i) == 8 || s.charAt(i) == 9 || s.charAt(i) == 0){
                
            }else return false;
        }
        return true;
    }
    
    public static String loadFileAsString(String path) {
        StringBuilder builder = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line;
            while ((line = br.readLine()) != null) {
                builder.append(line + "\n");
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return builder.toString();
    }
        
   public static void escribirArchivo(String[] lista, int tamano, String nombre) throws IOException {
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(nombre), "utf-8"))) {
            for (int i = 0; i < tamano; i++) {
                writer.write(lista[i] + " ");
            }
            writer.close();
        }
    }
   
    public static String espaciosSalida(String s){
        return s.replace("_", " ");
    }

    public static String espaciosEntrada(String s){
        return s.replace(" ", "_");
    }
}
