package com.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Employee {

    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "darshan", 40000));
        employees.add(new Employee(1, "dimpal", 45000));
        employees.add(new Employee(1, "sanjay", 50000));
        employees.add(new Employee(1, "patil", 70000));
        employees.add(new Employee(1, "shinde", 60000));

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < employees.size(); i++) {

            Employee employee = employees.get(i);

            if (employee.getSalary() > max){
              max = employee.getSalary();
            } else if (employee.getSalary() > secondMax) {
                secondMax = employee.getSalary();
            }
        }

        System.out.println("Highest Salary : " + max );
        System.out.println("Second Highest Salary : " + secondMax) ;

        List<Employee> list = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).toList();
        System.out.println(list.get(0));

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
