package behvaioural.chainOfReponsibility.simpleExample;

public class MultiplyNumbers implements Chain {
    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void calculate(Numbers request) {
        if(request.getCalculationWanted() == "multiply") {
            System.out.println("Multiplying numbers:");
            System.out.println(request.getNumber1()*request.getNumber2());
        } else {
            nextInChain.calculate(request);
        }

    }
}
