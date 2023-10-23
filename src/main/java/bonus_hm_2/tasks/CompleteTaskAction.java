package bonus_hm_2.tasks;

import bonus_hm_2.tasks.Exception.InvalidStatusException;
import bonus_hm_2.tasks.enums.TaskStatus;

public class CompleteTaskAction implements TaskAction {
    Task task;

    public CompleteTaskAction(Task task) {
        try {

            if (task.getTaskStatus() == TaskStatus.COMPLETED) {
                throw new InvalidStatusException("Status is already Completed");
            }
            this.task = task;
        } catch (InvalidStatusException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Task perform() {
        this.task.setTaskStatus(TaskStatus.COMPLETED);
        return this.task;
    }
}
