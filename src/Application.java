import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Bottle bottle=new Bottle(2,0.7);
        bottle.open=false;

        System.out.println("The available liquid in the bottle is: "+bottle.getAvailableLiquid()+"l");
        System.out.println("The empty capacity of the bottle: "+bottle.emptyCapacity()+"l");
        System.out.println(bottle.openBottle());
        System.out.println(bottle.closesBottle());

        Scanner read=new Scanner(System.in);
        double amountConsumed=read.nextDouble();
        System.out.println("The person drank "+amountConsumed+" and there is "+ bottle.drinkLiquid(amountConsumed)+"l left");

        bottle.drinkFromClosedBottle();

        double wantedConsumed=read.nextDouble();
        bottle.notEnoughLiquid(wantedConsumed);




    }
}