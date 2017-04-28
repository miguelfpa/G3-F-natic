package taskManager;

import java.util.Date;

/**
 * En Task (tarea) encontramos los atributos y constructores de una tarea que más
 * tarde será usada en otras clases.
 * @author Alvaro
 *
 */
public class Task {

    /**
     * <h4>Descripcion de la tarea<h4>
     * @author Alvaro
     */
    private String description;
    /**
     * <h4>Fecha de realizacion de la tarea<h4>
     * @author Alvaro
     */
    private Date dueDate;
    /**
     * <h4>Prioridad por importancia de la tarea. A mayor nivel, prioridad más alta<h4>
     * <h4>1.Bajo<h4>
     * <h4>2.Medio<h4>
     * <h4>3.Alto<h4>
     * 
     * @author Alvaro
     */
    private int priority;
    /**
     * <h4>Atributo que indica si la tarea ha sido completada o no<h4>
     * 
     * @author Alvaro
     */
    private boolean complete;
    

    /**
     * Constructor vacio
     * @author Alvaro
     */
    public Task() {

    }

    /**
     * Constructor con parametros de descripcion y prioridad.
     * @param description
     * @param priority
     * 
     * @author Alvaro
     */
    public Task(String description, int priority) {
        this.description = description;
        this.dueDate = new Date();
        this.priority = priority;
        this.complete = false;
    }

    //ACCESORES

    
    /**
     * A continuacion presentamos los getters and setters de los atributos creados
     * anteriormente
     * @author Alvaro
     * @return
     */
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
    /**
     * El metodo toString sobreescribe la clase Object y muestra una impresion
     * con los atributos creados como descripcion, prioridad...
     * @author Alvaro
     */
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
