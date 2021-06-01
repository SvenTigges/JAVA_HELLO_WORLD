public class App {
    
    public static void main(String[] args) {
        
        Cat cat1 = new Cat();
        System.out.println("Blick von aussen: " + cat1);
        cat1.changeYourName("Grizabella");
        // changeYourAge
        //changeYourFurColor

        cat1.tellYourAddress();
        cat1.tellYourName();
        
        
        System.out.println("---------------------------");
        
        Cat cat2 = new Cat();
        System.out.println("Blick von aussen: " + cat2);
        cat2.changeYourName("Alonzo");
        cat2.tellYourAddress();
        cat2.tellYourName();
    }
}
