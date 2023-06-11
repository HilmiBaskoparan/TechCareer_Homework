public class Main {
    
    public static void main(String[] args) {
        
        Nullable<Integer> num = new Nullable<>(1000);
        System.out.println(num.getValue());
        
        Nullable<Double> num2 = new Nullable<>(100.2);
        System.out.println(num2.getValue());
        
    }
}
