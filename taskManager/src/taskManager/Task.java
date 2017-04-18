package taskManager;

public class Task {

	//ATRIBUTOS

    /**
     * Task description
     */
    private String description;
    /**
     * Due date of the task
     */
    private Date dueDate;
    /**
     * Priority of the task
     * 1. Low
     * 2.Medium
     * 3.Higher
     */
    private int priority;
    /**
     * True if the task is completed
     */
    private boolean complete;
    
  //CONSTRUCTORES

    public Task() {

    }

    public Task(String description, int priority) {
        this.description = description;
        this.dueDate = new Date();
        this.priority = priority;
        this.complete = false;
    }

    //ACCESORES

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }
}
