package bonus_hm_2.tasks;

import bonus_hm_2.tasks.Exception.InvalidNameOrDiscription;
import bonus_hm_2.tasks.Exception.TaskDontExist;
import bonus_hm_2.tasks.Exception.TaskExceprion;
import bonus_hm_2.tasks.enums.TaskStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class TaskManager {
    public ArrayList<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public void createANewTask() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of Task:");
        String taskname = scanner.nextLine();
        System.out.println("Descripton of Task:");
        String disription = scanner.nextLine();
        System.out.println("Deadline  in format yyyy.mm.dd:");
        try {
            Date date = new SimpleDateFormat("YYYY.MM.dd").parse(scanner.nextLine());
            try {
                AddTaskAction a1 = new AddTaskAction(taskname, disription, date);
                tasks.add(a1.perform());
            } catch (InvalidNameOrDiscription e) {
                System.out.println(e + " try again");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("invaled date format");
            System.out.println(" try again");
        }
    }

    public void setAllTask() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(tasks.get(i).getNumberOfTask() + ": " + tasks.get(i).getTaskName() + " ->" + tasks.get(i).getTaskStatus());
        }
    }

    public void changeStatus() throws TaskDontExist {
        Task bufferTask = searchTask();
        System.out.println("Current Status:" + bufferTask.getTaskStatus());
        System.out.println("What you want make? \n NOT_STARTED,\n" + "    IN_PROGRESS,\n" + "    COMPLETED;");
        for (int i = 0; i < 10; i++) {
            try {
                Scanner s3 = new Scanner(System.in);
                String newS = s3.nextLine();
                TaskStatus newStatus = TaskStatus.valueOf(newS);
                bufferTask.setTaskStatus(newStatus);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("invalid Status, please try again");
            }
            i++;
        }
        System.out.println("  Status is changed " + bufferTask.getTaskStatus());
    }

    public void deleteTask() throws TaskDontExist {
        tasks.remove(searchTask());

    }

    public void completeTask() throws TaskDontExist {
        CompleteTaskAction completeTaskAction = new CompleteTaskAction(searchTask());
        System.out.println(completeTaskAction.perform().getTaskName() + " completed");
    }

    public Task searchTask() throws TaskDontExist {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter Name or number of task");
        int p1;
        String s1;
        if (scanner.hasNextInt()) {
            p1 = scanner.nextInt();
            for (Task task : tasks) {
                if (task.getNumberOfTask() == p1) {
                    return task;
                }
            }
        } else {
            s1 = scanner.nextLine();
            for (Task task : tasks) {
                if (task.getTaskName().equalsIgnoreCase(s1)) {
                    return task;
                }
            }
        }
        throw new TaskDontExist("task don`t exist");
    }
}
