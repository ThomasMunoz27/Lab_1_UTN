package Tp11Part1;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
public class MainTp11 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        //Ejercicio 1
        ArrayList<String> marcasAutos = new ArrayList<>();


        while (true){
            System.out.println("Ingresa [1] para ingresar  marcas [2] para dejar de ingresar marcas de autos");
            int op = sc.nextInt();
            sc.nextLine(); // Limpiar el carácter de nueva línea
            if (op == 2){
                System.out.println(marcasAutos);
                break;
            }else{
                System.out.println("Ingresa una marca auto");
                String marcaAuto = sc.nextLine();
                marcasAutos.add(marcaAuto);


            }
        }

        //Ejercicio 2
        equipoFutbol e1 = new equipoFutbol();
        int opcion;
        do {
            System.out.println("Que desea realizar?");
            System.out.println("(1) Mostrar Jugadores del equipo");
            System.out.println("(2) Agregar Jugadores al Equipo");
            System.out.println("(3) Eliminar Jugador del equipo");
            System.out.println("(0) Para finalizar y salir");
            System.out.println(" :");
            opcion = sc.nextInt();

            if (opcion == 1){
                e1.mostrarJugadores();
            } else if (opcion == 2) {
                e1.agregarJugadores();
            } else if (opcion == 3) {
                e1.eliminarJugadores();
            }

        }while (opcion != 0 );

        //Ejercicio 4
        ArrayList<Double> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean flag_1 = true;  // variables que utilizo de referencia


        // Leer 20 números decimales ingresados por el usuario
        for (int i = 0; i < 20; i++) {
            System.out.print("Ingrese un número decimal en la posición " + (i+1) + ": ");
            double numero = scanner.nextDouble();
            numeros.add(numero);
        }


        // Encontrar el mayor y el menor
        //inicializo las variables java con valores x.
        double mayor = 0;
        double menor = 0;
        //for-each
        for (double numero : numeros) {
            //Acá inicializo las variables con el menor y el mayor, correspondientes al primer elemento ingresado en el
            //arrayList. ESto solo se va a ejecutar una sola vez.
            if (flag_1){
                mayor = numero;
                menor = numero;
                flag_1 = false;
            }

            if (numero > mayor) {
                mayor = numero;
            }


            if (numero < menor) {
                menor = numero;
            }
        }


        // Calcular el rango
        double rango = mayor - menor;


        // Mostrar los resultados
        System.out.println("El mayor número es: " + mayor);
        System.out.println("El menor número es: " + menor);
        System.out.println("El rango es: " + rango);


        //Ejercicio 5
        Random random = new Random();
        ArrayList<Integer> numerosAleatorios = new ArrayList<Integer>();


        //Llenar array con numeros aleatorios
        for (int i = 0; i < 20; i++) {
            int numero = random.nextInt(100);
            if (numero % 2 == 0) {
                numerosAleatorios.add(numero);
            }else{
                i--;
            }
        }
        System.out.println("ARRAY:"+numerosAleatorios);


        //Sacar promedio aritmetrico
        int suma=0;
        for(int i=0;i<numerosAleatorios.size();i++){
            suma+=numerosAleatorios.get(i);
        }
        int promedio=suma/20;
        System.out.println("PROMEDIO:"+promedio);


        //Numeros del array iguales al promedio
        int igualesAlPromedio=0;
        for (int i=0;i<20;i++){
            if (numerosAleatorios.get(i)==promedio){
                igualesAlPromedio+=1;
            }
        }
        System.out.println("NUMEROS DEL ARRAY IGUALES AL PROMEDIO:"+ igualesAlPromedio);


        //Numeros del array mayores al promedio
        int mayoresAlPromedio=0;
        for (int i=0;i<20;i++){
            if (numerosAleatorios.get(i)>promedio){
                mayoresAlPromedio+=1;
            }
        }
        System.out.println("NUMEROS DEL ARRAY MAYORES AL PROMEDIO:"+mayoresAlPromedio);


        //Numeros del array menores al promedio


        int menoresAlPromedio=0;
        for (int i=0;i<20;i++){
            if (numerosAleatorios.get(i)<promedio){
                menoresAlPromedio+=1;
            }
        }
        System.out.println("NUMEROS DEL ARRAY MENORES AL PROMEDIO:"+menoresAlPromedio);
    }
}
