package taskManager;

import java.util.Date;

public class Task {

	//ATRIBUTOS

    /**
     * <h4>Descripcion de Task<h4>
     */
    private String description;
    /**
     * <h4>Fecha del task<h4>
     */
    private Date dueDate;
    /**
     * <h4>Prioridad<h4>
     * <h4>1.Bajo<h4>
     * <h4>2.Medio<h4>
     * <h4>3.Alto<h4>
     */
    private int priority;
    /**
     * <h4>Si el task esta completo<h4>
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
    
  //toSTRING
    @Override
    public String toString() {
        return "Task{" +
                "description='" + description + '\'' +
                ", dueDate=" + dueDate +
                ", priority=" + priority +
                ", complete=" + complete +
                '}';
    }
}
