package My_Test.nr1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            list.add(i);
        }
            Object object = new Object();
//        object.equals()
        String p = "a";
        String p1= new String("a");
        System.out.println(p == p1);
        System.out.println(p.equals(p1));

        list.contains(5);
        System.out.println(list);

        HashMap<String, String>  hashMap = new HashMap<>();
        hashMap.put("Login", "Ruvim@gmail.com");

        HashSet<String> hashSet = new HashSet<>();




        System.out.println(fibEf(100));

    }

    public static long fibEf(int a){
            List<Long> fibAll = new ArrayList<>();
            fibAll.add(0l);
            fibAll.add(1l);

        for (int i = 2; i <= a; i++) {
            fibAll.add(fibAll.get(i-1) + fibAll.get(i-2));
        }
        return fibAll.get(fibAll.size()-1);
//        return fibAll.stream().mapToInt(x -> x).sum();
    }
}
