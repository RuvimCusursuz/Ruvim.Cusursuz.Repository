package bonus_hm_2.tasks;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class TaskManager {
    private ArrayList<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public static void createANewTask(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Name of Task:");
        String taskname = scanner.nextLine();
        System.out.println("Descripton of Task:");
        String disription = scanner.nextLine();
        System.out.println("Deadline  in format yyyy.mm.dd:");
        try {
            Date date = new SimpleDateFormat("YYYY.MM.dd").parse(scanner.nextLine());
            try {
                new AddTaskAction(taskname, disription, date);
            }
            catch (InvalidNameOrDiscription e){
                System.out.println(e + " try again");
            }
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("invaled date format");
            System.out.println(" try again");
        }
    }

    public void setAllTask(){

    }

    public void changeStatus(){

    }

    public void deleteTask(){

    }

}
