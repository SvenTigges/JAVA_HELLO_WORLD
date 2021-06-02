public class Cat 
{
    //Property | Attribut | Field
    public String name; 
    public String furColor;
    public int age; 
    public boolean isFemale; 
    public int level;   // intern verwendet 

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
            default:
                return "error";
        }
        
    }

    public String checkCompliance() {
        if (isFemale) 
        {
            return this.checkEscalationLevel(); 
        } 
        else 
        {
            return Integer.toString(this.age);  
        }
    }

    public String checkEscalationLevel() 
    {
        // 1. --> "This is an inappropriate question!"

        // 2. --> "I've told you once!"

        // 3. --> "Talk to the hand!"

        // 4. --> "something else ..."

        this.level++; 

        switch (level) {
            case 1:
                return "this is an inappropriated question!";
            case 2:
                return  "I've told you once!";
            case 3:
                return "Talk to the hand!";   
            default:
                return "Fuck off!";
        }
    }
}  

















