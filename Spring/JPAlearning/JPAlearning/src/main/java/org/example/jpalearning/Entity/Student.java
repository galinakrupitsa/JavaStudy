package org.example.jpalearning.Entity;

import jakarta.persistence.*;

@Entity
@Table (name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private int id;
    @Column (name = "age", nullable = false)
    private int age;
    @Column (name = "first_name",nullable = false,length = 50)
    private String firstName;
    @Column (name = "last_name",nullable = false,length = 50)
    private String lastName;
    @Column (name = "middle_name", length = 50)
    private String middleName;
    public Student() {}
    public Student(int id, int age, String firstName, String lastName, String middleName) {
        this.id = id;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }
    public Student(int age, String firstName, String lastName) {}
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    @Override
    public String toString() {
        return "Student{"+
                ", id" + id +
                ", age" + age +
                ", firstname" + firstName +
                ", lastname" + lastName +
                ", middlename" + middleName +
                '}';

    }
}