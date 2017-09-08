package behvaioural.chainOfReponsibility.vendingMachine;

public interface Handler {
    public void setNextHandler(Handler nextDrink);
    public void dispenseDrink(Drink drink);
}
