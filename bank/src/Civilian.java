// Гражданин
public class Civilian extends Client {
    public Civilian(double salary) {
        super(salary);
    }

    @Override
    double getInterestRate() {
        double creditSize = getCreditSize();
        double interestRate;
        if (creditSize > 1000000) {
            interestRate = 1000000 / creditSize;
        } else if (creditSize > 10000) {
            interestRate = 17;
        } else {
            interestRate = 19;
        }
        return interestRate;
    }

    @Override
    double getCreditSize() {

        return salary * 10;
    }

}