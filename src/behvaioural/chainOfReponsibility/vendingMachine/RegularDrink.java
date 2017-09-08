package behvaioural.chainOfReponsibility.vendingMachine;

public class RegularDrink implements Handler {

    private Handler nextDrink;

    @Override
    public void dispenseDrink(Drink drink) {
        if(drink.getAmountReceived() < 20 && drink.getDrinkType() == DrinkType.REGULAR) {
            System.out.println("Dispensing regular drink worth 20rs");
        } else if (drink.getAmountReceived() > 20 && drink.getDrinkType() == DrinkType.REGULAR) {
            System.out.println("You paid more than required! Returning money!!");
        }
        else {
            nextDrink.dispenseDrink(drink);
        }
    }

    @Override
    public void setNextHandler(Handler nextDrink) {
        this.nextDrink = nextDrink;
    }
}
