
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Vector;
import sun.misc.Queue;

public class Main {
    public static void main(String[] args) {
        
        /*
            List Interface
            - Allows duplicated and null values.
            - Provides the facility to maintain the ordered collection
            - LıstIterator
        
            ArrayList Class
            It is like an array, but there is no size limit.
            - It maintains the insertion order internally. (Ekleme sırasını dahili olarak korur.)
            - uses a dynamic array for storing
            - non synchronized
            - Allows Random Access
            - In ArrayList, manipulation is a little bit slower than the LinkedList in Java
            Because a lot of shifting needs to occur if any element is removed from the array list.
        
            LinkedList Class
            - Allow duplicate elements.
            - maintains insertion order.
            - non synchronized
            - manipulation is fast because no shifting needs to occur.
            - It can be used as a list, stack or queue.
        
            Vector Class
            It is similar to the ArrayList, but with two differences:
            1. synchronized
            2. contains many legacy methods that are not the part of a collections framework
        
        
        
            Queue Interface
            - FIFO (First In First Out)
            - Insertion element end of list and removal from beginning
            - class necessary -> Most common classes are the LinkedList and PriorityQueue in Java.
        
            PriorityQueue Class
            - FIFO
            - Sometimes the elements of the queue are needed to be processed according to the priority (Öncelik Sırası)
            
            Comparator Interface
            is used to order the objects of a user-defined class (Nesneleri Sıralamak için)
            - Two Method
            - compare(Object obj1,Object obj2)
            - equals(Object element)
        */
        
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Bursa");
        cities.add("Ankara");
        cities.add("İzmir");
        cities.add("İstanbul");
        cities.add("Konya");
        
        System.out.println("Length of Array: " + cities.size());
        System.out.println("2. Index Element : " + cities.get(2));
        System.out.println("Index of Ankara : " + cities.indexOf("Ankara"));
        System.out.println("Index of Eskişehir: " + cities.indexOf("Eskişehir"));
        System.out.println("LastIndex Of Bursa : " + cities.lastIndexOf("Bursa"));
        
        cities.add(3, "Antalya");
        cities.set(2, "Mersin");
        
        System.out.println(cities.contains("Antalya"));
        System.out.println(cities.contains("İzmir"));
        
        String removeStr = cities.remove(2);
        System.out.println(removeStr + " is removed from list");
        System.out.println(cities.toString());
        
        System.out.println("****************************************************");
        List<String> newCities = new ArrayList<>();
        newCities.add("Kırşehir");
        newCities.add("Eskişehir");
        System.out.println(newCities.toString());
        cities.addAll(newCities);
        System.out.println(cities.toString());
        
        List<String> subList = cities.subList(3, 6);
        System.out.println("SUBLIST : " + subList.toString());
        
        Object[] objArr = cities.toArray();
        String[] strArr = cities.toArray(new String[0]);
        System.out.println(objArr);
        System.out.println(strArr);
        
        System.out.println("");
        for (Object o : objArr) {
            System.out.println(o);
        }
        System.out.println("");
        for (String s : strArr) {
            System.out.println(s);
        }
        cities.clear();
        
        
        // LinkedList
        System.out.println("******************* LINKEDLIST *******************");
        List<String> names = new LinkedList<String>();
        names.add("Hilmi");
        names.add("Hacer");
        names.add("Yunus");
        
        System.out.println("Index 1 : " + names.get(1));
        
        Iterator<String> p = names.iterator();
        while (p.hasNext()) {            
            System.out.println(p.next());
        }
        
        
        // Vector
        System.out.println("******************* VECTOR *******************");
        Vector<Integer> vec = new Vector<>();
        vec.add(200);
        vec.add(300);
        vec.add(100);
        
        for (Integer i : vec) {
            System.out.println(i);
        }
        
        // Queue
        
        // PriorityQueue and Comparator
        Comparator<Integer> compareForEven = new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                int result = a%2 - b%2;
                if (result == 0) {
                    result = a - b;
                }
                return result;
            }
        };
        
        PriorityQueue<Integer> pq = new PriorityQueue(20, compareForEven);
        
        for (int i = 0; i < 20; i++) {
            pq.offer(20-i);
        }
        for (int i = 0; i < 20; i++) {
            System.out.print(pq.poll() + " ");
        }
        
    }
}
