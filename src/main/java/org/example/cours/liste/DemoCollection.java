package org.example.cours.liste;

import java.util.*;

public class DemoCollection {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");
        System.out.println("vector "+ vector );

        System.out.println(vector.size());
        System.out.println(vector.get(0));
        System.out.println(vector.contains("Banana"));

        SortedSet<String> sortedSet = new TreeSet<>();
        sortedSet.add("Java");
        sortedSet.add("Python");
        sortedSet.add("Js");
        sortedSet.add("Java");
        System.out.println(sortedSet);

        System.out.println(sortedSet.first());
        System.out.println(sortedSet.last());

        SortedSet<String> headSet = sortedSet.headSet("Js");
        System.out.println(headSet);

        LinkedList<Double> linkedList = new LinkedList<>();
        linkedList.add(3.15);
        linkedList.add(2.15);
        linkedList.add(33.55);

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        linkedList.removeFirst();
        System.out.println(linkedList);

        SortedMap<String, Integer> sortedMap = new TreeMap<>();
        sortedMap.put("Java", 44);
        sortedMap.put("Python", 4);
        sortedMap.put("C++", 22);
        System.out.println(sortedMap);

        System.out.println(sortedMap.keySet());
        System.out.println(sortedMap.values());
        sortedMap.remove("Java");
        System.out.println(sortedMap);

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Java", 44);
        hashMap.put("Python", 4);
        hashMap.put("C++", 22);
        System.out.println(hashMap);

        String csharp = "c#";
        int valueCSharp = 40;

        hashMap.put(csharp, valueCSharp);
        System.out.println(hashMap);
        System.out.println(csharp.hashCode());
        System.out.println(hashMap.size());
        System.out.println(hashMap.get("Python"));
        System.out.println(hashMap.containsKey("toto"));
        hashMap.remove("Python");
        System.out.println(hashMap);



    }
}
