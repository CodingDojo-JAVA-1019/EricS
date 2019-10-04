
public class Test{
    public static void main(String[] args) {
        ProjectClass pc = new ProjectClass();
        
        pc.setName("john");
        pc.setDescription("tall");
        pc.setInitialCost(33.43);
        System.out.println(pc.elevatorPitch());
        

    }
}


// Add an additional initialCost member variable that is of type double and has both getters and setters

//  Add this to the elevator pitch in parentheses after the name, e.g.: name (cost): description

//  Create a Portfolio class that will keep an ArrayList of Projects in the field projects. Use generics to ensure these are Project objects.

//  Add the appropriate getters/setters/constructors for this class to work

//  Add the getPortfolioCost method that calculates and returns the cost to buy the entire portfolio.

//  Add the showPortfolio method that will print all the project elevator pitches, followed by the total cost.