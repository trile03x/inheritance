/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI01;

import java.util.*;

class Person {

    String name;
    String address;
    String phone;
    String email;

    Person(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    void out() {
        System.out.println("- Name : " + name
                + "\n- Address : " + address
                + "\n- Phone Number : " + phone
                + "\n- Email : " + email);
    }

}

class Student extends Person {

    String classstatus;

    Student(String classstatus, String name, String address, String phone, String email) {
        super(name, address, phone, email);
        this.classstatus = classstatus;
    }

    void out() {
        super.out();
        System.out.println("- Class Status : " + classstatus);

    }

}

class Eployee extends Person {

    String office;
    int salary;
    int datehired;

    Eployee(String office, int salary, int datehired, String name, String address, String phone, String email) {
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.datehired = datehired;
    }

    void out() {
        super.out();
        System.out.println("- Office : " + office
                + "\n- Salary : " + salary
                + "\n- Date - hired : " + datehired);
    }
}

class Faculy extends Eployee {

    int officehour;
    String rank;

    Faculy(int officehour, String rank, String office, int salary, int datehired, String name, String address, String phone, String email) {
        super(office, salary, datehired, name, address, phone, email);
        this.officehour = officehour;
        this.rank = rank;
    }

    void out() {
        super.out();
        System.out.println("- Office Hour : " + officehour
                + "\n- Rank : " + rank);
    }
}

class Staff extends Eployee {

    String tittle;

    Staff(String tittle, String office, int salary, int datehired, String name, String address, String phone, String email) {
        super(office, salary, datehired, name, address, phone, email);
        this.tittle = tittle;
    }

    void out() {
        super.out();
        System.out.println("- Tittle : " + tittle);
    }
}

public class BAI01 {

    public static void main(String[] args) {
        Student f1 = new Student("sophomore", "Le Van Tri", "K311/29 Truong Chinh", "0923879423", "levantri@gmail.com");
        f1.out();
        System.out.println("");
        Eployee f2 = new Eployee("Accounting Office", 100000, 30, "Nguyen Van Tuan", "K311/29 Dien Bien Phu", "024235235", "nguyenvantuan@gmail.com");
        f2.out();
        System.out.println("");
        Faculy f3 = new Faculy(7, "Manager", "Accounting Office", 70000, 28, "Nguyen Thi Hoa", "32/2 Ham Nghi", "093243523", "nguyenthihoa@gmail.com");
        f3.out();
        System.out.println("");
        Staff f4 = new Staff("Labor", "Labor Office", 60000, 30, "Nguyen Minh", "K29/7 Ha Huy Tap", "0325995235", "nguyenminh@gmail.com");
        f4.out();
    }
}
