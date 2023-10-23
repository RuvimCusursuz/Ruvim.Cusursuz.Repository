package bonus_hm_2.tasks;

public class CompleteTaskAction implements TaskAction{
    Task task;

    public CompleteTaskAction(Task task) {
        try {

            if (task.getTaskStatus() == TaskStatus.COMPLETED) {
                throw new InvalidStatusException("Status is already Completed");
            }
            this.task = task;
        }
        catch (InvalidStatusException e){
//            &&&&&&&&&&&&&&&&&&&&&&&
        }
    }

    @Override
    public void perform() {
         this.task.setTaskStatus(TaskStatus.COMPLETED);

    }
}
