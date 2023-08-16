import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String ruta= "C:\\Users\\saul c\\Downloads\\codigos_postales_hmo.txt";

        try {
            BufferedReader br= new BufferedReader(new FileReader(ruta));
            String line;
            int[] contadorArr= new int[83358];

            while ((line = br.readLine()) != null){
                String[] id= line.split("\t");
                if (id.length >= 1){
                    int codPos=Integer.parseInt(id[0].trim());
                    contadorArr[codPos]++;
                }
            }
            int contador=0;
            for (int i = 83000; i <= 83357; i++) {
                if (contadorArr[i]>1){
                    contador++;
                }
            }
            System.out.println("El numero de asentamientos que comparten codigo postal son "+ contador);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}