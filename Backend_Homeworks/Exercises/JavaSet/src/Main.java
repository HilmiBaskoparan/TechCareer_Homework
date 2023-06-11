
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        
        /*  SET
            - All elements UNIQUE (contains no duplicate elements)
            - Contains at most one empty element. (One NULL Element)
        
            HashSet
            Inherits the AbstractSet class and implements Set interface
            - Contains unique elements only.
            - Allows NULL value
            - Non-synchronized
            - doesn't maintain the insertion order. Elements are inserted on the basis of their hashcode.
            (HashSet, ekleme sırasını korumaz. Burada öğeler, hashcode'larına göre eklenir.)
            - It is the best approach for search operations.
            
            LinkedHashSet 
            Java LinkedHashSet class is a Hashtable and Linked list implementation of the Set interface. It inherits the HashSet class and implements the Set interface.
            - Contains unique elements only 
            - Provides all optional set operations and permits null elements
            - Non-synchronized
            - maintains insertion order (Ekleme Sırasını Korur)
        
            TreeSet
            Implements the Set interface that uses a tree for storage. It inherits AbstractSet class and implements the NavigableSet interface.
            - Contains unique elements only
            - Doesn't allow null element.
            - Non-synchronized
            - The objects of the TreeSet class are stored in ascending order.
            - The TreeSet can only allow those generic types that are comparable. For example The Comparable interface is being implemented by the StringBuffer class.
        */ 
        HashSet<String> hList = new HashSet<>();
        hList.add("Hilmi");
        hList.add("Hacer");
        hList.add("Başkoparan");
        hList.add("Hilmi");
        hList.add("1");
        hList.add("2");
        
        Iterator<String> itr = hList.iterator();
        while (itr.hasNext()) {            
            System.out.println(itr.next());
        }
        
        System.out.println("");
        
        // LinkedHashSet --------------------------------------------------------
        LinkedHashSet<String> linkedHS = new LinkedHashSet<>();
        linkedHS.add("Hilmi");
        linkedHS.add("Hacer");
        linkedHS.add("Başkoparan");
        linkedHS.add("Hilmi");
        linkedHS.add("1");
        linkedHS.add("2");
        
        for (String s : linkedHS) {
            System.out.println(s);
        }
        
        System.out.println("");
        
        // TreeSet --------------------------------------------------------
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Hilmi");
        ts.add("Hacer");
        ts.add("Başkoparan");
        ts.add("3");
        ts.add("5");
        ts.add("Hilmi");
        ts.add("Hacer");
        ts.add("2");
        ts.add("1");
        ts.add("4");
        
        Iterator<String> i = ts.iterator();
        while (i.hasNext()) {            
            System.out.println(i.next());
        }
        
        System.out.println("");
        System.out.println("HashSet       : " + hList.toString());
        System.out.println("LinkedHashSet : " + linkedHS.toString());
        System.out.println("TreeSet       : " + ts.toString());
    }
}