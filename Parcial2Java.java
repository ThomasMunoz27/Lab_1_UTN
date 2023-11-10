import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//              CASOS DE PRUEBA
/*
  //mutante Horizontal
     ArrayList<String> horizontalMutant = new ArrayList<>(Arrays.asList(
                "ATCGTA",
                "ACTTGA",
                "CACTTA",
                "ACTGTC",
                "TACACC",
                "ATGCGC"));

  //mutante vertical
     ArrayList<String> verticalMutant = new ArrayList<>(Arrays.asList(
    "ATCGTA",
    "TCTTGA",
    "AAGGTC",
    "AGTGTT",
    "AATGCC",
    "ATGGGC"));


  //mutante daigonal
  ArrayList<String> diagonalMutant = new ArrayList<>(Arrays.asList(
    "ATCGTA",
    "ACTTGA",
    "CACTTA",
    "ACTGTC",
    "TACACC",
    "ATGCGC"));


    //mutante diagonal inversa
    ArrayList<String> reverseDiagMutant = new ArrayList<>(Arrays.asList(
    "AAACAG",
    "CCCTGC",
    "TTTGTT",
    "GGGATG",
    "AAATAA",
    "CCTTCC"));


    //mutante mixto
    ArrayList<String> mixedMutant = new ArrayList<>(Arrays.asList(
    "CAACAG",
    "CCCTGC",
    "CTTGTC",
    "CGGAAG",
    "AAACAA",
    "CCTTCC"));
 */

public class Parcial2Java {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        boolean leave = true;
        //bucle de ingreso de datos
        while (leave){
            boolean mutant;
            ArrayList<String> adn = new ArrayList<String>();
            //Mensaje de bienvenida

            System.out.println("Bienvenido Sr. Magneto");
            for (int i = 0; i < 6; i++){
                String entryRow = checkLetter("Ingrese la fila " + (i+1) + " de ADN. \nRecuerde que debe utilizar ('A', 'C', 'T', 'G'): " );
                adn.add(entryRow);
            }


            mutant = isMutant(adn);
            //mensaje de salida en caso de que sea o no mutante
            if (mutant){
                System.out.println("\n ¡MUTANTE! \n  El último adn ingresado es de un mutante");
            }else{
                System.out.println("\n Falsa alarma. \n  El adn ingresado no es de un mutante.");
            }

            //Pregunta si quiere seguir ingresando ADN
            while(true){
                System.out.println("Ingrese (1) para terminar y salir a pelear contra los X-Mens.\nIngrese (0) para seguir ingresando adn: \n");
                String hunt = sc.nextLine();
                if (hunt.equals("1")){
                    leave = false;
                    break;
                } else if (hunt.equals("0")) {
                    break;
                }
            }


        }//Fin del bucle de ingreso de datos
        System.out.println("saliendo...");


    }//Final del Main


    //Funciones/Métodos acá
    //verifica el input de ADN
    public static String checkLetter(String msg) {
        Scanner sc = new Scanner(System.in);
        boolean go = false;
        while (true) {

            System.out.println(msg);
            String letter = sc.nextLine().toUpperCase();
            //si la longitud no es 6 vuelve a pedir el input
            if (letter.length() != 6){
                System.out.println("Debe ingresar 6 letras");
            }else {
                //verifica en cada letra del input que sean A, C, T o G
                for (int i = 0; i < 6; i++) {
                    char letra = letter.charAt(i);
                    if (letra != 'A' && letra != 'C' && letra != 'T' && letra != 'G') {
                        go = false;
                        break;
                    }else{
                        go = true;
                    }
                }
            }
            //devuelve el input
            if (go){
                return letter;
            }
        }
    }//Fin de checkLetter

    //Funcion isMutant
    public static boolean isMutant(ArrayList<String> adn){
        //variables auxiliares
        int coincidence = 0;
        String a = "AAAA", c = "CCCC", t = "TTTT", g = "GGGG";

        //bloque comprobacion de filas
        for (int i = 0; i < 6; i++){

            // Busca en las filas si los primeros 4 caracteres son iguales
            if (Arrays.asList(a, c, t, g).contains(adn.get(i).substring(0, 4))){
                coincidence++;
            }
            // Busca en las filas si los 4 caracteres del medio son iguales
            else if (Arrays.asList(a, c, t, g).contains(adn.get(i).substring(1, 5))) {
                coincidence++;
            }
            // Busca en las filas si los últimos 4 caracteres son iguales
            else if (Arrays.asList(a, c, t, g).contains(adn.get(i).substring(2))) {
                coincidence++;
            }
        }

        //Bloque comprobacion columnas

        ArrayList<String> sum1Columnas = coluSum(adn, 0);
        ArrayList<String> sum2Columnas = coluSum(adn, 1);
        ArrayList<String> sum3Columnas = coluSum(adn, 2);
        ArrayList<String> totalColumn = new ArrayList<>();
        for (int i = 0; i < sum1Columnas.size();i++){
            totalColumn.add(sum1Columnas.get(i));
            totalColumn.add(sum2Columnas.get(i));
            totalColumn.add(sum3Columnas.get(i));
        }


        //verificar coincidencias
        for (String column : totalColumn){
            if (Arrays.asList(a, c, t, g).contains(column)){
                coincidence++;
            }
        }

        //Bloque comprobacion diagonales

        ArrayList<String> sum1Diag = diagSum(adn, 0);
        ArrayList<String> sum2Diag = diagSum(adn, 1);
        ArrayList<String> sum3Diag = diagSum(adn, 2);
        ArrayList<String> totalDiags = new ArrayList<>();

        //lenando totalDiags
        for (int i = 0; i < sum1Diag.size();i++){
            totalDiags.add(sum1Diag.get(i));
            totalDiags.add(sum2Diag.get(i));
            totalDiags.add(sum3Diag.get(i));
        }

        //Verificar coincidencias
        for (String diag : totalDiags){
            if (Arrays.asList(a, c, t, g).contains(diag)){
                coincidence++;
            }
        }

        //Bloque comprobacion diagonales inversas
        ArrayList<String> sum1InvDiag = invDiagSum(adn, 0);
        ArrayList<String> sum2InvDiag = invDiagSum(adn, 1);
        ArrayList<String> sum3InvDiag = invDiagSum(adn, 2);
        ArrayList<String> totalInvDiag = new ArrayList<>();

        //Llenando totalInvDiags
        for (int i = 0; i < sum1InvDiag.size();i++){
            totalInvDiag.add(sum1InvDiag.get(i));
            totalInvDiag.add(sum2InvDiag.get(i));
            totalInvDiag.add(sum3InvDiag.get(i));
        }

        //Verificar coincidencias
        for (String invDiag : totalInvDiag){
            if (Arrays.asList(a, c, t, g).contains(invDiag)){
                coincidence++;
            }
        }


        //Condicion de salida. Si las coincidencias son 2 o mas, es mutante.

        return coincidence >= 2;

    }//Fin de isMutant






    //valores de 4 carácteres en una lista de 6 filas
    public static ArrayList<String> coluSum(ArrayList<String> adn, int i){
        //Lista de ADN pero de 4 filas
        ArrayList<String> columsAdn = new ArrayList<String>(adn.subList(i, i + 4));
        //Lista de ADN pero de 4 elementos y 6 columnas
        ArrayList<String> sumColu = new ArrayList<>(Arrays.asList("","","","","",""));

        for (int j = 0; j < adn.size();j++){
            for (String row : columsAdn){
                //toma 1 elemento de cada columna, los junta y lo agregaa una lista
                sumColu.set(j, sumColu.get(j) + row.charAt(j));
            }
        }
        //Devuelve las columnas hechas filas de 4 carácteres de longitúd
        return sumColu;
    }//Fin coluSum


    public static ArrayList<String> diagSum(ArrayList<String> adn, int i){
        //Lista de ADN pero de 4 filas
        ArrayList<String> auxFilaAdn = new ArrayList<String>(adn.subList(i, i + 4));
        //variable de diagonales
        ArrayList<String> sumDiag = new ArrayList<>(Arrays.asList("","",""));
        //itera hasta la 3ra columna (máxima de diagonales de 4 carácteres)
        for (int j = 0; j < 3; j++){
            int aux = 0;
            for (String row : auxFilaAdn){
                sumDiag.set(j, sumDiag.get(j) + row.charAt(j+aux));
                aux++;
            }
        }
        return sumDiag;
    }//Fin diagSum

    public static ArrayList<String> invDiagSum(ArrayList<String> adn, int i){
        //Lista de ADN pero de 4 filas
        ArrayList<String> auxFilaAdn = new ArrayList<String>(adn.subList(i, i + 4));
        //variable de diagonales
        ArrayList<String> sumInvDiags = new ArrayList<>(Arrays.asList("","",""));
        for (int j = 2;j > -1; j--){
            int aux = 3;
            for (String row : auxFilaAdn){
                sumInvDiags.set(j, sumInvDiags.get(j) + row.charAt(j+aux));
                aux--;
            }
        }
        //devuelve las diagonales hechas filas de 4 carácteres de longitud
        return sumInvDiags;
    }//Fin invDiagsum

}//Fin del programa
