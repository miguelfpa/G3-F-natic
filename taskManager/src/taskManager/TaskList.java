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