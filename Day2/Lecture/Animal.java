
public class Animal{
    public int numberOfLegs;
    private String type;

    public Animal() { //constructor , basically returns this
        this.numberOfLegs = numberOfLegs;
        this.type = type;
    }

    public int getNumberOfLegs() {
        return this.numberOfLegs; 
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getType(){
        return type;
    }

    public void setType(String type) {
        //type = type; would not work
        this.type = type; 
    }
}
    
