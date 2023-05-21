
//Encapsulation

import java.util.*;

/* 
public class opps {
    public static void main(String args[]) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        // p1.setColor("Green");
        // System.out.println(p1.color);
        // OR
        p1.color = "Green";
        System.out.println(p1.color);

        // BankAccount
        BankAccount MyAcc = new BankAccount();
        MyAcc.username = "Lucky";
        // passowrd we can't access it we can just cange it by function wic will be
        // defined in te main function
        MyAcc.setPassword("123456");

    }
}

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }
}

class Pen {
    String color;
    int tip;

    void setTip(int newTip) {
        tip = newTip;
    }

    void setColor(String newColor) {
        color = newColor;
    }
}

//ineritance
public class opps {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "lucky";
        s1.rollno = 2203354;
        s1.password = "lucky123";
        s1.marks[0] = 100;
        s1.marks[1] = 98;
        s1.marks[2] = 87;
        // copy constructor
        Student s2 = new Student(s1);
        s2.password = "xyz";
        s1.marks[2] = 100;
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }

}


class Student {
    String name;
    int rollno;
    String password;
    int marks[];

    // Constructor
    // copy constructor
    // a]sallow copy converter
    
     * Student(Student s1) {
     * marks = new int[3];
     * this.name = s1.name;
     * this.rollno = s1.rollno;
     * this.marks = s1.marks;
     * }
     
    // b]deep copy converter
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.rollno = s1.rollno;
        for(int i=0;i<marks.length;i++){
            this.marks[i]=s1.marks[i];
        }
    }

    // non-parameterized
    Student() {
        marks = new int[3];
        System.out.println("Constructor is called....");
    }

    // parameterized
    Student(String name) {
        marks = new int[3];
        this.name = name;
    }

    Student(int rollno) {
        marks = new int[3];
        this.rollno = rollno;
    }
}*/
//Abstraction (Abstract Class)
/* 
public class opps {
    public static void main(String args[]) {
        horse h = new horse();
        h.eat();
        h.walk();
        chiken c = new chiken();
        c.eat();
        c.walk();
    }
}

abstract class Animal {
    String color;

    Animal() {
        color = "Brown";
    }

    void eat() {
        System.out.println("Animals eats");
    }

    abstract void walk();
}

class horse extends Animal {
    void changeColor(){
        color="darkBrown";
    }

    void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class chiken extends Animal {
    void changeColor(){
        color="Yellow";
    }
    void walk() {
        System.out.println("Walks on 2 legs");
    }
}*/
