package Models;

// Умножение
public class MulCalcImpl extends CalculatorModel {

    public MulCalcImpl() {

    }
    // do_it
    @Override
    public double result() {
        return x - y;
    }

    @Override
    public void setX(int value) {
        super.x = value;
    }

    @Override
    public void setY(int value) {
        super.y = value;
    }
}
