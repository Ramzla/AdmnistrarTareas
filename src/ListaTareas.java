import java.util.ArrayList;

public class ListaTareas {
    ArrayList<Tarea> tareas;

    public ListaTareas() {
        this.tareas = new ArrayList<>();
    }

    public void agregar(Tarea tarea) {
        tareas.add(tarea);
    }

    public boolean eliminar(int indice) {
        if (indice >= 0 && indice < tareas.size()) {
            tareas.remove(indice);
            return true;
        }
        return false;
    }

    public ArrayList<Tarea> obtener() {
        return tareas;
    }

    public boolean completar(int indice) {
        if (indice >= 0 && indice < tareas.size()) {
            tareas.get(indice).completado = true;
            return true;
        }
        return false;
    }
}