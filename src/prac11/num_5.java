package prac11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class num_5 {
    public static void main(String [] args){
        int el = 10000000;
        List<Integer> arraylist = new ArrayList<>();
        long start = System.currentTimeMillis();
        for  (int i = 0; i < el; i++){
            arraylist.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("arraylist add " + (end - start) + "мс");
        start = System.currentTimeMillis();
        arraylist.remove(el / 2);
        end = System.currentTimeMillis();
        System.out.println("arraylist remove " + (end - start) + "ms");
        start = System.currentTimeMillis();
        arraylist.contains(el/2);
        end = System.currentTimeMillis();
        System.out.println("arraylist search " + (end-start) + "ms");
        List<Integer> linkedlist = new LinkedList<>();
        start = System.currentTimeMillis();
        for (int i = 0; i < el; i++){
            linkedlist.add(i);
        }
        end = System.currentTimeMillis();
        System.out.println("LinkedList add " + (end - start) + "ms");
        start = System.currentTimeMillis();
        linkedlist.remove(el / 2 );
        end = System.currentTimeMillis();
        System.out.println("LinkedList remove " + (end - start) + "ms");
        start = System.currentTimeMillis();
        linkedlist.contains(el / 2);
        end = System.currentTimeMillis();
        System.out.println("LinkedList contains " + (end - start) + "ms");
    }
}
