package bonus_hm_2;

import bonus_hm_2.tasks.AddTaskAction;
import bonus_hm_2.tasks.TaskManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("What you would do:  " +
                "1: " +
                "2:" +
                "3:" +
                "4:" +
                "5:");

        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            case 1 : {
                TaskManager.createANewTask();
                break;
            }
            case 2 :{

            }
            case 3 :{

            }
            case 4 :{

            }
            default : System.out.println("invalid Number");

        }
    }
}

