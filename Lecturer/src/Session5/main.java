package Session5;

//INHERITANCE
public class main {
    public static void main(String[] args) {
        Staff budi = new Staff("Budi", "budi123", "budi@gmail.com", RoleStaff.Manager, 20000000);
        String result = budi.login("budi@gmail.com","budi123");
        System.out.println(result);
    }
}

class User {
    // in porder to be ablle to acces in inherited class, variable must be protected,
    // all variable if you need to inherit, better made it protected
    protected String name;
    protected String password;
    protected String email;
    protected String DoB; // karena Dob tidak wajib, maka tidak usah dimasukkin diConstructor

    // yang dimasukkan ke dalam constructor hanya data yang requirementya atau data yang prnting dan dibituhkan

    public User(String name, String password, String email) {
        this.name = name;
        this.password = password;
        this.email = email;
    }

    public String login(String email, String password) {  // ini bisa dibuat public karena masih dalam satu package
        if (this.email.equals(email) && this.password.equals(password)) {
            return "berhasil masuk";
        } else {
            return "tidak berhasil masuk";
        }

    }
}

//enum itu misal level yang nanti bisa diterapkan pada variabel variabel, misal supervisor itu 0, outsource itu 2, dan manager itu 3
//sama kaya misal di kelas staff
//private int Role = 0 , berarti role nya supervisor

class Customer extends User {
    private int point;
    private int membership;

    public Customer(String name, String password, String email, int point, int membership) {
        super(name, password, email);
        this.point = point;
        this.membership = membership;
    }
}

