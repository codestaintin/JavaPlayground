public class MathEquation {
    private double leftVal;
    private double rightVal;
    private char opCode;
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
     * @return opCode
     */
    public char getOpCode() {
        return opCode;
    }

    /**
     *
     * @param opCode
     */
    public void setOpCode(char opCode) {
        this.opCode = opCode;
    }

    /**
     *
     * @return result
     */
    public double getResult() {
        return result;
    }

    /**
     * Empty constructor
     */
    public MathEquation() {}

    /**
     *
     * @param opCode
     */
    public MathEquation(char opCode) {
        this.opCode = opCode;
    }

    /**
     *
     * @param opCode
     * @param leftVal
     * @param rightVal
     */
    public MathEquation(char opCode, double leftVal, double rightVal) {
        this(opCode);
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    /**
     *
     * @param leftVal
     * @param rightVal
     */
    public void execute(double leftVal, double rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;

        execute();
    }

    /**
     *
     * @param leftVal
     * @param rightVal
     */
    public void execute(int leftVal, int rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;

        execute();
        result = (int) result;
    }

    public void execute() {
        switch (opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'd':
                result = leftVal / rightVal;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            default:
                System.out.println("Error - invalid opCode");
                result = 0.0d;
                break;
        }
    }
}
