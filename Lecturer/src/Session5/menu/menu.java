package Session5.menu;

import Session5.RoleStaff;
import Session5.Staff;

public class menu {
    public static void main(String[] args) {
        Staff ani = new Staff("Ani","Ani123","ani@gmail.com", RoleStaff.Outsource,2000000);
        String result = ani.login("ani@gmail.com","An123");
        System.out.println(result);
    }
}
