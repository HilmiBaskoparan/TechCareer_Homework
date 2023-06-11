public class Main {
    
    public static void main(String[] args) {
        
        MyList<Integer> arr = new MyList<>();
        System.out.println(arr.size());
        System.out.println(arr.getCapacity());
        
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        
        System.out.println(arr.size());
        System.out.println(arr.getCapacity());
        System.out.println("Value of Index: " + arr.get(2));
        
        System.out.println(arr.toStringList());
        arr.remove(2);
        arr.add(0);
        arr.set(0, 20);
        arr.add(20);
        arr.add(40);
        
        MyList<Integer> subList = arr.subList(1, 3);
        System.out.println(subList.toStringList());
        
        System.out.println(arr.contains(40));
        
    }
    
}
