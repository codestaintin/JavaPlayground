public class Adder  extends CalculateBase{
    public Adder() {}

    /**
     *
     * @param leftVal
     * @param rightVal
     */
    public Adder(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {
        double value = getLeftVal() + getRightVal();
        setResult(value);
    }
}
