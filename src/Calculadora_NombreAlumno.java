import java.util.Objects;
import java.util.Scanner;
import java.util.Locale;
public class Calculadora_NombreAlumno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        boolean leave;
        double sum, resta, mult, div,result = 0;
        do {
            if (result == 0) {
                //Se ingresan 2 números por teclado y se guardan en una variable c/u
                System.out.println("Ingrese 2 números para operarlos");
                double num1 = sc.nextDouble(), num2 = sc.nextDouble();
                //Se pregunta qúe operación quiere realizar el usuario
                System.out.println("Ingrese qué operacion le gustaría realizar");
                System.out.println("Suma(+), Resta(-), Multiplicación(*) o división(/)");
                String operation = sc.next();

                //se evalúa la operación ingresada y se muestra el resultado
                if (Objects.equals(operation, "+")) {
                    sum = num1 + num2;
                    System.out.println("El resultado de la suma es: " + sum);
                    result = sum;
                } else if (Objects.equals(operation, "-")) {
                    resta = num1 - num2;
                    System.out.println("El resultado de l resta es: " + resta);
                    result = resta;
                } else if (Objects.equals(operation, "*")) {
                    mult = num1 * num2;
                    System.out.println("El resultado de la Multiplicación es: " + mult);
                    result = mult;
                } else if (Objects.equals(operation, "/")) {
                    //Se verifica que el divisior no sea 0
                    if (num2 != 0) {
                        div = num1 / num2;
                        System.out.println("El restultado de la división es: " + div);
                        result = div;
                    } else {
                        System.out.println("ERROR. No se puede dividir por cero");
                    }
                }
                //si hay un número anterior como resultado se usa como primer dígito
            } else {
                System.out.println("Ingrese otro número para operar con " + result);
                double num3 = sc.nextDouble();
                System.out.println("Ingrese qué operacion le gustaría realizar");
                System.out.println("Suma(+), Resta(-), Multiplicación(*) o división(/)");
                String operation = sc.next();

                //se evalúa la operación ingresada y se muestra el resultado
                if (Objects.equals(operation, "+")) {
                    sum = result + num3;
                    System.out.println("El resultado de la suma es: " + sum);
                    result = sum;
                } else if (Objects.equals(operation, "-")) {
                    resta = result - num3;
                    System.out.println("El resultado de l resta es: " + resta);
                    result = resta;
                } else if (Objects.equals(operation, "*")) {
                    mult = result * num3;
                    System.out.println("El resultado de la Multiplicación es: " + mult);
                    result = mult;
                } else if (Objects.equals(operation, "/")) {
                    //Se verifica que el divisior no sea 0
                    if (num3 != 0) {
                        div = result / num3;
                        System.out.println("El restultado de la división es: " + div);
                        result = div;
                    } else {
                        System.out.println("ERROR. No se puede dividir por cero");
                    }
                }
            }
            leave = true;
            System.out.println("Para salir del programa ingrese 'Salir'. Sino ingrese caulquier otra cosa: ");
            String salida = sc.next().toLowerCase(Locale.ROOT);
            if (Objects.equals(salida, "salir")){
                leave = false;
            }
        }while (leave == true);
        System.out.println("Adios. Gracias por usar esta calculadora");
    }
}