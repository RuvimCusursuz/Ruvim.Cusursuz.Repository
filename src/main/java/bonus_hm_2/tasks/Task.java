package bonus_hm_2.tasks;

import java.time.LocalDate;
import java.util.Date;

public class Task {
    private static int numberOfTask;
    private final String taskName;
    private String taskDiscription;
    private Prioritises priorites;
    private TaskStatus taskStatus;
    private java.util.Date deadLine;
    private LocalDate addDay;

    public Task(String taskName, String taskDiscription, Prioritises priorites, java.util.Date deadLine) {
        this.taskName = taskName;
        this.taskStatus = TaskStatus.NOT_STARTED;
        this.taskDiscription = taskDiscription;
        this.priorites = priorites;
        this.deadLine = deadLine;
        numberOfTask++;
        this.addDay = LocalDate.now();

    }

    public LocalDate getAddDay() {
        return addDay;
    }

    public void setPriorites(Prioritises priorites) {
        this.priorites = priorites;
    }

    public void setDeadLine(java.util.Date deadLine) {
        this.deadLine = deadLine;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getTaskDiscription() {
        return taskDiscription;
    }

    public Prioritises getPriorites() {
        return priorites;
    }

    public Date getDeadLine() {
        return deadLine;
    }

    public static int getNumberOfTask() {
        return numberOfTask;
    }

    public TaskStatus getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }
}
