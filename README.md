# AdministrarTareas

1. Agregar tarea
2. Eliminar tarea
3. Mostrar tarea
4. Completar tarea
5. Salir

Class Tarea
- Nombre
- Tipo
- Fecha
- Descripcion

- crearTarea()
- hacerTarea()
- CompletarTarea()

ArrayList
- Scanner
- Mostrar menu/tareas
- Validaciones
- Llamadas métodos
- Crear

Main / ClassTarea
- Datos
- Logica
- Mostrar opciones
- Mensajes
- Validaciones
- Visualizacion

#Modelo
 ¿Que info tengo y que puedo hacer con ella?

 #Vista
 ¿Que ve el usuario y como recibe la info?

 #Controlador
 ¿Que queremos que ocurra cuando el usuario realiza una accion?

- Modelo: Tarea, Lista Tareas, ArrayList<Tarea> / Almacena los datos

- Vista: Menú, mensajes, solicitud de datos.

- Controlador: Comunica vista-modelo, coordina acciones, procesar opciones / logica del programa

1. Agregar tarea
2. Eliminar tarea
3. Mostrar tarea
4. Completar tarea
5. Salir

Tarea
- Nombre
- Descripcion
- Completado

ListaTareas
-ArrayList
+Agregar
+Eliminar
+Obtener
+Completar

TareaVista
+Mostrar
//todo lo que se debe de mostrar

Main
TareaControlador
- ListaTarea modelo;
- TareaVista Vista;
+AgregarTarea();
+EliminarTarea();
+CompletarTarea();
