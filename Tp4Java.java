import java.util.Locale;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
public class Tp4Java {
    public static void main(String[] args){Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        //Ejercico 1
        /*
        int [] numbers= new int[10];
        int evenNum, oddNum, even, odd;
        evenNum=0;
        oddNum=0;
        even=0;
        odd=0;
        System.out.println("Ingresa 10 números");
        for(int i = 1; i <= 10; i++ ){
            numbers[i-1]= sc.nextInt();
            if(numbers[i-1]>=0){
                evenNum+=numbers[i-1];
                even+=1;
            } else{
                oddNum+=numbers[i-1];
                odd+=1;
            }
        }
        System.out.println("Los números ingresados fueron: "+ Arrays.toString(numbers));
        System.out.println("El promedio de los números positivos: "+ evenNum/even);
        System.out.println("El promedio de los números negativos: "+ oddNum/odd);
         */

    //Ejercicio 2
        /*
        int [] array = new int[10];
        int suma = 0;
        int contador = 0;
        for( int i = 0;  i < 10; i++){
            System.out.println("Ingresa el numero de la posicion " + i);
            array[i] = sc.nextInt();
        }
        for(int i = 0; i < 10; i++){
            if(i % 2 != 0){
                suma += array[i];
                contador += 1;
            }
        }
        System.out.println("La media de los numeros en las posiciones impares del array es: " + suma / contador);

         */

    //Ejercicio 3
        /*
        System.out.println("Ingrese la cantidad de estudiantes");
        int cantStudents = sc.nextInt(), i;
        double studentMarks[], markSum = 0, average;
        studentMarks = new double[cantStudents];
        for(i = 0; i < cantStudents; i++) {

            int aux = 1;
            do {
                System.out.println("Ingrese la nota del alumno " + (i + 1));
                studentMarks[i] = sc.nextDouble();
                if (studentMarks[i] <= 10 && studentMarks[i] > 0){
                    markSum += studentMarks[i];
                    aux -= 1;
                }else {
                    System.out.println("Ingrese una nota válida");

                }
            }while (aux == 1);

        }
        average = markSum / cantStudents;
        System.out.println("La media de notas es de " + average);
        for (i = 0; i < cantStudents; i++){
            if (studentMarks[i] > average){
                System.out.println("El alumno " + i + " consiguió superar la media de notas, con nota " + studentMarks[i]  );
            }
        }
         */

        //Ejercicio 4
        /*
        int [] pares = new int [20];
        int i, j;
        for (i = 0; i<20; i++){
            pares[i] = i*2;
        }
        for (j = 0; j<20; j++){
            System.out.println("Número par " + (j+1) + " = " + pares[j]);
        }

         */

        //Ejercicio 5
        /*
        int [] nums = new int [10];
        int i, even = 0, neg = 0, cero = 0;
        for(i = 0; i < 9; i++){
            System.out.println("Ingrese el número "+ (i+1));
            nums[i] = sc.nextInt();
        }
        for(i = 0; i < 9; i++){
            if (nums[i] == 0){
                cero += 1;
            } else if (nums[i] < 0) {
                neg += 1;
            } else if (nums[i] % 2 == 0) {
                even += 1;
            }
        }
        System.out.println("Se ingresaron "+ even + " números pares " + neg + " números negativos y "+ cero + " ceros");

         */

        //Ejercicio 6
        /*
        int [] array = new int[10];
        int possitive_sum = 0;
        int negative_sum = 0;
        int counter = 0;
        for(int i = 0; i < 10; i++){
            String message = String.format("Ingresa el numero entero para la posicion [%d]", i+1);
            System.out.println(message);
            array[i] = sc.nextInt();
        }
        for (int j : array) {
            if (j < 0) {
                negative_sum += j;
            } else {
                possitive_sum += j;
            }
            counter += 1;
        }
        System.out.println("Promedio de números positivos: "+ (possitive_sum / counter));
        System.out.println("Promedio de números negativos: "+ (negative_sum / counter));
         */

        //Ejercicio 7
        /*int objetoCuenta = 50;
         int prefijoValor = ++objetoCuenta;
        int sufijoValor = objetoCuenta++;
        System.out.println("Objeto:"+ objetoCuenta + "prefijo: " + prefijoValor + "sufijo: " + sufijoValor);
         */
         //Ejercicio 8
        /*
                String [] nombres= new String[5];
       double [] sueldos= new double[5];
       int i;
       double mayorSueldo=0;
       int empleado=0;
       for (i=0;i<5;i++){
           System.out.println("Nombre del empleado:");
           nombres[i]= sc.nextLine();
           System.out.println("Sueldo:");
           sueldos[i]=sc.nextDouble();
           sc.nextLine();
           if (sueldos[i]>mayorSueldo){
               mayorSueldo=sueldos[i];
               empleado=i;
           }
       }
       System.out.println("El empleado que más gana es "+ nombres[empleado]+" y gana "+mayorSueldo);

         */



        //Ejercicio 9
        /*
        Random rand = new Random();
        int [] arr=new int [5];
        int i;
        for (i=0;i<arr.length;i++){
            arr[i]= rand.nextInt(100-0+1)+1;
        }
        System.out.println(Arrays.toString(arr));

         */



    //Ejercicio 10
        /*
        System.out.println("Ingresa la primer dimension de las matrices");
        int n1 = sc.nextInt();
        System.out.println("Ingresa la segunda dimension de las matrices");
        int n2 = sc.nextInt();
        int[][] matrizA = new int [n1][n2];
        int [][] matrizB = new int [n1][n2];
        int [][] matrizC = new int [n1][n2];


        // Rellenamos la primer matriz


        for(int i = 0; i < n1; i++){
            for (int j = 0;  j < n2; j++){
                System.out.printf("Ingresa numero para la posicion[%d][%d] de la matriz A:%n", i, j);
                matrizA[i][j] = sc.nextInt();
            }
        }


        // Rellenamos la segunda matriz


        for(int i = 0; i < n1; i++){
            for (int j = 0;  j < n2; j++){
                System.out.printf("Ingresa numero para la posicion[%d][%d] de la matriz B:%n", i, j);
                matrizB[i][j] = sc.nextInt();
            }
        }




        // Rellenamos la matriz C, con la suma de la matriz A y la matriz B


        for(int i = 0; i < n1; i++){
            for(int j = 0; j < n2; j++){
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        System.out.println("Matriz A");
        System.out.println(Arrays.deepToString(matrizA));
        System.out.println("Matriz B");
        System.out.println(Arrays.deepToString(matrizB));
        System.out.println("Matriz C");
        System.out.println(Arrays.deepToString(matrizC));

         */



        //B
        /*
        System.out.println("Ingrese el número de filas:");
        int filas = leerEntero(sc);


        System.out.println("Ingrese el número de columnas:");
        int columnas = leerEntero(sc);


        int[][] matrizA = crearMatriz(filas, columnas);
        llenarMatriz(matrizA, "A", sc);


        int[][] matrizB = crearMatriz(filas, columnas);
        llenarMatriz(matrizB, "B", sc);


        System.out.println("Matriz A:");
        mostrarMatriz(matrizA);


        System.out.println("Matriz B:");
        mostrarMatriz(matrizB);


        int[][] matrizC = sumarMatrices(matrizA, matrizB);


        System.out.println("Matriz resultante de la suma:");
        mostrarMatriz(matrizC);
    }


    public static int leerEntero(Scanner sc) {
        return sc.nextInt();
    }


    public static int[][] crearMatriz(int filas, int columnas) {
        return new int[filas][columnas];
    }


    public static void llenarMatriz(int[][] matriz, String nombre, Scanner sc) {
        System.out.println("Ingrese la matriz " + nombre + ":");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.printf("Ingresa número para la posición [%d][%d] de la matriz %s:%n", i, j, nombre);
                matriz[i][j] = leerEntero(sc);
            }
        }
    }


    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static int[][] sumarMatrices(int[][] matrizA, int[][] matrizB) {
        int filas = matrizA.length;
        int columnas = matrizA[0].length;
        int[][] resultado = new int[filas][columnas];


        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        return resultado;
         */

        /*
        //Ejercicio 11
        //crear matriz original de 2 filas y 3 columnas
        int[][] M = new int[2][3];

        //lectura de datos por teclado
        leerDatos(M);

        //mostrar matriz original
        System.out.println("Matriz original");
        mostrarMatriz(M);

        //calcular la matriz transpuesta
        int [][] T = matrizTranspuesta(M);

        //mostrar matriz transpuesta
        System.out.println("Matriz transpuesta");
        mostrarMatriz(T);

    }

    //método para introducir datos a la matriz desde teclado
    public static void leerDatos(int[][] M) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lectura de datos de la matriz:");
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                System.out.print("Elemento[" + i + "][" + j + "]=");
                M[i][j] = sc.nextInt();
            }
        }
    }

    //método para obtener la transpuesta de una matriz
    public static int[][] matrizTranspuesta(int[][] a) {
        //creamos la matriz transpuesta
        //el número de filas será igual al número de columnas de la matriz original
        //el número de columnnas será igual al número de filas de la matriz original
        int[][] t = new int[a[0].length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                t[j][i] = a[i][j];
            }
        }
        return t;
    }

    //método para mostrar una matriz por pantalla
    public static void mostrarMatriz(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.printf("%5d", A[i][j]);
            }
            System.out.println();
        }

         */

    }

}


