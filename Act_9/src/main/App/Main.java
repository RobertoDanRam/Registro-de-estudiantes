package App;

import java.util.Scanner;
import model.Estudiante;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos estudiantes deseas ingresar?: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        Estudiante[] estudiantes = new Estudiante[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Estudiante " + (i + 1));
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            estudiantes[i] = new Estudiante(nombre, edad);
        }

        System.out.println("\n--- Lista de Estudiantes ---");
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("Estudiante " + (i + 1) + ": " +
                               estudiantes[i].getNombre() + ", " +
                               estudiantes[i].getEdad() + " años");
        }

        scanner.close();
    }
}
