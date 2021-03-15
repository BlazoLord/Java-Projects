package trains;

public class PassengerCarriage extends RailroadCar {
    private int numberOfPassengers;
    
    public PassengerCarriage(String id, double tareWeight, int numberOfPassengers) {
        super(id, tareWeight);
        this.numberOfPassengers = numberOfPassengers;
    }
    
    public double calculateTotalWeight() {
        return (numberOfPassengers*105.0)/1000;
    }
    
    public String getDetails() {
        return super.getDetails() + "Passengers: " + numberOfPassengers + 
                "\nPassenger Weight: " + calculateTotalWeight() + " tonnes\nTotal Weight: " + 
                (calculateTotalWeight()+getTareWeight()) + " tonnes\n";
    }
    
    public int getPassengers() {
        return numberOfPassengers;
    }
}
