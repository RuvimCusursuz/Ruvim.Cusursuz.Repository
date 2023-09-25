package Homework_nr_8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static ArrayList<String> myToDoList() {
        ArrayList<String> todayList = new ArrayList<>();
        todayList.add("Wake up");
        todayList.add("Cleaning the room");
        todayList.add("homework Java");
        todayList.add("reading the book");
        todayList.add("Wake up");
        return todayList;
    }

    public static ArrayList<String> returnTheKey(ArrayList<String> mylist) {
        HashMap<String, String> hashMapNr1 = new HashMap<>();
        for (int i = 0; i < mylist.size(); i++) {
            hashMapNr1.put(i + " + " + mylist.get(i), mylist.get(i));
        }
        ArrayList<String> keys = new ArrayList<>();
        for (String key : hashMapNr1.keySet()) {
            keys.add(key);
        }
        return keys;
    }

    public static void main(String[] args) {
        ArrayList<String> list = myToDoList();
        System.out.println(list);
        System.out.println(returnTheKey(list));

    }
}
