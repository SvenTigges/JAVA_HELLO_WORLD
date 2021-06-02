public class Cat 
{
    //Property | Attribut | Field
    public String name; 
    public String furColor;
    public int age; 
    public boolean isFemale; 


    public Cat(String name, String furColor, int age, boolean isFemale) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
        this.isFemale = isFemale;
    }


    public String tellYourAtrributes(String chechStr) {
        switch (chechStr) {
            case "name":
                return this.name;   
            case "furColor":
                return this.furColor;  
            case "age":
                return this.checkCompliance(); 
                //return Integer.toString(this.age);
                //return String.valueOf(this.age);
            default:
                return "error";
        }
        
    }
    public String checkCompliance() {
        if (isFemale) 
        {
            return "This is an inappropriate qestion!";
        } 
        else 
        {
            return Integer.toString(this.age);  
        }
    }
}  

















/*  Erste überlegung 
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
*/ 