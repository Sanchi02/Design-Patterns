package behvaioural.chainOfReponsibility.vendingMachine;

public class DietDrinks implements Handler {

    private Handler nextDrink;

    @Override
    public void dispenseDrink(Drink drink) {
        if(drink.getAmountReceived() < 40 && drink.getDrinkType() == DrinkType.DIET) {
            System.out.println("Dispensing diet drink worth 40rs");
        } else if (drink.getAmountReceived() > 40 && drink.getDrinkType() == DrinkType.REGULAR) {
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
