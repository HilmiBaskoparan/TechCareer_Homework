public class Main {

    public static void speakIt(Object object){

        if (object instanceof Dog){
            Dog kopekTest = (Dog)object;
            System.out.println(kopekTest.speak());
        }
        else if(object instanceof Cat){
            Cat kediTest = (Cat)object;
            System.out.println(kediTest.speak());
        }
        else if (object instanceof Horse){
            Horse atTest = (Horse)object;
            System.out.println(atTest.speak());
        }
        else if (object instanceof Animal){
            Animal hayvanTest = (Animal)object;
            System.out.println(hayvanTest.speak());
        }
    }

    public static void main(String[] args){

        // Temel Gösterim
        Cat c1 = new Cat("Nasip");

        if (c1 instanceof Cat){
            System.out.println("Bu nesne Kedi sınıfından");
        }

        if (c1 instanceof Animal){
            System.out.println("Bu nesne Hayvan sınıfından");
        }

        //Fonksiyon ile gösterim

        Cat c2 = new Cat("Nasip");
        Dog d1 = new Dog("Zizu");
        Horse h1 = new Horse("BoldPilot");
        Animal a1 = new Animal("Turunç");

        speakIt(c2);
        speakIt(d1);
        speakIt(h1);
        speakIt(a1);
    }
}