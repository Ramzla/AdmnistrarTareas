import java.util.ArrayList;
import java.util.Scanner;

public class TareaVista {

    public void mostrar(ArrayList<Tarea> tareas) {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas registradas.");
        } else {
            System.out.println("\n--- LISTA DE TAREAS ---");
            for (int i = 0; i < tareas.size(); i++) {
                Tarea t = tareas.get(i);
                String estado = t.completado ? "[COMPLETADA]" : "[PENDIENTE]";
                System.out.println((i + 1) + ". " + estado + " " + t.nombre + " - " + t.descripcion);
            }
        }
    }

    public Tarea agregarTarea(Scanner scanner) {
        System.out.print("Ingrese el nombre de la tarea: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la descripcion: ");
        String descripcion = scanner.nextLine();

        return new Tarea(nombre, descripcion);
    }

    public int eliminarTarea(Scanner scanner) {
        System.out.print("Ingrese el numero de la tarea a eliminar: ");
        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            scanner.nextLine();
            return num - 1;
        } else {
            scanner.nextLine();
            return -1;
        }
    }

    public int completarTarea(Scanner scanner) {
        System.out.print("Ingrese el numero de la tarea a completar: ");
        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            scanner.nextLine();
            return num - 1;
        } else {
            scanner.nextLine();
            return -1;
        }
    }
}