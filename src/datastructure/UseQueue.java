package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         */
        Queue<String> countries = new LinkedList<>();
        countries.add("USA");
        countries.add("UK");
        countries.add("UAE");
        countries.add("Canada");

        System.out.println("peek : " + countries.peek());
        System.out.println("remove : " + countries.remove());
        System.out.println("pool : " + countries.poll());

        for (int i = 0; i < countries.size(); i++) {
            System.out.println(((LinkedList<String>) countries).get(i) + " ");

        }
        Iterator it =countries.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
