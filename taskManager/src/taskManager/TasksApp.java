package taskManager;

import java.util.Scanner;

public class TasksApp {

    private TaskList taskList;


    public TasksApp() {
        taskList = new TaskList();
    }

    /**
     * Method for control the App
     * 
     */
    public void startApp(){
        int option;
        while((option = showMenu()) != 0 ){
            switch (option){
                case 1:
                    taskList.showTasks();
                    break;
                case 2:
                    taskList.addTask(askTask());
                case 3:
                    taskList.addTask(askIndex(), askTask());
                case 4:
                    taskList.removeLastTask();
                    break;
                case 5:
                    taskList.removeFirstTask();
                    break;
            }
        }
    }
    
    /**
     * Method that ask for the index
     * @return index
     */

    private int askIndex(){
        Scanner scanner = new Scanner(System.in);
        int index;
        do {
            System.out.println("Introducir índice: ");
            index= scanner.nextInt();

        }while (!taskList.correctIndex(index) && index==0);

        return  index;
    }
    
    
    /**
     * Method that ask for a task
     * @return new Task
     */
    private Task askTask() {
        Scanner scanner = new Scanner(System.in);
        String description;
        int priority;

        System.out.println("Nueva Tarea");
        System.out.println("%%%%%%%%%%%");
        do {
            System.out.println("Descripción");
            description = scanner.nextLine().trim().replaceAll("\\s+"," ");
        }while (description.length() == 0);
        do {
            System.out.println("Prioridad");
            priority = scanner.nextInt();
        }while (priority<1 || priority >3);
        return  new Task(description, priority);
    }

/**
 * Show the different options of the menu
 * @return option
 */
    public int showMenu(){
        Scanner scanner = new Scanner(System.in);
        int option;
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println("% 1 - Mostrar Tareas                ");
        System.out.println("% 2 - Añadir Tarea                  ");
        System.out.println("% 3 - Añadir Tarea por posición     ");
        System.out.println("% 4 - Eliminar Última Tarea         ");
        System.out.println("% 5 - Eliminar Primera Tarea        ");
        System.out.println("% 6 - Eliminar Tarea por Posición   ");
        System.out.println("% 7 - Salir                         ");
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println("Opción: ");

        option = scanner.nextInt();

        return option;
    }

}
