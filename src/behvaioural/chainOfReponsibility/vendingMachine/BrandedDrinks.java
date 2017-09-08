package behvaioural.chainOfReponsibility.vendingMachine;

public class BrandedDrinks implements Handler{

    private Handler nextDrink;

    @Override
    public void dispenseDrink(Drink drink) {
        if(drink.getAmountReceived() < 60 && drink.getDrinkType() == DrinkType.BRANDED) {
            System.out.println("Dispensing branded drink worth 60rs");
        } else if (drink.getAmountReceived() > 20 && drink.getDrinkType() == DrinkType.REGULAR) {
            System.out.println("You paid more than required! Returning money!!");
        }
        else {
            System.out.println("The drink you just requested is not available");
            System.out.println("Returning money!");
        }

    }

    @Override
    public void setNextHandler(Handler nextDrink) {
        this.nextDrink = nextDrink;
    }

}
