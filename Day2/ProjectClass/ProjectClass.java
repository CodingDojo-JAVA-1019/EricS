
public class ProjectClass{
    String name = "";
    String description = "";
    Double initialCost = 0.0;

    public String elevatorPitch(){
       return  name + " ("+initialCost+") "+" : " + description;
    }

    public ProjectClass() {

    }

    public ProjectClass(String name) {
        this.name = name;
    }

    public ProjectClass(String name, String description ) {
        this.name = name;
        this.description = description;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }
    
    public Double getInitialCost(){
        return initialCost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setInitialCost(Double initialCost){
        this.initialCost = initialCost;
    }


}