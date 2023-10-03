import java.util.Locale;
import java.util.Scanner;
public class Tp4Java {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Ingrese la cantidad de estudiantes");
        int cantStudents = sc.nextInt(), i;
        double studentMarks[], markSum = 0, average;
        studentMarks = new double[cantStudents];
        for(i = 0; i < cantStudents; i++) {
            System.out.println("Ingrese la nota del alumno " + i + 1);
            studentMarks[i] = sc.nextDouble();
            markSum += studentMarks[i];
        }
        average = markSum / cantStudents;
        for (i = 0; i < cantStudents; i++){
            if (studentMarks[i] > average){
                System.out.println("El alumno " + i + " consiguió superar la media de notas, con nota " + studentMarks[i]  );
            }
        }
    }
}
