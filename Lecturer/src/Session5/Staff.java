package Session5;

public class Staff extends User {
    protected RoleStaff role = RoleStaff.Supervisor;
    protected int salary;

    public Staff(String name, String password, String email, RoleStaff role, int salary) {
        super(name, password, email);
        this.role = role;
        this.salary = salary;
    }
}
