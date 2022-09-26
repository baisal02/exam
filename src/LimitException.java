public class LimitException extends Exception{
    private String message;
    private double remainingAmmount;

    public LimitException(String message, double remainingAmmount) {
        this.message = message;
        this.remainingAmmount = remainingAmmount;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public double getRemainingAmmount() {
        return remainingAmmount;
    }

    public void setRemainingAmmount(double remainingAmmount) {
        this.remainingAmmount = remainingAmmount;
    }

    @Override
    public String toString() {
        return "LimitException{" +
                "message='" + message + '\'' +
                ", remainingAmmount=" + remainingAmmount +
                '}';
    }

}
