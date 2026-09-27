import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaTareas modelo = new ListaTareas();
        TareaVista vista = new TareaVista();
        Scanner scanner = new Scanner(System.in);

        int opcion = 0;

        while (opcion != 5) {
            System.out.println("\n--- MENU DE TAREAS ---");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Eliminar tarea");
            System.out.println("3. Mostrar tareas");
            System.out.println("4. Completar tarea");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");

            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Por favor, ingrese un numero valido.");
                scanner.nextLine();
                continue;
            }

            if (opcion == 1) {
                Tarea nueva = vista.agregarTarea(scanner);
                modelo.agregar(nueva);
                System.out.println("Tarea agregada correctamente.");

            } else if (opcion == 2) {
                if (modelo.obtener().isEmpty()) {
                    System.out.println("No hay tareas para eliminar.");
                } else {
                    vista.mostrar(modelo.obtener());
                    int indice = vista.eliminarTarea(scanner);
                    if (modelo.eliminar(indice)) {
                        System.out.println("Tarea eliminada correctamente.");
                    } else {
                        System.out.println("Numero de tarea no valido.");
                    }
                }

            } else if (opcion == 3) {
                vista.mostrar(modelo.obtener());

            } else if (opcion == 4) {
                if (modelo.obtener().isEmpty()) {
                    System.out.println("No hay tareas para marcar como completadas.");
                } else {
                    vista.mostrar(modelo.obtener());
                    int indice = vista.completarTarea(scanner);
                    if (modelo.completar(indice)) {
                        System.out.println("Tarea marcada como completada.");
                    } else {
                        System.out.println("Numero de tarea no valido.");
                    }
                }

            } else if (opcion == 5) {
                System.out.println("Saliendo del sistema de tareas...");

            } else {
                System.out.println("Opcion no valida. Intente de nuevo.");
            }
        }

        scanner.close();
    }
}