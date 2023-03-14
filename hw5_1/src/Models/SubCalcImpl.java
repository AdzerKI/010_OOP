package Models;

// Вычитание
public class SubCalcImpl extends CalculatorModel {

    public SubCalcImpl() {

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
