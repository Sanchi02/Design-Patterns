package behvaioural.chainOfReponsibility.simpleExample;

public class DivideNumbers implements Chain {
    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void calculate(Numbers request) {
        if(request.getCalculationWanted() == "divide") {
            System.out.println("Dividing numbers:");
            System.out.println(request.getNumber1()/request.getNumber2());
        } else {
            System.out.println("Sorry! We support only basic calculator operations.");
        }

    }
}
