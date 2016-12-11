package Assignments.salarySystem_bad;

import java.util.ArrayList;


class SalarySystem {

    private final ArrayList<IEmployee> employees = new ArrayList<>();

    SalarySystem() {
        IEmployee j = new JuniorEmployee("Jaap");
        IEmployee m = new NormalEmployee("Fred");
        IEmployee s = new SeniorEmployee("Hans");
        j.setSalary(1700.0);
        m.setSalary(2000);
        s.setSalary(2300);
        addColleague(j);
        addColleague(m);
        addColleague(s);
    }

    private void addColleague(IEmployee c) {
        employees.add(c);
    }

    IEmployee search(String s) {
        IEmployee employee = null;
        for (IEmployee e : employees) {
            if (e.getName().equals(s)) ;
            employee = e;
        }
        return employee;
    }

    void raiseSalary(IEmployee employee) {
        // if emp is jr, then he gets 5% raise + 100
        // when emp is mr, he gets 6% + 100
        // when emp is sr, he gets 7%
        employee.raiseSalary();
    }

    void printAll() {
        for (IEmployee e : employees) {
            System.out.println(e.toString());
        }
    }
}


