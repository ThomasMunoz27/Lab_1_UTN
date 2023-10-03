import java.util.Locale;
import java.util.Scanner;
public class RepasoParcial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Ingrese 2 números enteros: ");
        int num1 = Math.abs(sc.nextInt()), num2 = Math.abs(sc.nextInt());
        int digit1 = num1 % 10, digit2 = num2 % 10;
        if (digit1 == digit2){
            System.out.println("Los últimos digitos de los números son iguales");
        }else {
            System.out.println("Los últimos digitos de los números no son iguales");
        }

    }
}
