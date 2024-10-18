package solid.s.good;

public class EmployeeRepository {
    public void save(GoodEmployee employee) {

        System.out.println("Saving employee "+ employee.getName()+ " to the database.");

    }
}
