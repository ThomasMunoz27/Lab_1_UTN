import java.util.Locale;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
    public class ActRepasoArray {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in).useLocale(Locale.US);
            //Parte 1
        /*
        //Ejercicio 1
        int [] array = new int[10];


        for(int i = 0; i < 10; i++){
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));

         */

            //Ejercicio 2
        /*
        double[] prime = new double[10];
        int count = 0, num = 2;


        while (count < 10) {
            if (esPrimo(num)) {
                prime[count] = num;
                count++;
            }
            num++;
        }
        for (int i = 0; i < prime.length; i++) {
            System.out.println(prime[i]);
        }
    }

    //Funcion para verificar primos
    public static boolean esPrimo(int number){
        if (number <= 1) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(number); i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;

         */

            //Ejercicio 3
        /*
        int [][] array = new int[10][10];

        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                array[i][j] = j + 1;
            }
        }
        System.out.println(Arrays.deepToString(array));
         */

            //Ejercicio 4
        /*
        boolean [] boolArray = {true, false, false, true, true, false};
        for (int i = 0; i < boolArray.length; i++){
            System.out.println(boolArray[i]);
        }
         */


            //Parte 2
            //Ejercicio 1
        /*
        int [] array= new int [10];
        int i;
        for (i=0;i<10;i++){
           System.out.println("Ingresar el valor del array en la posición "+ (i+1)+":");
           array[i]= sc.nextInt();
       }
        System.out.println(Arrays.toString(array));
         */

            //Ejercicio 2
        /*
        double [] realArray = new double[10];
        for (int i = 0; i < 10; i++){
            System.out.println("Ingrese el valor de la posición " + (i+1) + " en el array");
            realArray[i] = sc.nextDouble();
        }
        for (int j = 0; j < 10; j++){
            System.out.println(realArray[j]);
        }

         */

            //Ejercicio 3
        /*
        char [] arrayChar = {'a', 'b', 'c', 't', 'p', 'o'};
        for (char c : arrayChar)
            System.out.println(c);

         */

            //Ejercicio 4
        /*
        boolean [] boolArray = {true, false, false, true, true, false};
        for (int i = 0; i < boolArray.length; i++){
            System.out.println(boolArray[i]);
        }

         */

            //Parte 3
            //Ejercicio 1
        /*
        int [] sumArray = {1, 5, 8, 2, 10, 44};
        int [] sumAraay2 = {4, 6, 77, 44, 25, 2};
        for (int i = 0; i < sumArray.length; i++){
            System.out.println(sumArray[i] + sumAraay2[i]);
        }
         */

            //Ejercicio 2
        /*
        double [] multArray = {1, 5, 8, 2, 10, 44};;
        double [] multArray2 = {4, 6, 77, 44, 25, 2};
        for (int i = 0; i < multArray2.length; i++){
            System.out.println(multArray2[i] * multArray[i]);
        }
         */

            //Ejercicio 3
        /*
        int [] unOrderAraay = {4, 6, 77, 44, 25, 2};
        Arrays.sort(unOrderAraay);
        for (int s : unOrderAraay)
            System.out.println(s);

         */

            //Ejercicio 4
        /*
        String [] unOrderAraay = {"a", "e", "p", "z", "s", "q"};
        Arrays.sort(unOrderAraay);
        for (String s : unOrderAraay)
            System.out.println(s);
         */

            //Parte 4
            //Ejercicio 1
        /*
        int [] array= new int [10];
        int i;
        System.out.println("LLENE ESTE ARRAY DE 10 ELEMENTOS CON NUMEROS ENTEROS");
        for (i=0;i<10;i++){
            System.out.println("Ingresar el valor del array en la posición "+ (i+1)+":");
            array[i]= sc.nextInt();
        }
        System.out.println("Array:"+Arrays.toString(array));
        System.out.println("Cantidad de números pares son: "+(pares(array)));
    }
        public static int pares(int []array) {
            int i;
            int contador = 0;
            int n = array.length;
            for (i = 0; i < n; i++) {
                if (array[i] % 2 == 0) {
                    contador += 1;
                }
            }
            return contador;
        }

         */
            //Ejercicio 2
        /*
        double [] array= new double [10];
        int i;
        System.out.println("LLENE ESTE ARRAY DE 10 ELEMENTOS CON NUMEROS REALES");
        for (i=0;i<10;i++){
            System.out.println("Ingresar el valor del array en la posición "+ (i+1)+":");
            array[i]= sc.nextDouble();
        }
        System.out.println("Array:"+Arrays.toString(array));
        System.out.println("Cantidad de numeros mayores a 10: "+(mayoresADiez(array)));
    }
        public static int mayoresADiez(double []array) {
            int i;
            int contador=0;
            int n = array.length;
            for (i = 0; i < n; i++) {
                if (array[i] > 10) {
                    contador+=1;
                }
            }
            return contador;
        }

         */

            //Ejercicio 3
/*
        int[] mlt3Array = {5, 2, 9, 99, 16, 5, 3, 55, 75, 24};
        int sum = sumMult3(mlt3Array);

        System.out.println(sum);
    }
        public static int sumMult3 ( int[] mlt3Array){
            int s = 0;
            for (int i = 0; i < mlt3Array.length; i++) {
                if (mlt3Array[i] % 3 == 0) {
                    s += mlt3Array[i];
                }
            }
            return s;
        }

 */


            //Ejercicio 4
/*
        int [] array= new int [10];
        int i;
        System.out.println("LLENE ESTE ARRAY DE 10 ELEMENTOS");
        for (i=0;i<10;i++){
            System.out.println("Ingresar el valor del array en la posición "+ (i+1)+":");
            array[i]= sc.nextInt();
        }
        System.out.println("Array:"+Arrays.toString(array));
        System.out.println("Elemento de mayor valor: "+(maximo(array)));
    }
        public static int maximo(int []array) {
            int i;
            int maximo=0;
            int n = array.length;
            for (i = 0; i < n; i++) {
                if (array[i]>maximo) {
                    maximo=array[i];
                }
            }
            return maximo;

 */
            //Ejercicio 5
            /*
            String[] stringArray = {"o", "e", "p", "z", "s", "q"};
            String orderArrayString;
            orderArrayString = ordenarArray(stringArray);
            System.out.println(orderArrayString);
        }
            public static String ordenarArray (String []stringArray) {
                String elemento = "";
                Arrays.sort(stringArray);
                elemento = stringArray[0];
            return elemento;
            }

             */

            //Ejercicio 6
            int[] arrayOrigen = {1, 2, 3, 4, 5};
            int[] arrayDestino = new int[arrayOrigen.length];

            copiarArray(arrayOrigen, arrayDestino);

            System.out.print("Array de origen: ");
            for (int num : arrayOrigen) {
                System.out.print(num + " ");
            }

            System.out.print("\nArray de destino: ");
            for (int num : arrayDestino) {
                System.out.print(num + " ");
            }


        }
        public static void copiarArray(int[] origen, int[] destino) {
            if (origen.length != destino.length) {
                throw new IllegalArgumentException("Los arrays deben tener la misma longitud");
            }

            for (int i = 0; i < origen.length; i++) {
                destino[i] = origen[i];
            }

        }
    }


