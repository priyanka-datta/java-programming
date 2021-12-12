package com.priyanka.datta;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorJava8 {

    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(new Employee(1,"Debparna"),new Employee(5,"Anik"),
                new Employee(3,"Parna"));

        List<Employee> sortedEmployee = employeeList.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
        List<EmployeeDto> sortedEmployeeById = employeeList.stream().sorted(Comparator.comparing(Employee::getId)).map(EmployeeDto::apply).collect(Collectors.toList());
        System.out.println(sortedEmployee.toString());
        System.out.println(sortedEmployeeById.toString());
    }
}

class Employee{
    private int id;

    private  String name;

    public Employee() {
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

class EmployeeDto{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static EmployeeDto apply(Employee employee){
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setName(employee.getName());
        return employeeDto;
    }

    @Override
    public String toString() {
        return "EmployeeDto{" +
                "name='" + name + '\'' +
                '}';
    }
}
