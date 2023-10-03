import java.util.Locale;
import java.util.Scanner;
public class tp3Java {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        /*
        //Ejercicio 1
        System.out.println("Ingrese un número para saber si es par o impar: ");
        int num = sc.nextInt();
        int even, odd;
        if (num%2==0){
            even = num;
            System.out.println("El número " + even + " es par");
        }else{
            odd = num;
            System.out.println("El número " + odd + " es impar");
         */
//ejercicio 2
        /*
        Scanner sc = new Scanner(System.in);
 System.out.print("Ingresa un número:");
 int num = sc.nextInt();
 if (num % 10 == 0) {
 	System.out.println(num + "Es múltiplo de 10");
 } else {
 	System.out.println(num + " No es múltiplo de 10");
 }
         */

        //ejercicio 3
        /*
        System.out.println("Ingresar una letra:");
        String letra=sc.nextLine();
        String letraMayuscula=letra.toUpperCase();
        if (letra==letraMayuscula){
            System.out.println("La letra ingresada es una letra MAYÚSCULA");
        }else{
            System.out.println("La letra ingresada es MINÚSCULA");
        }

         */


        //Ejercicio 4
/*      System.out.println("Ingrese 2 números para saber si son iguales: ");
        int num1 = sc.nextInt(), num2 = sc.nextInt();
        if(num1 == num2){
            System.out.println(num1 + " y " + num2 + " son iguales");
        }else{
            System.out.println(num1 + " y " + num2 + " son distintos");


        }
 */
        //Ejercicio 5
        /*System.out.println("Ingrese 2 números para ver el mayor: ");
        int entryN1 = sc.nextInt(), entryN2 = sc.nextInt();
        if(entryN1 > entryN2){
            System.out.println(entryN1 + " es mayor que " + entryN2);
        }else{
            System.out.println(entryN2 + " es mayor que " + entryN1);
        }
         */

        //Ejercicio 6
        /*
        System.out.print("Ingresa dos números:");
        int number1= sc.nextInt();
        number1= number1%10;
        int number2= sc.nextInt();
        number2= number2%10;
        if (number1==number2){
            System.out.print("La última cifra de los dos números ingresados son iguales.");
        } else {
            System.out.print("La última cifra de los dos números ingresados NO son iguales.");
        }
         */
        //Ejercicop 7
        /*
        System.out.println("Ingresar un numero entero:");
        int n=sc.nextInt();
        if (n%5==0 && n%3==0){
            System.out.println("El numero "+n+" es multiplo de 3 y 5");
        } else{
            System.out.println("El numero "+n+" NO multiplo de 3 y 5");
        }
         */
        //Ejercicio 8
        /*
        System.out.println("Ingresar un numero entero:");
        int n=sc.nextInt();
        if (n%2==0 || n%3==0){
            System.out.println("El numero "+n+" es múltiplo de 2 o 3");
        } else{
            System.out.println("El numero "+n+" NO múltiplo de 2 o 3");
        }
         */


    //Ejercicio 9
        /*
        System.out.println("Ingrese 2 caracteres para saber si son iguales");
        char letter1 = sc.next().charAt(0), letter2 =sc.next().charAt(0);
        if(letter2 == letter1){
            System.out.println(letter1 + " y " + letter2 + " son iguales");
        }else{
            System.out.println(letter1 + " y " + letter2 + " son distintos");
        }
    }
         */

        //Ejercicio 10
        /*
        System.out.println("Ingresar letra:");
        String l1=sc.nextLine();
        System.out.println("Ingresar otra letra:");
        String l2= sc.nextLine();
        if (l1==l1.toLowerCase() && l2 == l2.toLowerCase()){
            System.out.println("Las dos letras son minúsculas");
        }else {
            System.out.println("Las dos letras NO son minúsculas");
        }
         */
        //Ejercicio 11
        /*
        System.out.println("Ingrese un carácter");
        char character = sc.next().charAt(0);


        if(Character.isDigit(character)){
            System.out.println("Es un digito");
        }else{
            System.out.println("No es un digito");
        }
         */



        //Ejercicio 12
        /*
        System.out.println("Ingrese 2 números para dividirlos");
        System.out.println("Ingrese el dividendo: ");
        double num1 = sc.nextDouble();
        System.out.println("Ingrese el divisor: ");
        double num2 = sc.nextDouble();
        if (num2 == 0){
            System.out.println("No se puede ingresar un 0 en el divisor");

        }else{
            double result = num1 /num2;
            System.out.println("El resultado de la división es: " + result);
        }
        */

        //Ejercicio 13
        /*
        System.out.println("Ingrese un año para conocer si es bisiesto o no:  ");
        int year = sc.nextInt();
        String result = ((((year % 4) == 0) && ((year % 100) != 0)) || ((year % 400) == 0)) ? " Es un año bisiesto. " : " No es un año bisiesto ";
        System.out.println(year + result);

         */

        //Ejercicio 14
        /*
        System.out.println("Ingresar un numero de tres cifras:");
        int n = sc.nextInt();
        String nCadena = String.valueOf(n);
        if (nCadena.length() == 3){
            int primerCifra = n / 100;
            int ultimaCifra = n % 10;
            if (primerCifra==ultimaCifra) {
                System.out.println("NUMERO CAPICUA");
            }else{
                System.out.println("NUMERO NO CAPICUA");
            }
        }else{
            System.out.println("El numero ingresado no tiene 3 cifras");
        }

         */



        //Ejecicio 15
        /*
        System.out.println("Ingrese el número para horas: ");
        int H = sc.nextInt();
        System.out.println("Ingrese el número para minutos: ");
        int M = sc.nextInt();
        System.out.println("Ingrese el número para segundos: ");
        int S = sc.nextInt();
        if (H < 0 || H > 24 || M < 0 || M > 59 || S < 0 || S > 59){
            System.out.println("Alguno de los valores ingresados para la hora es incorrecto");
        }else{
            System.out.println("La nota ingresada es: " + H + ":" + M + ":" + S );
        };
         */

        //Ejercicio 16
/*
        System.out.println("Ingrese el numero del mes en escala de 1 a 12: ");
        int month = sc.nextInt();
        if( month > 0 && month < 13) {
            if( month == 1){
                System.out.println("El mes es Enero y tiene 31 días");
            }
            if(month == 2) {
                System.out.println("El mes Febrero y tiene 28 días");
            }
            if (month == 3){
                System.out.println("El mes es marzo y tiene 31 días");
            }
            if (month == 4 ) {
                System.out.println("El mes es abril y tiene 30 días");
            }
            if (month == 5){
                System.out.println("El mes Mayo y tiene 31 días ");
            }
            if (month == 6 ){
                System.out.println("El mes es Junio y tiene 30 días");
            }
            if (month == 7){
                System.out.println("El mes es Julio y tiene 31 días");
            }
            if (month == 8){
                System.out.println("El mes es Agosto y tiene 31 días");
            }
            if (month==9){
                System.out.println("El mes es Septiembre y tiene 30 días");
            }
            if (month == 10 ){
                System.out.println("El mes es Octubre y tiene 31 días");
            }
            if (month== 11){
                System.out.println("El mes es Noviembre y tiene 30 días ");
            }
            if (month == 12){
                System.out.println("El mes es Diciembre y tiene 31 días");
            }


        } else {
            System.out.println("Error de entrada ");
        }

 */

        //Ejercicio 17
/*
        System.out.println("Ingrese su nota: ");
        int nota = sc.nextInt();
        if (0 <= nota && nota < 5) {
            System.out.println("Insuficiente");
        } else if (5 <= nota && nota < 6) {
            System.out.println("Suficiente");
        } else if (6 <= nota && nota < 7) {
            System.out.println("Bien");
        } else if (7 <= nota && nota < 9) {
            System.out.println("Notable");
        } else if (9 <= nota && nota <= 10) {
            System.out.println("Sobresaliente");
        }

 */

    //Ejercicio 18
/*
        System.out.print("los numeros del 0 al 100");
        int  num=0;
        while (num != 101){
            System.out.println(num);
            num +=1;
        }

 */

        //Ejercicio 19
        /*
        int i = 1;
        while(i<=100){
            System.out.println(i);
            i++;
        }
         */

        //Ejercicio 20
        /*
        int i;
        for (i = 0; i <= 100; i++){
            System.out.println(i);
        }
         */

        //Ejercicio 21
        /*
        int i = 100;
        while(i >= 1){
            System.out.println(i);
            i--;
        }
         */

        //Ejercicio 22
        /*
        int n = 100;
        do{
            System.out.println(n);
            n--;

            }while(n>0);
         */

        //Ejercicio 23
        /*
        for(int i = 100; i >= 1; i--){
            System.out.println(i);
        }
         */

        //Ejercicio 24
/*
        System.out.print("Ingresa un número N:");
        int number1 = sc.nextInt();
        //1.      Utilizando la estructura for
        for(int i=1; i<=number1 ;i++){
            System.out.println(i);
        }
        //2.      Utilizando la estructura while
        int i=1;
        while (i<=number1){
            System.out.println(i);
            i++;
        }
        //3.      Utilizando la estructura do .. while
        int i=1;
        do{
            System.out.println(i);
            i++;
        }while (i<=number1);

 */

        //Ejercicio 25
/*
//1. Utilizando for
        System.out.println("Ingresar un numero:");
        int n= sc.nextInt();
        int i;
        for(i=n;i>=1;i--){
            System.out.println(i);
        }
        //utilizando while
        int n= sc.nextInt();
        while (n>0){
            System.out.println(n);
            n=n-1;
        }

        //utilizando do while
        System.out.println("Ingresar un número:");
        int n= sc.nextInt();
        do{
            System.out.println(n);
            n=n-1;
        }while (n>0);
 */

        //Ejercicio 26
        /*
        int a1 = 0,b2 = 0;


        int n1,n2;
        System.out.println("Ingresa un numero");
        n1 = sc.nextInt();
        System.out.println("Ingresa otro numero");
        n2 = sc.nextInt();


        if(n1 == n2){
            System.out.println("Debes ingresar numeros diferentes");
        } else if (n1 < n2) {
            a1 = n1;
            b2 = n2;
        }else{
            a1 = n2;
            b2 = n1;
        }
        while(a1 <= b2){
            System.out.println(a1);
            a1++;
        }


         */




        //Ejercicio 27
    /*
        System.out.println("Ingrese 2 números para saber los pares entre ellos. El primer número debe ser menor que el segundo: ");
        int A = sc.nextInt(), B = sc.nextInt(), i;
        if (B < A) {
            System.out.println("Los números pares entre " + B + " y " + A + " Son: ");
            for (i = B; i <= A; i++){
                if (i % 2 == 0){
                    System.out.println(i);
                }
            }
        }else{
            System.out.println("El 2do número ingresado debe ser menor que el 1ro");
        }

     */

        //Ejercicio 28
        /*
        System.out.println("Ingrese 2 números enteros positivos. El 2do debe ser mayor que el primero: ");
        int i, N = sc.nextInt(), M = sc.nextInt();
        if(N > M){
            System.out.println("ERROR. El 1er número debe ser menor que el 2do");
        } else{
            System.out.println("Los múltiplos de cuatro entre " + N + " y " + M + " son: ");
            for (i = N; i <= M; i++){
                if (i % 4 == 0){
                    System.out.println(i);
                }
            }

        }

         */

        //Ejercicio 29
        /*
        double leave = 1;
        do{
            System.out.println("Ingrese una distancia en millas para convertirlas en kilometros. (Ingrese 0 para salir");
            double miles = sc.nextDouble();
            if(miles != 0.0){
                double km = miles * 1.6093;
                System.out.println(miles + " millas, son: " + km + " kilometros");
            }else{
                leave -= 1;
         }
        }while (leave != 0);

         */


        }
    }


