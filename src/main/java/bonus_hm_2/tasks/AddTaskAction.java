package bonus_hm_2.tasks;

import bonus_hm_2.tasks.Exception.InvalidNameOrDiscription;
import bonus_hm_2.tasks.enums.Prioritises;

import java.util.Date;

public class AddTaskAction implements TaskAction {
    private String taskName;
    private String taskDiscription;
    private java.util.Date deadLine;

    public AddTaskAction(String taskName, String taskDiscription, java.util.Date deadLine) throws InvalidNameOrDiscription {
        for (int i = 0; i < taskName.length(); i++) {

            if (Character.isDigit((taskName.charAt(i)))) {
                throw new InvalidNameOrDiscription("Name and discription can contain only letter");
            }
        }

        for (int i = 0; i < taskDiscription.length(); i++) {

            if (Character.isDigit((taskDiscription.charAt(i)))) {
                throw new InvalidNameOrDiscription("Name and discription can contain only letter");
            }
        }
        this.taskName = taskName;
        this.taskDiscription = taskDiscription;
        this.deadLine = deadLine;
    }

    @Override
    public Task perform() {
        return new Task(taskName,taskDiscription,deadLine);

    }

}