package com.jieming.utils;

import java.util.*;

public class Base {
    public static void main(String[] args) {
        // list
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        list.add(1);
        list.clear();

        if (list.isEmpty()){
            System.out.println("List is empty!");
        } else{
            System.out.println(list.size());
        }

        list.add(2);
        list.add(10);

        for (int i = 0; i<list.size(); i++){
            list.set(i, list.get(i) + 1);
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // Stack is a class, others are interfaces
        Stack<Integer> stk = new Stack<>();
        stk.push(1);
        stk.push(2);
        stk.push(10);

        System.out.println(stk.pop());
        System.out.println(stk.peek());

        // Queue
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(10);

        System.out.print(q.remove() + " ");
        System.out.println(q.peek());

        // heap
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        heap.add(2);
        heap.add(1);
        heap.add(10);

        System.out.print(heap.peek()+" ");
        heap.remove();
        System.out.println(heap.peek());

        // greater heap
        PriorityQueue<Integer> gheap = new PriorityQueue<>(Collections.reverseOrder());

        gheap.add(2);
        gheap.add(1);
        gheap.add(10);

        System.out.println(gheap.peek());

        // Set
        // HashSet
        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(1);
        set.add(10);
        set.add(100);
        set.remove(2);

        System.out.print(set.contains(2) + " ");
        System.out.println(set.contains(5));

        // without order
        for (int x: set){
            System.out.print(x + " ");
        }
        System.out.println();

        // TreeSet
        // log(n)
        TreeSet<Integer> tree = new TreeSet<>(); // with order

        tree.add(2);
        tree.add(1);
        tree.add(22);
        tree.add(100);
        // binary search
        System.out.print(tree.ceiling(23) + " ");
        System.out.println(tree.floor(23));

        // Map
        // HashMap o(1)
        Map<String, Integer> map = new HashMap<>();
        map.put("123", 2);
        map.put("321", 3);
        map.put("louJieming", 12);

        for (Map.Entry<String, Integer> entry: map.entrySet()){
            System.out.printf("%s: %d\n", entry.getKey(), entry.getValue());
        }

        map.remove("321");
        System.out.print(map.get("123") + " ");
        System.out.println(map.containsKey("321"));

        // TreeMap o(log(n)) with order
        Map<Integer, Integer> treemap = new TreeMap<>();

        treemap.put(312, 5);
        treemap.put(123, 2);
        treemap.put(213, 10);

        for (Map.Entry<Integer, Integer> entry: treemap.entrySet()){
            System.out.printf("%d: %d\n", entry.getKey(), entry.getValue());
        }

        // binary search, o(log(n)) need to be a treemap
        TreeMap<Integer, Integer> treemap1 = new TreeMap<>();
        treemap1.put(312, 5);
        treemap1.put(123, 2);
        treemap1.put(213, 10);
        Map.Entry<Integer, Integer> up = treemap1.ceilingEntry(200);
        Map.Entry<Integer, Integer> down = treemap1.floorEntry(200);

        System.out.println(up);
        System.out.println(down);
    }
}
