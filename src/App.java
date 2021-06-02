public class App 
{
    
    public static void main(String[] args) 
    {
        
        Cat cat1 = new Cat("Grizabella", "white", 29, true);
        ausgabe(cat1.tellYourAtrributes("name"));
        ausgabe(cat1.tellYourAtrributes("furColor"));
        ausgabe(cat1.tellYourAtrributes("age"));
        ausgabe(cat1.tellYourAtrributes("age"));
        ausgabe(cat1.tellYourAtrributes("age"));
        ausgabe(cat1.tellYourAtrributes("age"));
        

        System.out.println("---------------------------");
        
        Cat cat2 = new Cat("Alonzo", "black", 35, false);
        ausgabe(cat2.tellYourAtrributes("name"));
        ausgabe(cat2.tellYourAtrributes("furColor"));
        ausgabe(cat2.tellYourAtrributes("age"));
        
    }


    public static void ausgabe(String outputStr) 
    {
        System.out.println(outputStr);
    }
}
