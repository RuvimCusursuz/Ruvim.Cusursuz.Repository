package bonus_hm_2;

import bonus_hm_2.tasks.AddTaskAction;
import bonus_hm_2.tasks.Exception.TaskDontExist;
import bonus_hm_2.tasks.TaskManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager managerNr1 = new TaskManager();
        for (int i = 0; i < 10; i++) {
            System.out.println("What you would do:  \n" +
                    "1: create a Task \n" +
                    "2: set all tasks\n" +
                    "3: change Status\n" +
                    "4: delete the Task\n" +
                    "5: complete the Task\n");

            Scanner scanner = new Scanner(System.in);

           try {
               switch (scanner.nextInt()) {
                   case 1: {
                       managerNr1.createANewTask();
                       break;
                   }
                   case 2: {
                       managerNr1.setAllTask();
                       break;

                   }
                   case 3: {
                       managerNr1.changeStatus();
                       break;
                   }
                   case 4: {
                       managerNr1.deleteTask();
                       break;
                   }
                   case 5: {
                       managerNr1.completeTask();
                       break;
                   }
                   default:
                       System.out.println("invalid Number, try again");
               }
           } catch (TaskDontExist e){
               System.out.println("Task dont exist");
           }
            i++;
        }
    }
}

