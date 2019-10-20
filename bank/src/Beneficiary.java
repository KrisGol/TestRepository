// Льготники
public class Beneficiary extends Client {

    public Beneficiary(double salary) {
        super(salary);
    }

    @Override
    double getInterestRate() {
        double creditSize = getCreditSize();
        double interestRate;
        if (creditSize > 1000000) {
            interestRate = 1000000 / creditSize;
        } else if (creditSize > 100000) {
            interestRate = 11;
        } else {
            interestRate = 13;
        }
        return interestRate;
    }

    @Override
    double getCreditSize() {

        return salary * 12;
    }
}
