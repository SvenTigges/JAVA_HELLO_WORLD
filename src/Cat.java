public class Cat 
{
    //Property | Attribut | Field
    public String name = "nobody"; 

    public void tellYourAddress(){
        System.out.println("Blick von innen: " + this);

    }
    public void tellYourName() {
        System.out.println(this.name);
    }
}
