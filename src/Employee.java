public class Employee {

    private static final Employee employee = new Employee();

    private Employee(){}

    public static Employee getEmployee(){
        return employee;
    }

}
