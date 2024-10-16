package solid.s.good;

public class EmployeeAdditionalPaymentService {

    public int getAdditionalPayment(GoodEmployee employee) {

        if (employee.getHours() > 40) {
            return 50;
        }

        return 0;

    }
}
