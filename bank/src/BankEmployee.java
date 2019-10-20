// Сотрудники банка
public class BankEmployee extends Client {

    public BankEmployee(double salary) {
        super(salary);
    }

    @Override
    double getInterestRate() {
        return 10;
    }

    @Override
    double getCreditSize() {

        return salary * 24;
    }
}