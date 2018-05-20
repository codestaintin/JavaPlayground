public abstract class CalculateBase {
    private double leftVal;
    private double rightVal;
    private double result;

    /**
     *
     * @return leftVal
     */
    public double getLeftVal() {
        return leftVal;
    }

    /**
     *
     * @param leftVal
     */
    public void setLeftVal(double leftVal) {
        this.leftVal = leftVal;
    }

    /**
     *
     * @return rightVal
     */
    public double getRightVal() {
        return rightVal;
    }

    /**
     *
     * @param rightVal
     */
    public void setRightVal(double rightVal) {
        this.rightVal = rightVal;
    }

    /**
     *
     * @return result
     */
    public double getResult() {
        return result;
    }

    /**
     *
     * @param result
     */
    public void setResult(double result) {
        this.result = result;
    }

    public CalculateBase() {}

    /**
     *
     * @param leftVal
     * @param rightVal
     * @return
     */
    public CalculateBase(double leftVal, double rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    public abstract void calculate();
}
