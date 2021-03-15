package trains;

public abstract class RailroadCar {
    private String id;
    private double tareWeight;
    
    public RailroadCar(String id, double tareWeight) {
        this.id = id;
        this.tareWeight = tareWeight;
    }
    
    public double getTareWeight() {
        return tareWeight;
    }
    
    public abstract double calculateTotalWeight();
    
    public String getDetails() {
       return "ID: " + id + "\tTare Weight: " + tareWeight + "\n";
    }
    
    public String toString() {
        return "Railroad Car:- \n\n" + getDetails();
    }
}
