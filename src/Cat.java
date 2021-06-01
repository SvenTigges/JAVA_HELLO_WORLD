public class Cat 
{
    //Property | Attribut | Field
    public String name; 
    public String furColor;
    public int age; 

    public Cat(String name, String furColor, int age) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
    }
    public void tellYourName() {
        System.out.println(this.name);
    } 
    public void tellYourFurColor() {
        System.out.println(this.furColor);
    }
    public void tellYourAge() {
        System.out.println(this.age);
    }
}
 