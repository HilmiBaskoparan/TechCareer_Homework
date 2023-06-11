/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodoverloading;

/**
 *
 * @author Emre
 */
public class MethodOverloading {

    public static void selamlama() {
        System.out.println("Merhaba Hoşgeldiniz...");
    }
    public static void selamlama(String isim) {
        System.out.println("Merhaba " + isim + " hoşgeldiniz...");
    }
    public static void selamlama(String isim, char cinsiyet) {
        if (cinsiyet == 'k') {
            System.out.println( isim + " hanım hoşgeldiniz...");
        }else if (cinsiyet == 'e') {
            System.out.println( isim + " bey hoşgeldiniz...");
        }else {
            System.out.println("Yanlış Cinsiyet Girdisi (k / e)");
        }
    }
    public static int toplama(int a,int b) {
        return a+b;
    }
    public static int toplama(int a, int b, int c) {
        return a+b+c;
    }
    public static void main(String[] args) {
        /*
        Method Overloading
        MethodOverloading
        If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.
        Bir sınıfın aynı ada sahip fakat parametreleri farklı olan birden çok methodu(fonksiyon) olması durumu
        */
        
        selamlama("Hilmi");
        selamlama("Hilmi",'e');
        System.out.println("Toplama : " + (toplama(10, 6)));
        System.out.println("Toplama : " + (toplama(10, 25, 15)));
        
        
    }
    
}
