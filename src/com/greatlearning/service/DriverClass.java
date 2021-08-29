package com.greatlearning.service;

import com.greatlearning.model.Employee;

import java.util.Scanner;

public class DriverClass {

    public static void main(String[] args) {

        Employee emp = new Employee("Ganesh", "Kumar");
        CredentialsService creds = new CredentialsService();
        System.out.println("Password is: " + creds.generatePassword());

        System.out.println("Please enter the department from the following");
        System.out.println("1. Technical");
        System.out.println("2. Admin");
        System.out.println("3. Human Resource");
        System.out.println("4. Legal");
        System.out.print("Enter input: ");

        Scanner input = new Scanner(System.in);
        int deptId = input.nextInt();
        String dept = null;
        switch (deptId){
            case 1:
                dept = "tec";

                break;
            case 2:
                dept = "adm";

                break;

                case 3:
                    dept = "hum";

                    break;
            case 4:
                dept = "leg";

                break;
            default:
                dept = "unknown";
        }

        String email = creds.generateEmailAddress(emp.getFirstName(), emp.getLastName(), dept);
        char[] password = creds.generatePassword();

        creds.showCredentials(emp, email, password);
    }
}
