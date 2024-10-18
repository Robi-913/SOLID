package solid.s.good;

public class EmployeeTimetrackingService {
    public void reportHours(GoodEmployee employee) {

        System.out.println(employee.getName()+ " has worked "+ employee.getHours()+ " hours.");

    }
}
