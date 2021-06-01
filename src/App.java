public class App {
    
    public static void main(String[] args) {
        
        Cat cat1 = new Cat("Grizabella", "white", 29);
        cat1.tellYourAtrributes("name");
        cat1.tellYourAtrributes("furColor");
        cat1.tellYourAtrributes("age");

        System.out.println("---------------------------");
        
        Cat cat2 = new Cat("Alonzo", "black", 35);
        cat2.tellYourAtrributes("name");
        cat2.tellYourAtrributes("furColor");
        cat2.tellYourAtrributes("age");
    }
}
