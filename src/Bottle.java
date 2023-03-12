public class Bottle {
    double totalCapacity;
    double availableLiquid;
    boolean open;

    Bottle(double totalCapacity, double availableLiquid) {
        this.totalCapacity = totalCapacity;
        this.availableLiquid = availableLiquid;
    }


    public double getAvailableLiquid() {
        return availableLiquid;
    }

    public double emptyCapacity() {
        return totalCapacity - availableLiquid;
    }

    public String openBottle() {
        return "Bottle is opened";

    }

    public String closesBottle() {
        return "Bottle is closed";

    }

    public double drinkLiquid(double liquidDrunk) {
        return availableLiquid - liquidDrunk;
    }

    public void drinkFromClosedBottle() {
        if (!open) {
            System.out.println("First open the bottle then drink. ");
        } else{
            System.out.println("Continue to drink");
        }
    }

    public void notEnoughLiquid(double wanted){
        if(availableLiquid-wanted<0){
            System.out.println("Not enough liquid");
        } else{
            System.out.println("Enough liquid");
        }
    }


}












