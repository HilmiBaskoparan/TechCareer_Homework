public class Main {
    public static void main(String[] args) {
        
        /*  For Encapsulation
            1. Private
            2. Constructor
            3. Getter and Setter
        */
        
        Book b1 = new Book("Harry Potter", "JK Rowling", 500);
        Book b2 = new Book("Harry Potter", "JK Rowling", -100);
        System.out.println(b1.getAuthor());
        System.out.println(b2.getPageCount());
        
    }
}
