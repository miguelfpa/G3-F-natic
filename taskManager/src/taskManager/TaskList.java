package com.company.model;

import java.util.ArrayList;

/**
 * Created by nfdar on 31/03/2017.
 */
public class TaskList {

    private ArrayList<Task> tasks;

    /**
     * Create an instance of a new Task Array List.
     */
    public TaskList() {
        this.tasks = new ArrayList<Task>();
    }

    /**
     * Add a new task to the list.
     *
     * @param task A task type.
     */
    public void addTask(Task task){
        if (task != null) {
            tasks.add(task);
        }
    }

    /**
     * Add a new task at the index.
     *
     * @param index
     * @param task
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
     * Remove the first task of the list
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
     * Check if the index parameter id correct (with the current ArratList size)
     *
     * @param index
     * @return
     */
    public boolean correctIndex(int index){
        if( index>=0 && index < this.tasks.size()){
            return true;
        }else {
            return false;
        }
    }
    
    /**
     * Remove the task at the index.
      * @param index
     */
    public void removeTask(int index){
        if ( correctIndex(index)){
            tasks.remove(index);
        }
    }
}

    