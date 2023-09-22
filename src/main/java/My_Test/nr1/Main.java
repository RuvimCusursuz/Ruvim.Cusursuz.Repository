package My_Test.nr1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            list.add(i);
        }

        list.contains(5);
        System.out.println(list);

        HashMap<String, String>  hashMap = new HashMap<>();
        hashMap.put("Login", "Ruvim@gmail.com");

        HashSet<String> hashSet = new HashSet<>();

    }
}
