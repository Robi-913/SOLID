package solid.s.good;

public class EmployeePaymentService {

    private final EmployeeAdditionalPaymentService employeeAdditionalPaymentService;

    public EmployeePaymentService(EmployeeAdditionalPaymentService employeeAdditionalPaymentService) {

        this.employeeAdditionalPaymentService = employeeAdditionalPaymentService;

    }

    public void calculatePay(GoodEmployee employee) {

        int paystatus = switch (employee.getStatus()) {
            case "A" -> 200;
            case "B" -> 100;
            default -> 50;
        };

        System.out.println("Pay: "+ (paystatus + employeeAdditionalPaymentService.getAdditionalPayment(employee)));

    }
}
