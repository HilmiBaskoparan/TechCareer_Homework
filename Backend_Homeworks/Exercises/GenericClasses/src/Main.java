public class Main {
    public static void main(String[] args) {
        
        // Normal Class
        NullableStr str = new NullableStr("Hilmi");
        str.run();
        
        
        // Generic Class
        System.out.println("");
        Nullable<Integer> number1 = new Nullable<>(10);
        number1.run();
        
        Nullable<String> surname = new Nullable<>("Baskoparan");
        surname.run();
        
        Nullable<Boolean> bool = new Nullable<>(true);
        bool.run();
        
        Nullable<Long> number2 = new Nullable<>(null);
        number2.run();
    }
}
