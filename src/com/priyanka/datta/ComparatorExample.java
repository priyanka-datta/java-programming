package com.priyanka.datta;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(new Student(1,"Divya",5),new Student(2,"Anik",4));
        studentList.sort(new AgeComparator());
        studentList.forEach(student -> System.out.println(student.toString()));

    }
}

class AgeComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getAge()==o2.getAge())
            return 0;
        else if (o1.getAge()>o2.getAge())
            return 1;
        else
            return -1;
    }
}

class  Student{
    private int id;

    private String name;

    private int age;

    public Student() {
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
