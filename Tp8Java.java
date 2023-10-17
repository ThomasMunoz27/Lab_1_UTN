import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class Tp8Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Ejercicio 1
        /*
        int [][] matrizA = {{1,2,3},{1,2,3,}};
        int [][] matrizB = {{1,2,3},{1,2,3,}};


        int [][] resultado = miMetodo(matrizA,matrizB);
        System.out.println(Arrays.deepToString(resultado));


    }
    public static int[][] miMetodo(int[][] matrizA, int[][] matrizB) {
        int filas = matrizA.length;
        int columnas = matrizA[0].length;
        int [][] matrizC = new int[filas][columnas];
        if(matrizA.length == matrizB.length){
            for(int i = 0; i < filas; i++){
                for (int j = 0; j < columnas; j++ ){
                    matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
                }
            }
            return matrizC;
        }
        return matrizC;
    }

         */
        // Ejercicio 2
        /*
        int[][] firstMatriz = {{5, 6, 8}, {9, 7, 3}};
        int[][] secondMatriz = {{5, 3}, {2,1}, {5, 8}};
        int[][] result = multMatriz(firstMatriz, secondMatriz);
        for(int i = 0; i < result.length; i++){
            for(int j = 0; j < result[0].length; j++) {
                System.out.println(result[i][j] + " ");
            }
        }
    }
    public static int[][] multMatriz(int[][] m1, int[][] m2) {
        int [][] mResult = new int[2][3];
        for(int i = 0; i < 2; i++){
            int sum = 0;
            for(int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    sum += m1[i][k] * m2[k][j];
                }
                mResult[i][j] = sum;
            }
        }
        return mResult;
    }
*/

        //Ejercicio 3
        /*
        int filas=3;
        int columnas =3;
        int [][] matriz=new int [filas][columnas];
        int i,j;
        for (i=0;i<filas;i++){
            for (j=0;j<columnas;j++){
                System.out.println("Ingresar el valor en la posicion "+i+","+j+": ");
                matriz[i][j]=sc.nextInt();
            }
        }
        System.out.println("MATRIZ");
        for (i=0;i<filas;i++){
            for (j=0;j<columnas;j++){
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println();
        }
        int transpuesta[][]=matrizTranspuesta(matriz,filas,columnas);
        System.out.println("MATRIZ TRANSPUESTA");
        for (i=0;i<filas;i++){
            for (j=0;j<columnas;j++){
                System.out.print(transpuesta[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static int[][] matrizTranspuesta(int [][] matriz,int filas, int columnas){
        int i,j;
        int [][]matrizT=new int [filas][columnas];
        for (i=0;i<filas;i++){
            for (j=0;j<columnas;j++){
                matrizT[i][j]=matriz[j][i];
            }
        }
        return matrizT;
    }

         */

        //Ejercicio 4
        /*
        int filas = 3;
        int columnas = 3;
        int[][] matriz = {{1, 2, 3}, {2, 4, 5}, {3, 5, 6}};
        if (matrizSimetrica(matriz,filas,columnas)){
            System.out.println("MATRIZ SIMETRICA");
        }else {
            System.out.println("MATRIZ NO SIMETRICA");
        }
    }
    public static boolean matrizSimetrica(int [][] matriz, int filas, int columnas){
        if (filas != columnas){
            return false;
        }
        for (int i=0;i<filas;i++){
            for (int j=0;j<columnas;j++){
                if (matriz[i][j]!=matriz [j][i]){
                    return false;
                }
            }
        }
        return true;
    }

         */

        //Ejercicio 5
        /*
        int[] vector = {1, 2, 3, 4};
        System.out.println("Ingresa un valor:");
        double number = sc.nextDouble();


        double[] result = productScale(vector, number);


        // Imprimir el resultado
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }


    public static double[] productScale(int[] vector, double escalar) {
        int n = vector.length;
        double[] result = new double[n];
        for (int i = 0; i < n; i++) {
            result[i] = vector[i] * escalar;
        }
        return result;
    }

         */


        //Ejercicio 6
        /*
        int matriz [][] = {{1,2,3},{4,5,6},{7,8,9}};
        int total = 0;
        System.out.println("La suma total de los elementos de la matriz es: " + Sum(matriz));
    }


    public static int Sum(int[][] matriz){
        int sum = 0;
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                sum = sum + matriz[i][j];
            }
        }
        return sum;
    }

         */

        //Ejercicio 7
        /*
        int matriz [][] = {{9,2,3},{44,5,6},{7,8,11}};
        int total = 0;
        Max(matriz);
    }

    public static void Max(int[][] matriz){
        int max = matriz[0][0];
        int index = 0;
        int index2 = 0;
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){

                if ( matriz[i][j] > max){
                    max = matriz[i][j];
                    index2 = index;
                }
                index = index + 1;
            }
        }
        System.out.println("El elemento máximo de la matriz es:  " + max);
        System.out.println("Y la posición del elemento es: " + index2);

    }

         */

        //Ejercicio 8
        /*
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int row, suma;
        System.out.println(Arrays.deepToString(matriz));
        System.out.println("¿Que fila de números desea sumar?(1, 2 o 3)");
        row = sc.nextInt() - 1;
        suma = sumarFila(row, matriz);
        System.out.println(suma);
    }

    public static int sumarFila(int fila, int[][] matriz) {
        int preSuma = 0;
    for (int i = 0; i < matriz.length; i++){
        preSuma += matriz[fila][i];
    }
    return  preSuma;
    }

         */

        //Ejercicio 10
        /*
        int n = 5;
        int[][] matrix = id(n);


        for (int m = 0; m < 5; m++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrix[m][j]);
            }
            System.out.println();
        }
    }


    public static int[][] id(int n) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }
         */

        //Ejercicio 11
        /*
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[] counts = countEvenOddNumbers(matriz);

        System.out.println("Números pares: " + counts[0] + " Números impares: " + counts[1]);
    }

    public static int[] countEvenOddNumbers(int[][] matrix) {
        int evenCount = 0, oddCount = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
        }

        return new int[] { evenCount, oddCount };
    }
         */

        //Ejercicio 12
        /*
        int[][] matriz = {{1, 2, 3}, {4, 5, 5}, {9, 8, 6}};
        int filas = matriz.length;
        int columnas = matriz[0].length;
        System.out.println("MATRIZ ORIGINAL");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < filas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("MATRIZ GIRADA 90°");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < filas; j++) {
                System.out.print(girarMatriz(matriz)[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] girarMatriz(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] matrizGirada = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < filas; j++) {
                matrizGirada[j][filas - 1 - i] = matriz[i][j];
            }
        }
        return matrizGirada;
    }


         */

        //Ejercicio 13
        /*
        int[][] matriz = {{1, 2, 3}, {4, 5, 5}, {9, 8, 6}};
        int encontrar=5;
        System.out.println("El numero "+encontrar+ " aparece "+ encontrarNumero(matriz,encontrar)+" veces en la matriz");
    }
    public static int encontrarNumero(int [][] matriz, int numero){
        int filas= matriz.length;
        int columnas=matriz[0].length;
        int contador=0;
        for (int i=0;i<filas;i++){
            for (int j=0;j<columnas;j++){
                if (matriz[i][j]==numero){
                    contador+=1;
                }
            }
        }
        return contador;
    }

         */


        //Ejercicio 14
        /*
        Integer [][] matrizNoInv = {{1,2,3},{4,5,6},{7,8,9}};
        Integer [][] matrizInv = new Integer[3][3];
        matrizInv = invertirFilas(matrizNoInv);
        System.out.println(Arrays.deepToString(matrizInv));
    }
    public static Integer[][] invertirFilas(Integer [][] matrizAInv) {
    for (int i = 0; i < matrizAInv.length; i++){
        int izquierda = 0;
        int derecha = matrizAInv[i].length - 1;
        while (izquierda < derecha) {
            Integer temp = matrizAInv[i][izquierda];
            matrizAInv[i][izquierda] = matrizAInv[i][derecha];
            matrizAInv[i][derecha] = temp;
            izquierda++;
            derecha--;
        }
    }
        return matrizAInv;
    }

         */
        //Ejercicio 15
        /*
        int [][] matrizNormal = {{1,2,3},{4,5,6},{7,8,9}};
        int sumaDiagonal = diagonal(matrizNormal), sumaDiagonalInv = diagonalInv(matrizNormal);
        int totalSum = sumaDiagonal + sumaDiagonalInv;
        System.out.println("La suma de la diagonal es: " + sumaDiagonal);
        System.out.println("La suma de la diagonal inversa es: " + sumaDiagonalInv);
        System.out.println("La suma de las 2 diagonales es: " + totalSum);
    }
    public static int diagonal(int [][] matriz){
        int sum = 0;
        for (int i = 0; i < matriz.length; i++){
            sum += matriz[i][i];
        }
        return sum;
    }

    public static int diagonalInv(int [][] matriz){
        int sum = 0;
        for (int i = 0; i < matriz.length; i++){
            sum += matriz[i][matriz.length - 1 - i];
        }
        return sum;
    }

         */

        //Ejercicio 16
        /*
        int[][] matrizOrtogonal = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };

        int[][] matrizNoOrtogonal = {
                {1, 0, 0},
                {0, 1, 1},
                {0, 0, 1}
        };

        boolean esOrtogonal1 = esMatrizOrtogonal(matrizOrtogonal);
        boolean esOrtogonal2 = esMatrizOrtogonal(matrizNoOrtogonal);

        System.out.println("La primera matriz es ortogonal: " + esOrtogonal1);
        System.out.println("La segunda matriz es ortogonal: " + esOrtogonal2);
    }
    public static boolean esMatrizOrtogonal(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        // Verificar si la matriz no es cuadrada
        if (filas != columnas) {
            return false;
        }

        // Calcular la transpuesta de la matriz
        int[][] transpuesta = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[i][j] = matriz[j][i];
            }
        }

        // Calcular la inversa de la matriz
        int[][] inversa = new int[filas][columnas];
        // Puedes implementar la lógica para calcular la inversa aquí, o utilizar una librería de álgebra lineal si es necesario

        // Verificar si la transpuesta es igual a la inversa
        if (Arrays.deepEquals(transpuesta, inversa)) {
            return true;
        }

        return false;
    }


         */


    //Ejercicio 17
        /*
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6}};


        ArrayList<Integer> maximosPorFila = obtenerMaximosPorFila(matriz);


        // Imprimir los máximos
        System.out.println(maximosPorFila);
    }


    public static ArrayList<Integer> obtenerMaximosPorFila(int[][] matriz) {
        ArrayList<Integer> maximos = new ArrayList<>();


        for (int i = 0; i < matriz.length; i++) {
            int maximoFila = matriz[i][0];
            for (int j = 1; j < matriz[i].length; j++) {
                if (matriz[i][j] > maximoFila) {
                    maximoFila = matriz[i][j];
                }
            }
            maximos.add(maximoFila);
        }



        return maximos;
    }

         */

    //Ejercicio 18
        /*
        int[][] matrizA = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] matrizB = {
                {7, 8},
                {9, 10},
                {11, 12}
        };

        int[][] resultado = productoDeMatrices(matrizA, matrizB);

        if (resultado == null) {
            System.out.println("La multiplicación no es posible. Se ha devuelto una matriz nula.");
        } else {
            // Imprimir la matriz resultante
            for (int[] fila : resultado) {
                for (int elemento : fila) {
                    System.out.print(elemento + " ");
                }
                System.out.println();
            }
        }
    }

    public static int[][] productoDeMatrices(int[][] matrizA, int[][] matrizB) {
        int filasA = matrizA.length;
        int columnasA = matrizA[0].length;
        int filasB = matrizB.length;
        int columnasB = matrizB[0].length;

        if (columnasA != filasB) {
            return null; // La multiplicación no es posible
        }

        int[][] resultado = new int[filasA][columnasB];

        for (int i = 0; i < filasA; i++) {
            for (int j = 0; j < columnasB; j++) {
                int suma = 0;
                for (int k = 0; k < columnasA; k++) {
                    suma += matrizA[i][k] * matrizB[k][j];
                }
                resultado[i][j] = suma;
            }
        }

        return resultado;
    }

         */
}



