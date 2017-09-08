package behvaioural.chainOfReponsibility.vendingMachine;

enum DrinkType {
    REGULAR, DIET, BRANDED;
}

public class Drink {
    private int amountReceived;
    private DrinkType drinkType;

    public Drink(int amountReceived, DrinkType drinkType) {
        this.amountReceived = amountReceived;
        this.drinkType = drinkType;
    }

    public int getAmountReceived() {
        return amountReceived;
    }

    public void setAmountReceived(int amountReceived) {
        this.amountReceived = amountReceived;
    }

    public DrinkType getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(DrinkType drinkType) {
        this.drinkType = drinkType;
    }
}
