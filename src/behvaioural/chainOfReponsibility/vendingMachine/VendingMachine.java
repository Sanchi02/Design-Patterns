package behvaioural.chainOfReponsibility.vendingMachine;

public class VendingMachine {
    public static void main(String[] args) {
        Handler handler = new RegularDrink();
        Handler handler1 = new DietDrinks();
        Handler handler2 = new BrandedDrinks();

        handler.setNextHandler(handler1);
        handler1.setNextHandler(handler2);

        Drink requestDrink = new Drink(15,DrinkType.REGULAR);
        Drink requestDrink1 = new Drink(35,DrinkType.REGULAR);
        Drink requestDrink2 = new Drink(35,DrinkType.DIET);
        Drink requestDrink3 = new Drink(75,DrinkType.DIET);
        Drink requestDrink4 = new Drink(55,DrinkType.BRANDED);

        handler.dispenseDrink(requestDrink);
        handler.dispenseDrink(requestDrink1);
        handler.dispenseDrink(requestDrink2);
        handler.dispenseDrink(requestDrink3);
        handler.dispenseDrink(requestDrink4);
    }
}
