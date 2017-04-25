package taskManager;

import java.util.ArrayList;

/**
 * Created by nfdar on 31/03/2017.
 */
public class TaskList {

    private ArrayList<Task> tasks;

    /**
     * <h4>Create an instance of a new Task Array List.</h4>
     */
    public TaskList() {
        this.tasks = new ArrayList<Task>();
    }

    /**
     * <h4>Add a new task to the list.</h4>
     *
     * @param task A task type.
     */
    public void addTask(Task task){
        if (task != null) {
            tasks.add(task);
        }
    }

    /**
     * <h4>Add a new task at the index.</h4>
     *
     * @param index index es el index de orden de la tasklist
     * @param task son las tareas de la tasklist.
     */
    public void addTask(int index, Task task){
        if (task != null && correctIndex(index) ){
            tasks.add(index, task);
        }else if (tasks.size() ==0){
            tasks.add(task);
        }else{
            System.out.println("Indice malo");
        }
    }
    
    /**
     * <h4>Remove the first task of the list</h4>
     */
    public void removeFirstTask(){
        if (!tasks.isEmpty()) {
            tasks.remove(0);
        }else{
            System.out.println("Lista Vacia.");
            System.out.println("No hay nada que borrar.");
        }
    }
    /**
     * <h4>Remove last task of the list</h4>
     */
    public void removeLastTask(){
        int lastIndex = tasks.size() - 1;

        if (!tasks.isEmpty()){
            tasks.remove(lastIndex);
        }else {
            System.out.println("Lista vacía");
        }
    }
    /**
     * <h4>CorrectIndex</h4>
     * <b>Check if the index parameter id correct (with the current ArratList size)</b>
     *
     * @param index index es el index de orden de la tasklist
     * @return devolvemos si el index esta contenido en el arraylist.
     */
    public boolean correctIndex(int index){
        if( index>=0 && index < this.tasks.size()){
            return true;
        }else {
            return false;
        }
    }
    
    /**
     * <h4>Remove the task at the index.</h4>
      * @param index es el index de orden de la tasklist
     */
    public void removeTask(int index){
        if ( correctIndex(index)){
            tasks.remove(index);
        }
    }
    /**
     * <h4>Show the task as a numbered list.</h4>
     */
    public void showTasks(){
        int i =1;
        System.out.println("Lista de Tareas:");
        System.out.println("================");
        if (tasks.isEmpty()){
            System.out.println("No hay tareas.");
        }else{
            for (Task task: tasks){
                System.out.println( i + " - " + task.getDescription() );
                i++;
            }
        }
    }
    
}

    