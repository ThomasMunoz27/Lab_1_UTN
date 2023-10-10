import java.util.*;

public class Tp7Java {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        //Ejercicio 1
        /*
        int [] unOrderNums = {5, 8, 18, 44, 95, 2};
        Arrays.sort(unOrderNums);
        for (int s : unOrderNums)
        System.out.println(s);
         */

        //Ejercicio 2
        /*
        Integer [] reverseNums = {1, 2, 3, 4, 5, 6};
        Arrays.sort(reverseNums, Collections.reverseOrder());
        for (int n : reverseNums){
            System.out.println(n);
        }
         */

        //Ejercicio 3
        /*
        float [] arrayNum = {2f,6f,7f,3f,1f,0f,10f};
        Arrays.sort(arrayNum);
        for(float item : arrayNum) System.out.println(item);

         */

        //Ejercicio 4
        /*
        double [] unOrderNums = {5.66, 8, 18, 44.44, 95, 2};
        Arrays.sort(unOrderNums);
        for (int i = unOrderNums.length -1; i >= 0; i--){
            System.out.println(unOrderNums[i]);
        }
         */

        //Ejercicio 5
        /*
        String [] strArray = {"Thomas", "Paula", "Eze", "Rodrigo", "Julieta", "Denis", "Uriel", "Zamora", "Ana", "Belén"};
Arrays.sort(strArray);
for(String s : strArray)
   System.out.println(s);
         */

        //Ejercicio 6
        /*
        String [] cadenas = {"Java" , "Pablo", "Thomas"};
        Arrays.sort(cadenas, Collections.reverseOrder());
        for(String item : cadenas) System.out.println(item);

         */

        //Ejercicio 9
        /*
        int [] bubbleInt = {4, 7, 2, 18, 92, 25, 44, 15};
        int i, j, aux;
        for (i = 0; i < bubbleInt.length - 1; i++){
            for (j = 0; j < bubbleInt.length - 1; j++){
                if (bubbleInt[j] > bubbleInt[j+1]){
                    aux = bubbleInt[j];
                    bubbleInt[j] = bubbleInt[j+1];
                    bubbleInt[j+1] = aux;
                }
            }
        }
        for(int s : bubbleInt)
            System.out.println(s);

         */

        //Ejercicio 10
        /*
        int [] array = {2,1,20,4,5,6,102};
        int aux, minimo;


        // Bucle externo: recorre todo el array excepto el último elemento
        for(int i = 0; i < array.length - 1 ; i++){
            minimo = i; // Suponemos que el elemento actual es el mínimo


            // Bucle interno: busca el índice del elemento mínimo en el subarray no ordenado
            for(int j = i + 1; j < array.length; j++){
                // Si encontramos un elemento más pequeño, actualizamos minimo
                if(array[j] < array[minimo]){
                    minimo = j;
                }
            }


            // Intercambio: colocamos el elemento mínimo en su posición correcta
            aux = array[i];
            array[i] = array[minimo];
            array[minimo] = aux;
        }


        // Imprimimos el array ordenado
        System.out.println(Arrays.toString(array));

         */

        //Ejercicio 11
        /*
        int [] inser = {30, 150, 2, 21, 44, 8};
        int aux, p, j;
        for (p = 1; p < inser.length; p++){
            aux = inser[p];
            j = p - 1;
            while((j >= 0) && (aux < inser[j])){
                inser[j + 1] = inser[j];
                j--;
            }
            inser[j + 1] = aux;
        }
        for (int n = 0; n <= 5; n++){
            System.out.println(inser[n]);
        }
         */
        //Ejercicio 12
        /*
        int [] A= new int [10];
        int i;
        System.out.println("LLENE ESTE ARRAY DE 10 ELEMENTOS CON NUMEROS ENTEROS");
        for (i=0;i<10;i++){
            System.out.println("Ingresar el valor del array en la posición "+ (i+1)+":");
            A[i]= sc.nextInt();
        }
        System.out.println("Array original:"+Arrays.toString(A));
        mergesort(A,0,(A.length-1));
        System.out.println("Array mezclado:"+Arrays.toString(A));
    }
    public static void mergesort(int[] A,int izq, int der){
        if (izq < der){
            int m=(izq+der)/2;
            mergesort(A,izq, m);
            mergesort(A,m+1, der);
            merge(A,izq, m, der);
        }
    }
    public static void merge(int[] A,int izq, int m, int der){
        int i, j, k;
        int [] B = new int[A.length]; //array auxiliar
        for (i=izq; i<=der; i++)      //copia ambas mitades en el array auxiliar
            B[i]=A[i];


        i=izq; j=m+1; k=izq;


        while (i<=m && j<=der) //copia el siguiente elemento más grande
            if (B[i]<=B[j])
                A[k++]=B[i++];
            else
                A[k++]=B[j++];


        while (i<=m)         //copia los elementos que quedan de la
            A[k++]=B[i++]; //primera mitad (si los hay)
         */

        //Ejercicio 13
        /*
        int[] arreglo1 = new int[10];
        for (int i = 0; i < 10; i++) {
            arreglo1[i] = (int) (Math.random() * 100);


        }


        System.out.println("Arreglo antes del ordenamiento: ");
        for (int i = 0; i < 10; i++) {
            System.out.print("["+arreglo1[i]+"]");


        }
        shell(arreglo1);
        System.out.println("");
        System.out.println("Arreglo después del ordenamiento: ");
        for (int i = 0; i < 10; i++) {
            System.out.print("["+arreglo1[i]+"]->");


        }




    }


    public static void shell(int [] arreglo1){
        int salto = 0;
        int temp = 0;
        int i = 0;
        boolean cambio;
        for (salto = arreglo1.length/2;salto != 0; salto /=2){
            cambio = true;
            while (cambio){
                cambio = false;
                for (i = salto; i < arreglo1.length;i++){
                    if (arreglo1[i-salto]> arreglo1[i]){
                        temp = arreglo1[i];
                        arreglo1[i] = arreglo1[i - salto];
                        arreglo1[i-salto] = temp;
                        cambio = true;
                    }
                }
            }


        }

         */
        //Ejercicio 14
        /*
        int[] array = new int[20];
        System.out.println("Ingrese 20 elementos enteros:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }


        //Solicitar como se desea ordenar el array ASCENDENTE O DESCENDENTE
        System.out.print("¿Cómo desea ordenar el array? (ASCENDENTE o DESCENDENTE): ");
        String tipoOrdenamiento = sc.next();


        //Método de ordenamiento a aplicar(inserción, burbuja, selección)
        System.out.print("Seleccione el método de ordenamiento (inserción, burbuja, selección): ");
        String metodoOrdenamiento = sc.next();


        if (tipoOrdenamiento=="ASCENDENTE") {
            if (metodoOrdenamiento=="inserción") {
                ordenarInsercionAscendente(array);
            } else if (metodoOrdenamiento=="burbuja") {
                ordenarBurbujaAscendente(array);
            } else if (metodoOrdenamiento=="selección") {
                ordenarSeleccionAscendente(array);
            } else {
                System.out.println("Método de ordenamiento no válido.");
                return;
            }
        } else if (tipoOrdenamiento=="DESCENDENTE") {
            if (metodoOrdenamiento=="inserción") {
                ordenarInsercionDescendente(array);
            } else if (metodoOrdenamiento=="burbuja") {
                ordenarBurbujaDescendente(array);
            } else if (metodoOrdenamiento=="selección") {
                ordenarSeleccionDescendente(array);
            } else {
                System.out.println("Método de ordenamiento no válido.");
                return;
            }
        } else {
            System.out.println("Tipo de ordenamiento no válido.");
            return;
        }


        // Mostrar el array original y el resultado ordenado
        System.out.println("Array original:");
        mostrarArray(array);
    }


    // Función para mostrar un array
    public static void mostrarArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    // Funciones para ordenar el array ascendente y descendente usando los tres métodos de ordenamiento
    public static void ordenarInsercionAscendente(int[] A) {
        // Implementar el algoritmo de inserción ascendente
        int p, j;
        int aux;
        for (p = 1; p < A.length; p++) { // desde el segundo elemento hasta
            aux = A[p];           // el final, guardamos el elemento y
            j = p - 1;            // empezamos a comprobar con el anterior
            while ((j >= 0) && (A[j]>aux)) { // mientras queden posiciones y el
                // valor de aux sea menor que los
                A[j + 1] = A[j];   // de la izquierda, se desplaza a
                j--;               // la derecha
            }
            A[j + 1] = aux;
        }
    }


    public static void ordenarInsercionDescendente(int[] A) {
        // Implementar el algoritmo de inserción descendente
        int p, j;
        int aux;
        for (p = 1; p < A.length; p++) { // desde el segundo elemento hasta
            aux = A[p];           // el final, guardamos el elemento y
            j = p - 1;            // empezamos a comprobar con el anterior
            while ((j >= 0) && (A[j]< aux)) { // mientras queden posiciones y el
                // valor de aux sea menor que los
                A[j + 1] = A[j];   // de la izquierda, se desplaza a
                j--;               // la derecha
            }
            A[j + 1] = aux;
        }
    }


    public static void ordenarBurbujaAscendente(int[] A) {
        // Implementar el algoritmo de burbuja ascendente
        int i, j, aux;
        for (i = 0; i < A.length - 1; i++) {
            for (j = 0; j < A.length - i - 1; j++) {
                if (A[j + 1] < A[j]) {
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                }
            }
        }
    }


    public static void ordenarBurbujaDescendente(int[] A) {
        // Implementar el algoritmo de burbuja descendente
        int i, j, aux;
        for (i = 0; i < A.length-1 ; i++) {
            for (j = 0; j < A.length - i - 1; j++) {
                if (A[j + 1] > A[j]) {
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                }
            }
        }
    }


    public static void ordenarSeleccionAscendente(int[] A) {
        // Implementar el algoritmo de selección ascendente
        int i, j, menor, pos, tmp;
        for (i = 0; i < A.length - 1; i++) {      // tomamos como menor el primero
            menor = A[i];                       // de los elementos que quedan por ordenar
            pos = i;                            // y guardamos su posición
            for (j = i + 1; j < A.length; j++){ // buscamos en el resto
                if (A[j] < menor) {           // del array algún elemento
                    menor = A[j];             // menor que el actual
                    pos = j;
                }
            }
            if (pos != i){                      // si hay alguno menor se intercambia
                tmp = A[i];
                A[i] = A[pos];
                A[pos] = tmp;
            }
        }
    }


    public static void ordenarSeleccionDescendente(int[] A) {
        // Implementar el algoritmo de selección descendente
        int i, j, mayor, pos, tmp;
        for (i = 0; i < A.length - 1 ; i++) {      // tomamos como menor el primero
            mayor = A[i];                       // de los elementos que quedan por ordenar
            pos = i;                            // y guardamos su posición
            for (j = i + 1; j < A.length; j++){ // buscamos en el resto
                if (A[j] > mayor) {           // del array algún elemento
                    mayor = A[j];             // menor que el actual
                    pos = j;
                }
            }
            if (pos != i){                      // si hay alguno menor se intercambia
                tmp = A[i];
                A[i] = A[pos];
                A[pos] = tmp;
            }


        }

         */
}
}
