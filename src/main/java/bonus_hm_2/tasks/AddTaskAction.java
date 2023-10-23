package bonus_hm_2.tasks;

import java.util.Date;

public class AddTaskAction implements TaskAction{
    private String taskName;
    private String taskDiscription;
    private Prioritises priorites;
    private java.util.Date deadLine;

    public AddTaskAction(String taskName, String taskDiscription, java.util.Date deadLine) throws InvalidNameOrDiscription{
        this.taskName = taskName;
        this.taskDiscription = taskDiscription;
        this.priorites = Prioritises.NON;
        this.deadLine = deadLine;
        addTask(taskName,taskDiscription,priorites,deadLine);
    }

    @Override
    public void perform() {

    }

    public void addTask(String taskName, String taskDiscription, Prioritises priorites, Date deadLine) throws InvalidNameOrDiscription{
            for (int i = 0; i < taskName.length(); i++) {

                if (Character.isDigit((taskName.charAt(i)))){
                    throw new InvalidNameOrDiscription("Name and discription can contain only letter");
                }
            }

            for (int i = 0; i < taskDiscription.length(); i++) {

                if (Character.isDigit((taskDiscription.charAt(i)))){
                    throw new InvalidNameOrDiscription("Name and discription can contain only letter");
                }
            }
        new Task(taskName,taskDiscription,priorites,deadLine);
        }

}
