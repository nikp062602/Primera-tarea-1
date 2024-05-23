import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = scanner.nextInt();

        int suma = numero1 + numero2;
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);

        int resta = numero1 - numero2;
        System.out.println("La resta de " + numero1 + " y " + numero2 + " es: " + resta);

        int multiplicacion = numero1 * numero2;
        System.out.println("La multiplicación de " + numero1 + " y " + numero2 + " es: " + multiplicacion);

        double division = (double) numero1 / numero2;
        System.out.println("La división de " + numero1 + " entre " + numero2 + " es: " + division);
        
        scanner.close();
    }
}