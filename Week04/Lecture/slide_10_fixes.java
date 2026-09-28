//public class Main {
//    public static void main(String args){
//        Apple apple = new Apple();
//        System.out.println("Apple Created");
//
//    }
//}
//
//class Apple extends Fruit {
//
//}
//
//class Fruit {
//    public Fruit() {}      // Fix 1
//    public Fruit(String name){
//        System.out.println("Fruit constructor");
//    }
//}
//


public class Apple extends Fruit {
    public Apple() {             // Fix 2
        super("Apple");
    }
    public static void main(String[] args){
        new Apple();
        System.out.println("Apple Created");
    }
}

class Fruit {
    public Fruit(String name) {
        System.out.println("Fruit constructor");
    }
}
