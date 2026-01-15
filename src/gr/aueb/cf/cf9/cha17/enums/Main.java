package gr.aueb.cf.cf9.cha17.enums;

import gr.aueb.cf.cf9.cha11.User;

public class Main {

    public static void main(String[] args) {

        UserRole role = UserRole.ADMIN;
        String roleAdmin = role.name(); //admin
        System.out.println("Role: " + roleAdmin + ", Ordinal: " + role.ordinal());

        UserRole roleUser = UserRole.valueOf(roleAdmin);
        for(UserRole r : UserRole.values()){
            System.out.println(r.ordinal() + ", " +r.name());
        }





    }
}
