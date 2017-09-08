package behvaioural.chainOfReponsibility.simpleExample;

public class TestCalcChain {
    public static void main(String[] args) {
        Chain chainCal1 = new AddNumbers();
        Chain chainCal2 = new SubtractNumbers();
        Chain chainCal3 = new MultiplyNumbers();
        Chain chainCal4 = new DivideNumbers();

        chainCal1.setNextChain(chainCal2);
        chainCal2.setNextChain(chainCal3);
        chainCal3.setNextChain(chainCal4);

        Numbers request = new Numbers(10,5,"add");
        Numbers request2 = new Numbers(10,5,"subtract");
        Numbers request3 = new Numbers(10,5,"multiply");
        Numbers request4 = new Numbers(10,5,"divide");
        Numbers request5 = new Numbers(10,5,"pow");

        chainCal1.calculate(request);
        chainCal1.calculate(request2);
        chainCal1.calculate(request3);
        chainCal1.calculate(request4);
        chainCal1.calculate(request5);
    }
}
