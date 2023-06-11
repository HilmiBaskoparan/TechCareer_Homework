public class Main {
    public static void main(String[] args) {
        
        int a = 10;
        Integer b = 20;
        System.out.println("a + b = " + (a+b));
        
        // Integer.toString()
        String c = b.toString();
        System.out.println("a + b = " + (a+b.toString()));
        System.out.println("a + c = " + (a+c));
        
        // Integer.parseInt
        
        // Integer.max(int a, int b)
        System.out.println("Max(a,b) : " + Integer.max(a, b));
        
        // Integer.parseInt(String s)
        int num1 = 50;
        String str = "100";
        int num2 = Integer.parseInt(str);
        System.out.println("num1 + num2 = " + (num1+num2));
        
        // Integer.sum(int a, int b)
        System.out.println(Integer.sum(num1, num2));
    }
    
}
