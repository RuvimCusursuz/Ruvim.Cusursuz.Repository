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


// Я не понял до конца какое именно уникальное значени, поэтому сделал с HashMap и с HashSet
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
// второй вариант
    public static HashSet<String> returnTheSet (ArrayList<String> mylist){
        HashSet mySet = new HashSet<>();
        for (String parametr: mylist){
            mySet.add(parametr);
        }
        return mySet;
    }


    public static void main(String[] args) {
        ArrayList<String> list = myToDoList();
        System.out.println(list);
        System.out.println(returnTheKey(list));
        System.out.println(returnTheSet(list));
    }
}
